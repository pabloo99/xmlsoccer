package com.github.pabloo99.xmlsoccer.model.xml;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "match"
})
@XmlRootElement(name = "XMLSOCCER.COM")
@Data
public class GetFixturesResultXML {

    @XmlElement(name = "Match")
    protected List<Match> match;

    public List<Match> getMatch() {
        if (match == null) {
            match = new ArrayList<Match>();
        }
        return this.match;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "date",
        "league",
        "round",
        "homeTeam",
        "homeTeamId",
        "homeGoals",
        "awayTeam",
        "awayTeamId",
        "awayGoals",
        "time",
        "location",
        "betAtHome",
        "betAtDraw",
        "betAtAway",
        "betAtHomeLink",
        "centreBetHome",
        "centreBetDraw",
        "centreBetAway",
        "centreBetLink",
        "gameBookersHome",
        "gameBookersDraw",
        "gameBookersAway",
        "gameBookersLink",
        "williamHillHome",
        "williamHillDraw",
        "williamHillAway",
        "williamHillLink",
        "interwettenHome",
        "interwettenDraw",
        "interwettenAway",
        "interwettenLink",
        "homeTeamYellowCardDetails",
        "awayTeamYellowCardDetails",
        "homeTeamRedCardDetails",
        "awayTeamRedCardDetails"
    })
    @Data
    public static class Match {

        @XmlElement(name = "Id")
        protected int id;
        @XmlElement(name = "Date", required = true)
        @XmlSchemaType(name = "dateTime")
        protected Date date;
        @XmlElement(name = "League", required = true)
        protected String league;
        @XmlElement(name = "Round")
        protected String round;
        @XmlElement(name = "HomeTeam")
        protected String homeTeam;
        @XmlElement(name = "HomeTeam_Id")
        protected int homeTeamId;
        @XmlElement(name = "HomeGoals")
        protected Integer homeGoals;
        @XmlElement(name = "AwayTeam", required = true)
        protected String awayTeam;
        @XmlElement(name = "AwayTeam_Id")
        protected int awayTeamId;
        @XmlElement(name = "AwayGoals")
        protected Integer awayGoals;
        @XmlElement(name = "Time")
        protected String time;
        @XmlElement(name = "Location")
        protected String location;
        @XmlElement(name = "BetAtHome")
        protected String betAtHome;
        @XmlElement(name = "BetAtDraw")
        protected String betAtDraw;
        @XmlElement(name = "BetAtAway")
        protected String betAtAway;
        @XmlElement(name = "BetAtHomeLink")
        protected String betAtHomeLink;
        @XmlElement(name = "CentreBetHome")
        protected String centreBetHome;
        @XmlElement(name = "CentreBetDraw")
        protected String centreBetDraw;
        @XmlElement(name = "CentreBetAway")
        protected String centreBetAway;
        @XmlElement(name = "CentreBetLink")
        protected String centreBetLink;
        @XmlElement(name = "GameBookersHome")
        protected String gameBookersHome;
        @XmlElement(name = "GameBookersDraw")
        protected String gameBookersDraw;
        @XmlElement(name = "GameBookersAway")
        protected String gameBookersAway;
        @XmlElement(name = "GameBookersLink")
        protected String gameBookersLink;
        @XmlElement(name = "WilliamHill_Home")
        protected String williamHillHome;
        @XmlElement(name = "WilliamHill_Draw")
        protected String williamHillDraw;
        @XmlElement(name = "WilliamHill_Away")
        protected String williamHillAway;
        @XmlElement(name = "WilliamHillLink")
        protected String williamHillLink;
        @XmlElement(name = "InterwettenHome")
        protected String interwettenHome;
        @XmlElement(name = "InterwettenDraw")
        protected String interwettenDraw;
        @XmlElement(name = "InterwettenAway")
        protected String interwettenAway;
        @XmlElement(name = "InterwettenLink")
        protected String interwettenLink;
        @XmlElement(name = "HomeTeamYellowCardDetails")
        protected String homeTeamYellowCardDetails;
        @XmlElement(name = "AwayTeamYellowCardDetails")
        protected String awayTeamYellowCardDetails;
        @XmlElement(name = "HomeTeamRedCardDetails")
        protected String homeTeamRedCardDetails;
        @XmlElement(name = "AwayTeamRedCardDetails")
        protected String awayTeamRedCardDetails;
    }

}
