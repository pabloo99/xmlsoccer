import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.util.Assert;
import org.testng.annotations.Test;
import com.github.pabloo99.xmlsoccer.api.dto.*;
import com.github.pabloo99.xmlsoccer.api.service.XmlSoccerService;
import com.github.pabloo99.xmlsoccer.model.enums.Leagues;
import com.github.pabloo99.xmlsoccer.model.enums.Seasons;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;

@ContextConfiguration(locations = {"classpath:/spring/core-context-test.xml"})
@Slf4j
public class XmlSoccerServiceImplTest extends AbstractTestNGSpringContextTests {

    @Autowired
    XmlSoccerService xmlSoccerService;

    @Test
    public void testGetLiveScore() throws Exception {

        List<GetLiveScoreResultDto> test = xmlSoccerService.getLiveScore();

        Assert.notNull(test);

        log.info(test.toString());
    }

    @Test
    public void testGetLiveScoreByLeague() throws Exception {
        List<GetLiveScoreResultDto> test = xmlSoccerService.getLiveScoreByLeague(Leagues.SCOTLAND_SCOTTISH_FIRST_DIVISION.getParam());

        Assert.notNull(test);
        log.info(test.toString());
    }

    @Test
    public void testGetLeagueStandingsBySeason() throws Exception {
        List<GetLeagueStandingsResultDto> test = xmlSoccerService.getLeagueStandingsBySeason(Leagues.SCOTLAND_SCOTTISH_FIRST_DIVISION.getParam(), Seasons.SEASON_2014_2015.getParam());

        Assert.isNull(test);

    }

    @Test
    public void testGetAllLeagues() throws Exception {
        List<GetAllLeaguesResultDto> test = xmlSoccerService.getAllLeagues();

        Assert.notNull(test);
    }

    @Test
    public void
    testGetPlayersByTeamId() throws Exception {
        List<GetPlayersResultDto> test = xmlSoccerService.getPlayersByTeam(52);

        Assert.notNull(test);
    }

    @Test
    public void testGetPlayerById() throws Exception {
        GetPlayersResultDto test = xmlSoccerService.getPlayersById(1384);

        Assert.isNull(test);
    }

    @Test
    public void testGetTopScorersByLeagueAndSeason() throws Exception {
        List<GetTopScorersResultDto> test = xmlSoccerService.getTopScorersByLeagueAndSeason(Leagues.SCOTLAND_SCOTTISH_PREMIER_LEAGUE.getParam(),Seasons.SEASON_2014_2015.getParam());

        Assert.notNull(test);
    }

    @Test
    public void testGetFixturesByLeagueAndSeason() throws Exception {
        List<GetFixturesResultDto> test = xmlSoccerService.getFixturesByLeagueAndSeason(Leagues.SCOTLAND_SCOTTISH_PREMIER_LEAGUE.getParam(),Seasons.SEASON_2014_2015.getParam());

        Assert.notNull(test);
    }

    @Test
    public void testGetHistoricMatchesByLeagueAndSeason() throws Exception {
        List<GetHistoricMatchesResultDto> test = xmlSoccerService.getHistoricMatchesByLeagueAndSeason(Leagues.SCOTLAND_SCOTTISH_PREMIER_LEAGUE.getParam(),Seasons.SEASON_2014_2015.getParam());

        Assert.notNull(test);
    }

    @Test
    public void testGetNextOddsByLeague() throws Exception {
        List<GetOddsResultDto> test = xmlSoccerService.getNextMatchOddsByLeague(Leagues.SCOTLAND_SCOTTISH_PREMIER_LEAGUE.getParam());

        Assert.notNull(test);
    }

    @Test
    public void testGetAllTeams() throws Exception {
        List<GetTeamResultDto> test = xmlSoccerService.getAllTeams();

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
    public void testGetEatliestMatchDatePerLeague() throws Exception {
        XMLGregorianCalendar test = xmlSoccerService.getEarliestMatchDatePerLeague(Leagues.SCOTLAND_SCOTTISH_PREMIER_LEAGUE.getParam());

        Assert.isNull(test);
    }
}