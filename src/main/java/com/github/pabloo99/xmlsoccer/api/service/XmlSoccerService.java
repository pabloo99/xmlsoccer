package com.github.pabloo99.xmlsoccer.api.service;


import com.github.pabloo99.xmlsoccer.api.dto.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;

/**
 * Created by pmazur on 2014-11-30.
 */
public interface XmlSoccerService {

    void setServiceUrl(String url);
    void setApiKey(String apiKey);

    String checkApiKey(String ApiKey);
    List<GetLiveScoreResultDto> getLiveScore();
    List<GetLiveScoreResultDto> getLiveScoreByLeague(String leagueName);

    List<GetLeagueStandingsResultDto> getLeagueStandingsBySeason(String leagueName, String season);

    List<GetAllLeaguesResultDto> getAllLeagues();

    XMLGregorianCalendar getEarliestMatchDatePerLeague(String leagueName);

    List<GetTeamResultDto> getAllTeams();
    List<GetTeamResultDto> getAllTeamsByLeagueAndSeason(String leagueName, String season);

    GetPlayersResultDto getPlayersById(Integer playerId);
    List<GetPlayersResultDto> getPlayersByTeam(Integer teamId);

    List<GetOddsResultDto> getAllOddsByFixtureMatchId(Integer fixtureMatchId);
    List<GetOddsResultDto> getOddsByFixtureMatchId(Integer fixtureMatchId);
    List<GetOddsResultDto> getNextMatchOddsByLeague(String leagueName);

    GetTeamResultDto getTeam(String teamName);

    List<GetTopScorersResultDto> getTopScorersByLeagueAndSeason(String leagueName, String season);
    List<GetTopScorersResultDto> getTopScorersByGropupId(Integer group);

    List<GetFixturesResultDto> getFixturesByDateInterval(String startDate, String endDate);
    List<GetFixturesResultDto> getFixturesByDateIntervalAndLeague(String leagueName, String startDate, String endDate);
    List<GetFixturesResultDto> getFixturesByDateIntervalAndTeam(Integer team_id, String startDate, String endDate);
    List<GetFixturesResultDto> getFixturesByLeagueAndSeason(String leagueName, String season);

    List<GetHistoricMatchesResultDto> getHistoricMatchesByFixtureMatchID(Integer fixtureMatchId);
    List<GetHistoricMatchesResultDto> getHistoricMatchesByID(Integer matchId);
    List<GetHistoricMatchesResultDto> getHistoricMatchesByLeagueAndDateInterval(String leagueName, String startDate, String endDate);
    List<GetHistoricMatchesResultDto> getHistoricMatchesByLeagueAndSeason(String leagueName, String season);
    List<GetHistoricMatchesResultDto> getHistoricMatchesByTeamAndDateInterval(Integer team_id, String startDate, String endDate);
    List<GetHistoricMatchesResultDto> getHistoricMatchesByTeamsAndDateInterval(Integer team_id1, Integer team_id2, String startDate, String endDate);
}
