package com.github.pabloo99.xmlsoccer.model.xml;

import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "odds"
})
@XmlRootElement(name = "XMLSOCCER.COM")
@Data
public class GetOddsByFixtureMatchIdResultXML {

    @XmlElement(name = "Odds")
    protected List<Odds> odds;

    public List<Odds> getOdds() {
        if (odds == null) {
            odds = new ArrayList<Odds>();
        }
        return this.odds;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "fixtureMatchId",
        "dateCreate",
        "_10BetHomeHome",
        "_10BetHomeUrl",
        "_10BetHomeAway",
        "_10BetHomeDraw",
        "betAtHomeHome",
        "betAtHomeUrl",
        "betAtHomeAway",
        "betAtHomeDraw",
        "bet365Url",
        "bet365Home",
        "bet365Away",
        "bet365Draw",
        "betVictorHome",
        "betVictorUrl",
        "betVictorAway",
        "betVictorDraw",
        "bwinHome",
        "bwinUrl",
        "bwinAway",
        "bwinDraw",
        "dafabetHome",
        "dafabetUrl",
        "databetAway",
        "dafabetDraw",
        "dafabetAway",
        "ladbrokesHome",
        "ladbrokesUrl",
        "ladbrokesAway",
        "ladbrokesDraw",
        "marathonBetHome",
        "marathonBetUrl",
        "marathonBetAway",
        "marathonBetDraw",
        "myBetHome",
        "myBetUrl",
        "myBetAway",
        "myBetDraw",
        "nordicBetHome",
        "nordicBetUrl",
        "nordicBetAway",
        "nordicBetDraw",
        "paddyPowerHome",
        "paddyPowerUrl",
        "paddyPowerAway",
        "paddyPowerDraw",
        "pinnacleSportsHome",
        "pinnacleSportsUrl",
        "pinnacleSportsAway",
        "pinnacleSportsDraw",
        "sboBetHome",
        "sboBetUrl",
        "sboBetAway",
        "sboBetDraw",
        "unibetHome",
        "unibetUrl",
        "unibetAway",
        "unibetDraw",
        "_12BetHome",
        "_12BetUrl",
        "_12BetDraw",
        "_12BetAway",
        "_188BetHome",
        "_188BetUrl",
        "_188BetDraw",
        "_188BetAway",
        "_5DimesHome",
        "_5DimesUrl",
        "_5DimesDraw",
        "_5DimesAway",
        "_888SportHome",
        "_888SportUrl",
        "_888SportDraw",
        "_888SportAway",
        "bestBetHome",
        "bestBetUrl",
        "bestBetDraw",
        "bestBetAway",
        "betbooHome",
        "betbooUrl",
        "betbooDraw",
        "betbooAway",
        "betwayHome",
        "betwayUrl",
        "betwayDraw",
        "betwayAway",
        "betfairHome",
        "betfairUrl",
        "betfairDraw",
        "betfairAway",
        "expectHome",
        "expectDraw",
        "expectUrl",
        "expectAway",
        "betsafeHome",
        "betsafeUrl",
        "betsafeDraw",
        "betsafeAway",
        "interwettenHome",
        "interwettenUrl",
        "interwettenDraw",
        "interwettenAway",
        "williamHillHome",
        "williamHillUrl",
        "williamHillDraw",
        "williamHillAway",
        "betclicHome",
        "betclicDraw",
        "betclicAway",
        "betclicUrl",
        "blueSquareHome",
        "blueSquareDraw",
        "blueSquareAway",
        "blueSquareUrl",
        "canBetHome",
        "canBetDraw",
        "canBetAway",
        "canBetUrl",
        "comeOnHome",
        "comeOnDraw",
        "comeOnAway",
        "comeOnUrl",
        "coralHome",
        "coralDraw",
        "coralAway",
        "coralUrl",
        "doxXbetHome",
        "doxXbetDraw",
        "doxXbetAway",
        "doxXbetUrl",
        "fortunaWinHome",
        "fortunaWinDraw",
        "fortunaWinAway",
        "fortunaWinUrl",
        "tipicoHome",
        "tipicoDraw",
        "tipicoAway",
        "tipicoUrl"
    })
    @Data
    public static class Odds {

        @XmlElement(name = "Id")
        protected Integer id;
        @XmlElement(name = "FixtureMatch_Id")
        protected Integer fixtureMatchId;
        @XmlElement(name = "Date_Create")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar dateCreate;
        @XmlElement(name = "_10Bet_Home_Home")
        protected String _10BetHomeHome;
        @XmlElement(name = "_10Bet_Home_Url")
        protected String _10BetHomeUrl;
        @XmlElement(name = "_10Bet_Home_Away")
        protected String _10BetHomeAway;
        @XmlElement(name = "_10Bet_Home_Draw")
        protected String _10BetHomeDraw;
        @XmlElement(name = "Bet_At_Home_Home")
        protected String betAtHomeHome;
        @XmlElement(name = "Bet_At_Home_Url")
        protected String betAtHomeUrl;
        @XmlElement(name = "Bet_At_Home_Away")
        protected String betAtHomeAway;
        @XmlElement(name = "Bet_At_Home_Draw")
        protected String betAtHomeDraw;
        @XmlElement(name = "Bet365_Url")
        protected String bet365Url;
        @XmlElement(name = "Bet365_Home")
        protected String bet365Home;
        @XmlElement(name = "Bet365_Away")
        protected String bet365Away;
        @XmlElement(name = "Bet365_Draw")
        protected String bet365Draw;
        @XmlElement(name = "BetVictor_Home")
        protected String betVictorHome;
        @XmlElement(name = "BetVictor_Url")
        protected String betVictorUrl;
        @XmlElement(name = "BetVictor_Away")
        protected String betVictorAway;
        @XmlElement(name = "BetVictor_Draw")
        protected String betVictorDraw;
        @XmlElement(name = "Bwin_Home")
        protected String bwinHome;
        @XmlElement(name = "Bwin_Url")
        protected String bwinUrl;
        @XmlElement(name = "Bwin_Away")
        protected String bwinAway;
        @XmlElement(name = "Bwin_Draw")
        protected String bwinDraw;
        @XmlElement(name = "Dafabet_Home")
        protected String dafabetHome;
        @XmlElement(name = "Dafabet_Url")
        protected String dafabetUrl;
        @XmlElement(name = "Databet_Away")
        protected String databetAway;
        @XmlElement(name = "Dafabet_Draw")
        protected String dafabetDraw;
        @XmlElement(name = "Dafabet_Away")
        protected String dafabetAway;
        @XmlElement(name = "Ladbrokes_Home")
        protected String ladbrokesHome;
        @XmlElement(name = "Ladbrokes_Url")
        protected String ladbrokesUrl;
        @XmlElement(name = "Ladbrokes_Away")
        protected String ladbrokesAway;
        @XmlElement(name = "Ladbrokes_Draw")
        protected String ladbrokesDraw;
        @XmlElement(name = "MarathonBet_Home")
        protected String marathonBetHome;
        @XmlElement(name = "MarathonBet_Url")
        protected String marathonBetUrl;
        @XmlElement(name = "MarathonBet_Away")
        protected String marathonBetAway;
        @XmlElement(name = "MarathonBet_Draw")
        protected String marathonBetDraw;
        @XmlElement(name = "MyBet_Home")
        protected String myBetHome;
        @XmlElement(name = "MyBet_Url")
        protected String myBetUrl;
        @XmlElement(name = "MyBet_Away")
        protected String myBetAway;
        @XmlElement(name = "MyBet_Draw")
        protected String myBetDraw;
        @XmlElement(name = "NordicBet_Home")
        protected String nordicBetHome;
        @XmlElement(name = "NordicBet_Url")
        protected String nordicBetUrl;
        @XmlElement(name = "NordicBet_Away")
        protected String nordicBetAway;
        @XmlElement(name = "NordicBet_Draw")
        protected String nordicBetDraw;
        @XmlElement(name = "PaddyPower_Home")
        protected String paddyPowerHome;
        @XmlElement(name = "PaddyPower_Url")
        protected String paddyPowerUrl;
        @XmlElement(name = "PaddyPower_Away")
        protected String paddyPowerAway;
        @XmlElement(name = "PaddyPower_Draw")
        protected String paddyPowerDraw;
        @XmlElement(name = "PinnacleSports_Home")
        protected String pinnacleSportsHome;
        @XmlElement(name = "PinnacleSports_Url")
        protected String pinnacleSportsUrl;
        @XmlElement(name = "PinnacleSports_Away")
        protected String pinnacleSportsAway;
        @XmlElement(name = "PinnacleSports_Draw")
        protected String pinnacleSportsDraw;
        @XmlElement(name = "SBOBet_Home")
        protected String sboBetHome;
        @XmlElement(name = "SBOBet_Url")
        protected String sboBetUrl;
        @XmlElement(name = "SBOBet_Away")
        protected String sboBetAway;
        @XmlElement(name = "SBOBet_Draw")
        protected String sboBetDraw;
        @XmlElement(name = "Unibet_Home")
        protected String unibetHome;
        @XmlElement(name = "Unibet_Url")
        protected String unibetUrl;
        @XmlElement(name = "Unibet_Away")
        protected String unibetAway;
        @XmlElement(name = "Unibet_Draw")
        protected String unibetDraw;
        @XmlElement(name = "_12Bet_Home")
        protected String _12BetHome;
        @XmlElement(name = "_12Bet_Url")
        protected String _12BetUrl;
        @XmlElement(name = "_12Bet_Draw")
        protected String _12BetDraw;
        @XmlElement(name = "_12Bet_Away")
        protected String _12BetAway;
        @XmlElement(name = "_188Bet_Home")
        protected String _188BetHome;
        @XmlElement(name = "_188Bet_Url")
        protected String _188BetUrl;
        @XmlElement(name = "_188Bet_Draw")
        protected String _188BetDraw;
        @XmlElement(name = "_188Bet_Away")
        protected String _188BetAway;
        @XmlElement(name = "_5Dimes_Home")
        protected String _5DimesHome;
        @XmlElement(name = "_5Dimes_Url")
        protected String _5DimesUrl;
        @XmlElement(name = "_5Dimes_Draw")
        protected String _5DimesDraw;
        @XmlElement(name = "_5Dimes_Away")
        protected String _5DimesAway;
        @XmlElement(name = "_888Sport_Home")
        protected String _888SportHome;
        @XmlElement(name = "_888Sport_Url")
        protected String _888SportUrl;
        @XmlElement(name = "_888Sport_Draw")
        protected String _888SportDraw;
        @XmlElement(name = "_888Sport_Away")
        protected String _888SportAway;
        @XmlElement(name = "BestBet_Home")
        protected String bestBetHome;
        @XmlElement(name = "BestBet_Url")
        protected String bestBetUrl;
        @XmlElement(name = "BestBet_Draw")
        protected String bestBetDraw;
        @XmlElement(name = "BestBet_Away")
        protected String bestBetAway;
        @XmlElement(name = "Betboo_Home")
        protected String betbooHome;
        @XmlElement(name = "Betboo_Url")
        protected String betbooUrl;
        @XmlElement(name = "Betboo_Draw")
        protected String betbooDraw;
        @XmlElement(name = "Betboo_Away")
        protected String betbooAway;
        @XmlElement(name = "Betway_Home")
        protected String betwayHome;
        @XmlElement(name = "Betway_Url")
        protected String betwayUrl;
        @XmlElement(name = "Betway_Draw")
        protected String betwayDraw;
        @XmlElement(name = "Betway_Away")
        protected String betwayAway;
        @XmlElement(name = "Betfair_Home")
        protected String betfairHome;
        @XmlElement(name = "Betfair_Url")
        protected String betfairUrl;
        @XmlElement(name = "Betfair_Draw")
        protected String betfairDraw;
        @XmlElement(name = "Betfair_Away")
        protected String betfairAway;
        @XmlElement(name = "Expect_Home")
        protected String expectHome;
        @XmlElement(name = "Expect_Draw")
        protected String expectDraw;
        @XmlElement(name = "Expect_Url")
        protected String expectUrl;
        @XmlElement(name = "Expect_Away")
        protected String expectAway;
        @XmlElement(name = "Betsafe_Home")
        protected String betsafeHome;
        @XmlElement(name = "Betsafe_Url")
        protected String betsafeUrl;
        @XmlElement(name = "Betsafe_Draw")
        protected String betsafeDraw;
        @XmlElement(name = "Betsafe_Away")
        protected String betsafeAway;
        @XmlElement(name = "Interwetten_Home")
        protected String interwettenHome;
        @XmlElement(name = "Interwetten_Url")
        protected String interwettenUrl;
        @XmlElement(name = "Interwetten_Draw")
        protected String interwettenDraw;
        @XmlElement(name = "Interwetten_Away")
        protected String interwettenAway;
        @XmlElement(name = "WilliamHill_Home")
        protected String williamHillHome;
        @XmlElement(name = "WilliamHill_Url")
        protected String williamHillUrl;
        @XmlElement(name = "WilliamHill_Draw")
        protected String williamHillDraw;
        @XmlElement(name = "WilliamHill_Away")
        protected String williamHillAway;
        @XmlElement(name = "Betclic_Home")
        protected String betclicHome;
        @XmlElement(name = "Betclic_Draw")
        protected String betclicDraw;
        @XmlElement(name = "Betclic_Away")
        protected String betclicAway;
        @XmlElement(name = "Betclic_Url")
        protected String betclicUrl;
        @XmlElement(name = "BlueSquare_Home")
        protected String blueSquareHome;
        @XmlElement(name = "BlueSquare_Draw")
        protected String blueSquareDraw;
        @XmlElement(name = "BlueSquare_Away")
        protected String blueSquareAway;
        @XmlElement(name = "BlueSquare_Url")
        protected String blueSquareUrl;
        @XmlElement(name = "CanBet_Home")
        protected String canBetHome;
        @XmlElement(name = "CanBet_Draw")
        protected String canBetDraw;
        @XmlElement(name = "CanBet_Away")
        protected String canBetAway;
        @XmlElement(name = "CanBet_Url")
        protected String canBetUrl;
        @XmlElement(name = "ComeOn_Home")
        protected String comeOnHome;
        @XmlElement(name = "ComeOn_Draw")
        protected String comeOnDraw;
        @XmlElement(name = "ComeOn_Away")
        protected String comeOnAway;
        @XmlElement(name = "ComeOn_Url")
        protected String comeOnUrl;
        @XmlElement(name = "Coral_Home")
        protected String coralHome;
        @XmlElement(name = "Coral_Draw")
        protected String coralDraw;
        @XmlElement(name = "Coral_Away")
        protected String coralAway;
        @XmlElement(name = "Coral_Url")
        protected String coralUrl;
        @XmlElement(name = "DOXXbet_Home")
        protected String doxXbetHome;
        @XmlElement(name = "DOXXbet_Draw")
        protected String doxXbetDraw;
        @XmlElement(name = "DOXXbet_Away")
        protected String doxXbetAway;
        @XmlElement(name = "DOXXbet_Url")
        protected String doxXbetUrl;
        @XmlElement(name = "FortunaWin_Home")
        protected String fortunaWinHome;
        @XmlElement(name = "FortunaWin_Draw")
        protected String fortunaWinDraw;
        @XmlElement(name = "FortunaWin_Away")
        protected String fortunaWinAway;
        @XmlElement(name = "FortunaWin_Url")
        protected String fortunaWinUrl;
        @XmlElement(name = "Tipico_Home")
        protected String tipicoHome;
        @XmlElement(name = "Tipico_Draw")
        protected String tipicoDraw;
        @XmlElement(name = "Tipico_Away")
        protected String tipicoAway;
        @XmlElement(name = "Tipico_Url")
        protected String tipicoUrl;
    }
}
