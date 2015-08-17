package com.github.pabloo99.xmlsoccer.model.xml;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "teamLeagueStanding",
    "accountInformation"
})
@XmlRootElement(name = "XMLSOCCER.COM")
@Data
public class GetLeagueStandingsBySeasonResultXML {

    @XmlElement(name = "TeamLeagueStanding", required = true, namespace="http://xmlsoccer.com/LeagueStanding")
    protected List<TeamLeagueStanding> teamLeagueStanding;
    @XmlElement(name = "AccountInformation", required = true)
    protected String accountInformation;

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "team",
        "teamId",
        "played",
        "playedAtHome",
        "playedAway",
        "won",
        "draw",
        "lost",
        "numberOfShots",
        "yellowCards",
        "redCards",
        "goalsFor",
        "goalsAgainst",
        "goalDifference",
        "points"
    })
    @Data
    public static class TeamLeagueStanding {

        @XmlElement(name = "Team", namespace="http://xmlsoccer.com/LeagueStanding")
        protected String team;
        @XmlElement(name = "Team_Id", namespace="http://xmlsoccer.com/LeagueStanding")
        protected int teamId;
        @XmlElement(name = "Played", namespace="http://xmlsoccer.com/LeagueStanding")
        protected int played;
        @XmlElement(name = "PlayedAtHome", namespace="http://xmlsoccer.com/LeagueStanding")
        protected int playedAtHome;
        @XmlElement(name = "PlayedAway", namespace="http://xmlsoccer.com/LeagueStanding")
        protected int playedAway;
        @XmlElement(name = "Won", namespace="http://xmlsoccer.com/LeagueStanding")
        protected int won;
        @XmlElement(name = "Draw", namespace="http://xmlsoccer.com/LeagueStanding")
        protected int draw;
        @XmlElement(name = "Lost", namespace="http://xmlsoccer.com/LeagueStanding")
        protected int lost;
        @XmlElement(name = "NumberOfShots", namespace="http://xmlsoccer.com/LeagueStanding")
        protected int numberOfShots;
        @XmlElement(name = "YellowCards", namespace="http://xmlsoccer.com/LeagueStanding")
        protected int yellowCards;
        @XmlElement(name = "RedCards", namespace="http://xmlsoccer.com/LeagueStanding")
        protected int redCards;
        @XmlElement(name = "Goals_For", namespace="http://xmlsoccer.com/LeagueStanding")
        protected int goalsFor;
        @XmlElement(name = "Goals_Against", namespace="http://xmlsoccer.com/LeagueStanding")
        protected int goalsAgainst;
        @XmlElement(name = "Goal_Difference", namespace="http://xmlsoccer.com/LeagueStanding")
        protected int goalDifference;
        @XmlElement(name = "Points", namespace="http://xmlsoccer.com/LeagueStanding")
        protected int points;
    }
}
