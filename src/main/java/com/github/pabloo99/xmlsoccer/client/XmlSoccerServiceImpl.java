package com.github.pabloo99.xmlsoccer.client;


import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import com.github.pabloo99.xmlsoccer.api.dto.*;
import com.github.pabloo99.xmlsoccer.api.service.XmlSoccerService;
import com.github.pabloo99.xmlsoccer.webservice.*;
import com.github.pabloo99.xmlsoccer.model.xml.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by pmazur on 2014-11-30.
 */


public class XmlSoccerServiceImpl extends WebServiceGatewaySupport implements XmlSoccerService {

    private String apiKey;
    private Jaxb2Marshaller marshaller;

    @Setter
    private ModelMapper modelMapper;

    public XmlSoccerServiceImpl()
    {
        modelMapper = new ModelMapper();
        marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.github.pabloo99.xmlsoccer.webservice");
        setMarshaller(marshaller);
        setUnmarshaller(marshaller);
    }

    @Override
    public void setServiceUrl(String url)
    {
        setDefaultUri(url);
    }

    @Override
    public void setApiKey(String apiKey)
    {
        this.apiKey = apiKey;
    }

    @Override
    public String checkApiKey(String apiKey)
    {
        CheckApiKey request = new CheckApiKey();
        request.setApiKey(apiKey);

        CheckApiKeyResponse response = (CheckApiKeyResponse) getWebServiceTemplate().marshalSendAndReceive(
                request,
                new SoapActionCallback(
                        "http://xmlsoccer.com/CheckApiKey"));

        return response.getCheckApiKeyResult();
    }

    @Override
    public List<GetLiveScoreResultDto> getLiveScore() {

        GetLiveScore request = new GetLiveScore();
        request.setApiKey(apiKey);

        GetLiveScoreResponse response = (GetLiveScoreResponse) getWebServiceTemplate().marshalSendAndReceive(
                request,
                new SoapActionCallback(
                        "http://xmlsoccer.com/GetLiveScore"));

        GetLiveScoreResultXML getLiveScoreResultXML = response.getGetLiveScoreResult().getContent();

        Type listType = new TypeToken<List<GetLiveScoreResultDto>>() {}.getType();

        List<GetLiveScoreResultDto> getLiveScoreResultDto = modelMapper.map(getLiveScoreResultXML.getMatch(), listType);

        return getLiveScoreResultDto;
    }

    @Override
    public List<GetLiveScoreResultDto> getLiveScoreByLeague(String leagueName) {

        GetLiveScoreByLeague request = new GetLiveScoreByLeague();
        request.setApiKey(apiKey);
        request.setLeague(leagueName);

        GetLiveScoreByLeagueResponse response = (GetLiveScoreByLeagueResponse) getWebServiceTemplate().marshalSendAndReceive(
                request,
                new SoapActionCallback(
                        "http://xmlsoccer.com/GetLiveScoreByLeague"));

        GetLiveScoreResultXML getLiveScoreResultXML = response.getGetLiveScoreByLeagueResult().getContent();

        Type listType = new TypeToken<List<GetLiveScoreResultDto>>() {}.getType();

        List<GetLiveScoreResultDto> getLiveScoreResultDto = modelMapper.map(getLiveScoreResultXML.getMatch(), listType);

        return getLiveScoreResultDto;
    }

    @Override
    public List<GetLeagueStandingsResultDto> getLeagueStandingsBySeason(String leagueName,String season) {

        GetLeagueStandingsBySeason request = new GetLeagueStandingsBySeason();
        request.setApiKey(apiKey);
        request.setLeague(leagueName);
        request.setSeasonDateString(season);

        GetLeagueStandingsBySeasonResponse response = (GetLeagueStandingsBySeasonResponse) getWebServiceTemplate().marshalSendAndReceive(
                request,
                new SoapActionCallback(
                        "http://xmlsoccer.com/GetLeagueStandingsBySeason"));

        GetLeagueStandingsBySeasonResultXML getLeagueStandingsBySeasonResultXML = response.getGetLeagueStandingsBySeasonResult().getContent();

        if(getLeagueStandingsBySeasonResultXML.getTeamLeagueStanding()==null)
            return null;

        Type listType = new TypeToken<List<GetLeagueStandingsResultDto>>() {}.getType();

        List<GetLeagueStandingsResultDto> getLeagueStandingsResultDto = modelMapper.map(getLeagueStandingsBySeasonResultXML.getTeamLeagueStanding(), listType);

        return getLeagueStandingsResultDto;
    }

    @Override
    public List<GetAllLeaguesResultDto> getAllLeagues() {

        GetAllLeagues request = new GetAllLeagues();
        request.setApiKey(apiKey);

        GetAllLeaguesResponse response = (GetAllLeaguesResponse) getWebServiceTemplate().marshalSendAndReceive(
                request,
                new SoapActionCallback(
                        "http://xmlsoccer.com/GetAllLeagues"));

        GetAllLeaguesResultXML getAllLeaguesResultXML = response.getGetAllLeaguesResult().getContent();

        Type listType = new TypeToken<List<GetAllLeaguesResultDto>>() {}.getType();

        List<GetAllLeaguesResultDto> getAllLeaguesResultDto = modelMapper.map(getAllLeaguesResultXML.getLeague(),listType);

        return getAllLeaguesResultDto;
    }

    @Override
    public List<GetTeamResultDto> getAllTeams() {

        GetAllTeams request = new GetAllTeams();
        request.setApiKey(apiKey);

        GetAllTeamsResponse response = (GetAllTeamsResponse) getWebServiceTemplate().marshalSendAndReceive(
                request,
                new SoapActionCallback(
                        "http://xmlsoccer.com/GetAllTeams"));

        GetAllTeamsResultXML getAllTeamsResultXML = response.getGetAllTeamsResult().getContent();

        Type listType = new TypeToken<List<GetTeamResultDto>>() {}.getType();

        List<GetTeamResultDto> getAllTeamsResultDto = modelMapper.map(getAllTeamsResultXML.getTeam(),listType);

        return getAllTeamsResultDto;
    }

    @Override
    public List<GetTeamResultDto> getAllTeamsByLeagueAndSeason(String leagueName, String season) {

        GetAllTeamsByLeagueAndSeason request = new GetAllTeamsByLeagueAndSeason();
        request.setApiKey(apiKey);
        request.setLeague(leagueName);
        request.setSeasonDateString(season);

        GetAllTeamsByLeagueAndSeasonResponse response = (GetAllTeamsByLeagueAndSeasonResponse) getWebServiceTemplate().marshalSendAndReceive(
                request,
                new SoapActionCallback(
                        "http://xmlsoccer.com/GetAllTeamsByLeagueAndSeason"));

        GetAllTeamsResultXML getAllTeamsResultXML = response.getGetAllTeamsByLeagueAndSeasonResult().getContent();

        Type listType = new TypeToken<List<GetTeamResultDto>>() {}.getType();

        List<GetTeamResultDto> getAllTeamsResultDto = modelMapper.map(getAllTeamsResultXML.getTeam(),listType);

        return getAllTeamsResultDto;
    }

    @Override
    public GetPlayersResultDto getPlayersById(Integer playerId) {

        GetPlayerById request = new GetPlayerById();
        request.setApiKey(apiKey);
        request.setPlayerId(playerId);

        GetPlayerByIdResponse response = (GetPlayerByIdResponse) getWebServiceTemplate().marshalSendAndReceive(
                request,
                new SoapActionCallback(
                        "http://xmlsoccer.com/GetPlayerById"));

        GetPlayersByTeamResultXML getPlayersByTeamResultXML = response.getGetPlayerByIdResult().getContent();

        if(getPlayersByTeamResultXML.getPlayer().isEmpty())
            return null;

        Type listType = new TypeToken<List<GetPlayersResultDto>>() {}.getType();

        List<GetPlayersResultDto> getPlayersResultDto = modelMapper.map(getPlayersByTeamResultXML.getPlayer(),listType);

        return getPlayersResultDto.get(0);
    }

    @Override
    public List<GetPlayersResultDto> getPlayersByTeam(Integer teamId) {

        GetPlayersByTeam request = new GetPlayersByTeam();
        request.setApiKey(apiKey);
        request.setTeamId(teamId.toString());

        GetPlayersByTeamResponse response = (GetPlayersByTeamResponse) getWebServiceTemplate().marshalSendAndReceive(
                request,
                new SoapActionCallback(
                        "http://xmlsoccer.com/GetPlayersByTeam"));

        GetPlayersByTeamResultXML getPlayersByTeamResultXML = response.getGetPlayersByTeamResult().getContent();

        Type listType = new TypeToken<List<GetPlayersResultDto>>() {}.getType();

        List<GetPlayersResultDto> getPlayersResultDto = modelMapper.map(getPlayersByTeamResultXML.getPlayer(),listType);

        return getPlayersResultDto;
    }

    @Override
    public List<GetOddsResultDto> getAllOddsByFixtureMatchId(Integer fixtureMatchId) {

        GetAllOddsByFixtureMatchId request = new GetAllOddsByFixtureMatchId();
        request.setApiKey(apiKey);
        request.setFixtureMatchId(fixtureMatchId);

        GetAllOddsByFixtureMatchIdResponse response = (GetAllOddsByFixtureMatchIdResponse) getWebServiceTemplate().marshalSendAndReceive(
                request,
                new SoapActionCallback(
                        "http://xmlsoccer.com/GetAllOddsByFixtureMatchId"));

        GetOddsByFixtureMatchIdResultXML getOddsByFixtureMatchIdResultXML = response.getGetAllOddsByFixtureMatchIdResult().getContent();

        Type listType = new TypeToken<List<GetOddsResultDto>>() {}.getType();

        List<GetOddsResultDto> getOddsResultDto = modelMapper.map(getOddsByFixtureMatchIdResultXML.getOdds(),listType);

        return getOddsResultDto;
    }

    @Override
    public List<GetOddsResultDto> getOddsByFixtureMatchId(Integer fixtureMatchId) {

        GetOddsByFixtureMatchId request = new GetOddsByFixtureMatchId();
        request.setApiKey(apiKey);
        request.setFixtureMatchId(fixtureMatchId.toString());

        GetOddsByFixtureMatchIdResponse response = (GetOddsByFixtureMatchIdResponse) getWebServiceTemplate().marshalSendAndReceive(
                request,
                new SoapActionCallback(
                        "http://xmlsoccer.com/GetOddsByFixtureMatchId"));

        GetOddsByFixtureMatchIdResultXML getOddsByFixtureMatchIdResultXML = response.getGetOddsByFixtureMatchIdResult().getContent();

        Type listType = new TypeToken<List<GetOddsResultDto>>() {}.getType();

        List<GetOddsResultDto> getOddsResultDto = modelMapper.map(getOddsByFixtureMatchIdResultXML.getOdds(),listType);

        return getOddsResultDto;
    }

    @Override
    public List<GetOddsResultDto> getNextMatchOddsByLeague(String leagueName) {

        GetNextMatchOddsByLeague request = new GetNextMatchOddsByLeague();
        request.setApiKey(apiKey);
        request.setLeague(leagueName);

        GetNextMatchOddsByLeagueResponse response = (GetNextMatchOddsByLeagueResponse) getWebServiceTemplate().marshalSendAndReceive(
                request,
                new SoapActionCallback(
                        "http://xmlsoccer.com/GetNextMatchOddsByLeague"));

        GetOddsByFixtureMatchIdResultXML getOddsByFixtureMatchIdResultXML = response.getGetNextMatchOddsByLeagueResult().getContent();

        Type listType = new TypeToken<List<GetOddsResultDto>>() {}.getType();

        List<GetOddsResultDto> getOddsResultDto = modelMapper.map(getOddsByFixtureMatchIdResultXML.getOdds(),listType);

        return getOddsResultDto;

    }

    @Override
    public GetTeamResultDto getTeam(String teamName) {

        GetTeam request = new GetTeam();
        request.setApiKey(apiKey);
        request.setTeamName(teamName);

        GetTeamResponse response = (GetTeamResponse) getWebServiceTemplate().marshalSendAndReceive(
                request,
                new SoapActionCallback(
                        "http://xmlsoccer.com/GetTeam"));

        GetTeamResultXML getTeamResultXML = response.getGetTeamResult().getContent();

        if(getTeamResultXML.getTeam()==null)
            return null;

        GetTeamResultDto getTeamResultDto = modelMapper.map(getTeamResultXML.getTeam(),GetTeamResultDto.class);

        return getTeamResultDto;
    }

    @Override
    public List<GetTopScorersResultDto> getTopScorersByLeagueAndSeason(String leagueName, String season) {

        GetTopScorersByLeagueAndSeason request = new GetTopScorersByLeagueAndSeason();
        request.setApiKey(apiKey);
        request.setLeague(leagueName);
        request.setSeasonDateString(season);

        GetTopScorersByLeagueAndSeasonResponse response = (GetTopScorersByLeagueAndSeasonResponse) getWebServiceTemplate().marshalSendAndReceive(
                request,
                new SoapActionCallback(
                        "http://xmlsoccer.com/GetTopScorersByLeagueAndSeason"));

        GetTopScorersResultXML getTopScorersResultXML = response.getGetTopScorersByLeagueAndSeasonResult().getContent();

        Type listType = new TypeToken<List<GetTopScorersResultDto>>() {}.getType();

        List<GetTopScorersResultDto> getTopScorersResultDto = modelMapper.map(getTopScorersResultXML.getTopscorer(),listType);

        return getTopScorersResultDto;
    }

    @Override
    public List<GetTopScorersResultDto> getTopScorersByGropupId(Integer group) {

        GetTopScorersByGroupId request = new GetTopScorersByGroupId();
        request.setApiKey(apiKey);
        request.setGroupId(group);

        GetTopScorersByGroupIdResponse response = (GetTopScorersByGroupIdResponse) getWebServiceTemplate().marshalSendAndReceive(
                request,
                new SoapActionCallback(
                        "http://xmlsoccer.com/GetTopScorersByGroupId"));

        GetTopScorersResultXML getTopScorersResultXML = response.getGetTopScorersByGroupIdResult().getContent();

        Type listType = new TypeToken<List<GetTopScorersResultDto>>() {}.getType();

        List<GetTopScorersResultDto> getTopScorersResultDto = modelMapper.map(getTopScorersResultXML.getTopscorer(),listType);

        return getTopScorersResultDto;
    }

    @Override
    public List<GetFixturesResultDto> getFixturesByDateInterval(String startDate, String endDate) {

        GetFixturesByDateInterval request = new GetFixturesByDateInterval();
        request.setApiKey(apiKey);
        request.setStartDateString(startDate);
        request.setEndDateString(endDate);

        GetFixturesByDateIntervalResponse response = (GetFixturesByDateIntervalResponse) getWebServiceTemplate().marshalSendAndReceive(
                request,
                new SoapActionCallback(
                        "http://xmlsoccer.com/GetFixturesByDateInterval"));

        GetFixturesResultXML getFixturesResultXML = response.getGetFixturesByDateIntervalResult().getContent();

        Type listType = new TypeToken<List<GetFixturesResultDto>>() {}.getType();

        List<GetFixturesResultDto> getFixturesResultDto = modelMapper.map(getFixturesResultXML.getMatch(),listType);

        return getFixturesResultDto;
    }

    @Override
    public List<GetFixturesResultDto> getFixturesByDateIntervalAndLeague(String leagueName, String startDate, String endDate) {

        GetFixturesByDateIntervalAndLeague request = new GetFixturesByDateIntervalAndLeague();
        request.setApiKey(apiKey);
        request.setStartDateString(startDate);
        request.setEndDateString(endDate);
        request.setLeague(leagueName);

        GetFixturesByDateIntervalAndLeagueResponse response = (GetFixturesByDateIntervalAndLeagueResponse) getWebServiceTemplate().marshalSendAndReceive(
                request,
                new SoapActionCallback(
                        "http://xmlsoccer.com/GetFixturesByDateIntervalAndLeague"));

        GetFixturesResultXML getFixturesResultXML = response.getGetFixturesByDateIntervalAndLeagueResult().getContent();

        Type listType = new TypeToken<List<GetFixturesResultDto>>() {}.getType();

        List<GetFixturesResultDto> getFixturesResultDto = modelMapper.map(getFixturesResultXML.getMatch(),listType);

        return getFixturesResultDto;

    }

    @Override
    public List<GetFixturesResultDto> getFixturesByDateIntervalAndTeam(Integer team_id, String startDate, String endDate) {

        GetFixturesByDateIntervalAndTeam request = new GetFixturesByDateIntervalAndTeam();
        request.setApiKey(apiKey);
        request.setStartDateString(startDate);
        request.setEndDateString(endDate);
        request.setTeamId(team_id.toString());

        GetFixturesByDateIntervalAndTeamResponse response = (GetFixturesByDateIntervalAndTeamResponse) getWebServiceTemplate().marshalSendAndReceive(
                request,
                new SoapActionCallback(
                        "http://xmlsoccer.com/GetFixturesByDateIntervalAndTeam"));

        GetFixturesResultXML getFixturesResultXML = response.getGetFixturesByDateIntervalAndTeamResult().getContent();

        Type listType = new TypeToken<List<GetFixturesResultDto>>() {}.getType();

        List<GetFixturesResultDto> getFixturesResultDto = modelMapper.map(getFixturesResultXML.getMatch(),listType);

        return getFixturesResultDto;

    }

    @Override
    public List<GetFixturesResultDto> getFixturesByLeagueAndSeason(String leagueName, String season) {

        GetFixturesByLeagueAndSeason request = new GetFixturesByLeagueAndSeason();
        request.setApiKey(apiKey);
        request.setLeague(leagueName);
        request.setSeasonDateString(season);

        GetFixturesByLeagueAndSeasonResponse response = (GetFixturesByLeagueAndSeasonResponse) getWebServiceTemplate().marshalSendAndReceive(
                request,
                new SoapActionCallback(
                        "http://xmlsoccer.com/GetFixturesByLeagueAndSeason"));

        GetFixturesResultXML getFixturesResultXML = response.getGetFixturesByLeagueAndSeasonResult().getContent();

        Type listType = new TypeToken<List<GetFixturesResultDto>>() {}.getType();

        List<GetFixturesResultDto> getFixturesResultDto = modelMapper.map(getFixturesResultXML.getMatch(),listType);

        return getFixturesResultDto;
    }

    @Override
    public List<GetHistoricMatchesResultDto> getHistoricMatchesByFixtureMatchID(Integer fixtureMatchId) {

        GetHistoricMatchesByFixtureMatchID request = new GetHistoricMatchesByFixtureMatchID();
        request.setApiKey(apiKey);
        request.setId(fixtureMatchId);

        GetHistoricMatchesByFixtureMatchIDResponse response = (GetHistoricMatchesByFixtureMatchIDResponse) getWebServiceTemplate().marshalSendAndReceive(
                request,
                new SoapActionCallback(
                        "http://xmlsoccer.com/GetHistoricMatchesByFixtureMatchID"));

        GetHistoricMatchesResultXML getHistoricMatchesResultXML = response.getGetHistoricMatchesByFixtureMatchIDResult().getContent();

        Type listType = new TypeToken<List<GetHistoricMatchesResultDto>>() {}.getType();

        List<GetHistoricMatchesResultDto> getHistoricMatchesResultDto = modelMapper.map(getHistoricMatchesResultXML.getMatch(),listType);

        return getHistoricMatchesResultDto;
    }

    @Override
    public List<GetHistoricMatchesResultDto> getHistoricMatchesByID(Integer matchId) {

        GetHistoricMatchesByID request = new GetHistoricMatchesByID();
        request.setApiKey(apiKey);
        request.setId(matchId);

        GetHistoricMatchesByIDResponse response = (GetHistoricMatchesByIDResponse) getWebServiceTemplate().marshalSendAndReceive(
                request,
                new SoapActionCallback(
                        "http://xmlsoccer.com/GetHistoricMatchesByID"));

        GetHistoricMatchesResultXML getHistoricMatchesResultXML = response.getGetHistoricMatchesByIDResult().getContent();

        Type listType = new TypeToken<List<GetHistoricMatchesResultDto>>() {}.getType();

        List<GetHistoricMatchesResultDto> getHistoricMatchesResultDto = modelMapper.map(getHistoricMatchesResultXML.getMatch(),listType);

        return getHistoricMatchesResultDto;
    }

    @Override
    public List<GetHistoricMatchesResultDto> getHistoricMatchesByLeagueAndDateInterval(String leagueName, String startDate, String endDate) {

        GetHistoricMatchesByLeagueAndDateInterval request = new GetHistoricMatchesByLeagueAndDateInterval();
        request.setApiKey(apiKey);
        request.setStartDateString(startDate);
        request.setEndDateString(endDate);

        GetHistoricMatchesByLeagueAndDateIntervalResponse response = (GetHistoricMatchesByLeagueAndDateIntervalResponse) getWebServiceTemplate().marshalSendAndReceive(
                request,
                new SoapActionCallback(
                        "http://xmlsoccer.com/GetHistoricMatchesByLeagueAndDateInterval"));

        GetHistoricMatchesResultXML getHistoricMatchesResultXML = response.getGetHistoricMatchesByLeagueAndDateIntervalResult().getContent();

        Type listType = new TypeToken<List<GetHistoricMatchesResultDto>>() {}.getType();

        List<GetHistoricMatchesResultDto> getHistoricMatchesResultDto = modelMapper.map(getHistoricMatchesResultXML.getMatch(),listType);

        return getHistoricMatchesResultDto;
    }

    @Override
    public List<GetHistoricMatchesResultDto> getHistoricMatchesByLeagueAndSeason(String leagueName, String season) {

        GetHistoricMatchesByLeagueAndSeason request = new GetHistoricMatchesByLeagueAndSeason();
        request.setApiKey(apiKey);
        request.setSeasonDateString(season);
        request.setLeague(leagueName);

        GetHistoricMatchesByLeagueAndSeasonResponse response = (GetHistoricMatchesByLeagueAndSeasonResponse) getWebServiceTemplate().marshalSendAndReceive(
                request,
                new SoapActionCallback(
                        "http://xmlsoccer.com/GetHistoricMatchesByLeagueAndSeason"));

        GetHistoricMatchesResultXML getHistoricMatchesResultXML = response.getGetHistoricMatchesByLeagueAndSeasonResult().getContent();

        Type listType = new TypeToken<List<GetHistoricMatchesResultDto>>() {}.getType();

        List<GetHistoricMatchesResultDto> getHistoricMatchesResultDto = modelMapper.map(getHistoricMatchesResultXML.getMatch(),listType);

        return getHistoricMatchesResultDto;
    }

    @Override
    public List<GetHistoricMatchesResultDto> getHistoricMatchesByTeamAndDateInterval(Integer team_id, String startDate, String endDate) {

        GetHistoricMatchesByTeamAndDateInterval request = new GetHistoricMatchesByTeamAndDateInterval();
        request.setApiKey(apiKey);
        request.setStartDateString(startDate);
        request.setEndDateString(endDate);
        request.setTeamId(team_id.toString());

        GetHistoricMatchesByTeamAndDateIntervalResponse response = (GetHistoricMatchesByTeamAndDateIntervalResponse) getWebServiceTemplate().marshalSendAndReceive(
                request,
                new SoapActionCallback(
                        "http://xmlsoccer.com/GetHistoricMatchesByTeamAndDateInterval"));

        GetHistoricMatchesResultXML getHistoricMatchesResultXML = response.getGetHistoricMatchesByTeamAndDateIntervalResult().getContent();

        Type listType = new TypeToken<List<GetHistoricMatchesResultDto>>() {}.getType();

        List<GetHistoricMatchesResultDto> getHistoricMatchesResultDto = modelMapper.map(getHistoricMatchesResultXML.getMatch(),listType);

        return getHistoricMatchesResultDto;
    }

    @Override
    public List<GetHistoricMatchesResultDto> getHistoricMatchesByTeamsAndDateInterval(Integer team_id1, Integer team_id2, String startDate, String endDate) {

        GetHistoricMatchesByTeamsAndDateInterval request = new GetHistoricMatchesByTeamsAndDateInterval();
        request.setApiKey(apiKey);
        request.setStartDateString(startDate);
        request.setEndDateString(endDate);
        request.setTeam1Id(team_id1.toString());
        request.setTeam2Id(team_id2.toString());

        GetHistoricMatchesByTeamsAndDateIntervalResponse response = (GetHistoricMatchesByTeamsAndDateIntervalResponse) getWebServiceTemplate().marshalSendAndReceive(
                request,
                new SoapActionCallback(
                        "http://xmlsoccer.com/GetHistoricMatchesByTeamsAndDateInterval"));

        GetHistoricMatchesResultXML getHistoricMatchesResultXML = response.getGetHistoricMatchesByTeamsAndDateIntervalResult().getContent();

        Type listType = new TypeToken<List<GetHistoricMatchesResultDto>>() {}.getType();

        List<GetHistoricMatchesResultDto> getHistoricMatchesResultDto = modelMapper.map(getHistoricMatchesResultXML.getMatch(),listType);

        return getHistoricMatchesResultDto;
    }

    @Override
    public XMLGregorianCalendar getEarliestMatchDatePerLeague(String leagueName) {

        GetEarliestMatchDatePerLeague request = new GetEarliestMatchDatePerLeague();
        request.setApiKey(apiKey);
        request.setLeague(leagueName);

        GetEarliestMatchDatePerLeagueResponse response = (GetEarliestMatchDatePerLeagueResponse) getWebServiceTemplate().marshalSendAndReceive(
                request,
                new SoapActionCallback(
                        "http://xmlsoccer.com/GetEarliestMatchDatePerLeague"));

        GetEarliestMatchDatePerLeagueXML getEarliestMatchDatePerLeagueXML = response.getGetEarliestMatchDatePerLeagueResult().getContent();

        if(getEarliestMatchDatePerLeagueXML.getLeagueInformation()==null)
            return null;

        return getEarliestMatchDatePerLeagueXML.getLeagueInformation().getDate();
    }
}
