package com.github.pabloo99.xmlsoccer.api.service;

import com.github.pabloo99.xmlsoccer.api.dto.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Collection;

public interface XmlSoccerService {

    void setServiceUrl(String url);

    void setApiKey(String apiKey);

    String checkApiKey(String apiKey);

    Collection<GetLiveScoreResultDto> getLiveScore();

    Collection<GetLiveScoreResultDto> getLiveScoreByLeague(String leagueName);

    Collection<GetLeagueStandingsResultDto> getLeagueStandingsBySeason(String leagueName, String season);

    Collection<GetAllLeaguesResultDto> getAllLeagues();

    XMLGregorianCalendar getEarliestMatchDatePerLeague(String leagueName);

    Collection<GetTeamResultDto> getAllTeams();

    Collection<GetTeamResultDto> getAllTeamsByLeagueAndSeason(String leagueName, String season);

    GetPlayersResultDto getPlayersById(Integer playerId);

    Collection<GetPlayersResultDto> getPlayersByTeam(Integer teamId);

    Collection<GetAllOddsResultDto> getAllOddsByFixtureMatchId(Integer fixtureMatchId);

    Collection<GetOddsResultDto> getOddsByFixtureMatchId(Integer fixtureMatchId);

    Collection<GetOddsResultDto> getNextMatchOddsByLeague(String leagueName);

    GetTeamResultDto getTeam(String teamName);

    Collection<GetTopScorersResultDto> getTopScorersByLeagueAndSeason(String leagueName, String season);

    Collection<GetTopScorersResultDto> getTopScorersByGroupId(Integer group);

    Collection<GetFixturesResultDto> getFixturesByDateInterval(String startDate, String endDate);

    Collection<GetFixturesResultDto> getFixturesByDateIntervalAndLeague(String leagueName, String startDate, String endDate);

    Collection<GetFixturesResultDto> getFixturesByDateIntervalAndTeam(Integer teamId, String startDate, String endDate);

    Collection<GetFixturesResultDto> getFixturesByLeagueAndSeason(String leagueName, String season);

    Collection<GetHistoricMatchesResultDto> getHistoricMatchesByFixtureMatchID(Integer fixtureMatchId);

    Collection<GetHistoricMatchesResultDto> getHistoricMatchesByID(Integer matchId);

    Collection<GetHistoricMatchesResultDto> getHistoricMatchesByLeagueAndDateInterval(String leagueName, String startDate, String endDate);

    Collection<GetHistoricMatchesResultDto> getHistoricMatchesByLeagueAndSeason(String leagueName, String season);

    Collection<GetHistoricMatchesResultDto> getHistoricMatchesByTeamAndDateInterval(Integer teamId, String startDate, String endDate);

    Collection<GetHistoricMatchesResultDto> getHistoricMatchesByTeamsAndDateInterval(Integer teamId1, Integer teamId2, String startDate, String endDate);
}
