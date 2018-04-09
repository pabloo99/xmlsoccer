import com.github.pabloo99.xmlsoccer.api.dto.*;
import com.github.pabloo99.xmlsoccer.api.service.XmlSoccerService;
import com.github.pabloo99.xmlsoccer.model.enums.Leagues;
import com.github.pabloo99.xmlsoccer.model.enums.Seasons;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.util.Assert;
import org.testng.annotations.Test;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@ContextConfiguration(locations = {"classpath:/spring/core-context-test.xml"})
@Slf4j
public class XmlSoccerServiceImplTest extends AbstractTestNGSpringContextTests {

    @Autowired
    XmlSoccerService xmlSoccerService;

    @Test
    public void testGetLiveScore() throws Exception {

        List<GetLiveScoreResultDto> test = xmlSoccerService.getLiveScore().
                stream().
                collect(Collectors.toList());

        Assert.notNull(test);

        log.info(test.toString());
    }

    @Test
    public void testGetLiveScoreByLeague() throws Exception {
        Collection<GetLiveScoreResultDto> test =
                xmlSoccerService.getLiveScoreByLeague(Leagues.SCOTTISH_PREMIER_LEAGUE.getParam());

        Assert.notNull(test);
        log.info(test.toString());
    }

    @Test
    public void testGetMatchEventsByFixtureMatchId() throws Exception {

        List<GetMatchEventsDto> test = xmlSoccerService.getMatchEventsByFixtureMatchId(380477).
                stream().
                collect(Collectors.toList());

        Assert.notNull(test);

        log.info(test.toString());
    }

    @Test
    public void testGetMatchLineupsEventsByFixtureMatchId() throws Exception {

        List<GetMatchLineupsDto> test = xmlSoccerService.getMatchLineupsByFixtureMatchId(380477).
                stream().
                collect(Collectors.toList());

        Assert.notNull(test);

        log.info(test.toString());
    }

    @Test
    public void testGetLeagueStandingsBySeason() throws Exception {
        List<GetLeagueStandingsResultDto> test = xmlSoccerService.getLeagueStandingsBySeason(
                Leagues.SCOTTISH_PREMIER_LEAGUE.getParam(), Seasons.SEASON_2014_2015.getParam()).
                stream().
                collect(Collectors.toList());

        Assert.notNull(test);

    }

    @Test
    public void testGetAllLeagues() throws Exception {
        List<GetAllLeaguesResultDto> test = xmlSoccerService.getAllLeagues().
                stream().
                collect(Collectors.toList());

        Assert.notNull(test);
    }

    @Test
    public void testGetPlayersByTeamId() throws Exception {
        List<GetPlayersResultDto> test = xmlSoccerService.getPlayersByTeam(52).
                stream().
                collect(Collectors.toList());

        Assert.notNull(test);
    }

    @Test
    public void testGetPlayerById() throws Exception {
        GetPlayersResultDto test = xmlSoccerService.getPlayersById(1384);

        Assert.isNull(test);
    }

    @Test
    public void testGetTopScorersByLeagueAndSeason() throws Exception {
        List<GetTopScorersResultDto> test =
                xmlSoccerService.getTopScorersByLeagueAndSeason(
                        Leagues.SCOTTISH_PREMIER_LEAGUE.getParam(), Seasons.SEASON_2014_2015.getParam()).
                        stream().
                        collect(Collectors.toList());

        Assert.notNull(test);
    }

    @Test
    public void testGetFixturesByLeagueAndSeason() throws Exception {
        List<GetFixturesResultDto> test = xmlSoccerService.getFixturesByLeagueAndSeason(
                Leagues.SCOTTISH_PREMIER_LEAGUE.getParam(), Seasons.SEASON_2014_2015.getParam()).
                stream().
                collect(Collectors.toList());

        Assert.notNull(test);
    }

    @Test
    public void testGetHistoricMatchesByLeagueAndSeason() throws Exception {
        List<GetHistoricMatchesResultDto> test = xmlSoccerService.getHistoricMatchesByLeagueAndSeason(
                Leagues.SCOTTISH_PREMIER_LEAGUE.getParam(), Seasons.SEASON_2014_2015.getParam()).
                stream().
                collect(Collectors.toList());

        Assert.notNull(test);
    }

    @Test
    public void testGetNextOddsByLeague() throws Exception {
        List<GetOddsResultDto> test = xmlSoccerService.getNextMatchOddsByLeague(
                Leagues.SCOTTISH_FIRST_DIVISION.getParam()).stream().
                collect(Collectors.toList());

        Assert.notNull(test);
    }

    @Test
    public void testGetAllTeams() throws Exception {
        List<GetTeamResultDto> test = xmlSoccerService.getAllTeams().
                stream().
                collect(Collectors.toList());

        Assert.notNull(test);
    }

    @Test
    public void testGetAllTeamsByLeagueAndSeason() throws Exception {
        List<GetTeamResultDto> test = xmlSoccerService.getAllTeamsByLeagueAndSeason(
                Leagues.SCOTTISH_PREMIER_LEAGUE.getParam(), Seasons.SEASON_2012_2013.getParam()).
                stream().
                collect(Collectors.toList());

        Assert.notNull(test);
    }

    @Test
    public void testGetTeamById() throws Exception {
        GetTeamResultDto test = xmlSoccerService.getTeam("Celtic");

        Assert.isNull(test);
    }

    @Test
    public void testCheckApiKey() throws Exception {
        String test = xmlSoccerService.checkApiKey("APIKEY");

        Assert.notNull(test);
    }

    @Test
    public void testGetAllOddsByFixtureMatchId() throws Exception {
        List<GetAllOddsResultDto> test = xmlSoccerService.getAllOddsByFixtureMatchId(362894).
                stream().
                collect(Collectors.toList());

        Assert.notNull(test);
    }
}