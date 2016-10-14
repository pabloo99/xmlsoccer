package com.github.pabloo99.xmlsoccer.model.xml;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "match"
})
@XmlRootElement(name = "XMLSOCCER.COM")
public class GetHistoricMatchesResultXML {

    @XmlElement(name = "Match")
    protected List<Match> match;

    public List<Match> getMatch() {
        return Optional.ofNullable(match).
                orElse(Collections.emptyList());
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "id",
            "fixtureMatchId",
            "date",
            "round",
            "spectators",
            "league",
            "homeTeam",
            "homeTeamId",
            "homeCorners",
            "homeGoals",
            "halfTimeHomeGoals",
            "homeShots",
            "homeShotsOnTarget",
            "homeFouls",
            "homeGoalDetails",
            "homeLineupGoalkeeper",
            "homeLineupDefense",
            "homeLineupMidfield",
            "homeLineupForward",
            "homeYellowCards",
            "homeRedCards",
            "homeTeamFormation",
            "awayTeam",
            "awayTeamId",
            "awayCorners",
            "awayGoals",
            "halfTimeAwayGoals",
            "awayShots",
            "awayShotsOnTarget",
            "awayFouls",
            "awayGoalDetails",
            "awayLineupGoalkeeper",
            "awayLineupDefense",
            "awayLineupMidfield",
            "awayLineupForward",
            "awayYellowCards",
            "awayRedCards",
            "awayTeamFormation",
            "homeTeamYellowCardDetails",
            "awayTeamYellowCardDetails",
            "homeTeamRedCardDetails",
            "awayTeamRedCardDetails"
    })
    @Data
    public static class Match {

        @XmlElement(name = "Id")
        protected Integer id;
        @XmlElement(name = "FixtureMatch_Id")
        protected Integer fixtureMatchId;
        @XmlElement(name = "Date")
        @XmlSchemaType(name = "dateTime")
        protected Date date;
        @XmlElement(name = "Round")
        protected Integer round;
        @XmlElement(name = "Spectators")
        protected String spectators;
        @XmlElement(name = "League")
        protected String league;
        @XmlElement(name = "HomeTeam")
        protected String homeTeam;
        @XmlElement(name = "HomeTeam_Id")
        protected Integer homeTeamId;
        @XmlElement(name = "HomeCorners")
        protected Integer homeCorners;
        @XmlElement(name = "HomeGoals")
        protected Integer homeGoals;
        @XmlElement(name = "HalfTimeHomeGoals")
        protected Integer halfTimeHomeGoals;
        @XmlElement(name = "HomeShots")
        protected Integer homeShots;
        @XmlElement(name = "HomeShotsOnTarget")
        protected Integer homeShotsOnTarget;
        @XmlElement(name = "HomeFouls")
        protected Integer homeFouls;
        @XmlElement(name = "HomeGoalDetails")
        protected String homeGoalDetails;
        @XmlElement(name = "HomeLineupGoalkeeper")
        protected String homeLineupGoalkeeper;
        @XmlElement(name = "HomeLineupDefense")
        protected String homeLineupDefense;
        @XmlElement(name = "HomeLineupMidfield")
        protected String homeLineupMidfield;
        @XmlElement(name = "HomeLineupForward")
        protected String homeLineupForward;
        @XmlElement(name = "HomeYellowCards")
        protected Integer homeYellowCards;
        @XmlElement(name = "HomeRedCards")
        protected Integer homeRedCards;
        @XmlElement(name = "HomeTeamFormation")
        protected String homeTeamFormation;
        @XmlElement(name = "AwayTeam")
        protected String awayTeam;
        @XmlElement(name = "AwayTeam_Id")
        protected Integer awayTeamId;
        @XmlElement(name = "AwayCorners")
        protected Integer awayCorners;
        @XmlElement(name = "AwayGoals")
        protected Integer awayGoals;
        @XmlElement(name = "HalfTimeAwayGoals")
        protected Integer halfTimeAwayGoals;
        @XmlElement(name = "AwayShots")
        protected Integer awayShots;
        @XmlElement(name = "AwayShotsOnTarget")
        protected Integer awayShotsOnTarget;
        @XmlElement(name = "AwayFouls")
        protected Integer awayFouls;
        @XmlElement(name = "AwayGoalDetails")
        protected String awayGoalDetails;
        @XmlElement(name = "AwayLineupGoalkeeper")
        protected String awayLineupGoalkeeper;
        @XmlElement(name = "AwayLineupDefense")
        protected String awayLineupDefense;
        @XmlElement(name = "AwayLineupMidfield")
        protected String awayLineupMidfield;
        @XmlElement(name = "AwayLineupForward")
        protected String awayLineupForward;
        @XmlElement(name = "AwayYellowCards")
        protected Integer awayYellowCards;
        @XmlElement(name = "AwayRedCards")
        protected Integer awayRedCards;
        @XmlElement(name = "AwayTeamFormation")
        protected String awayTeamFormation;
        @XmlElement(name = "HomeTeamYellowCardDetails")
        protected String homeTeamYellowCardDetails;
        @XmlElement(name = "AwayTeamYellowCardDetails")
        protected String awayTeamYellowCardDetails;
        @XmlElement(name = "HomeTeamRedCardDetails")
        protected String homeTeamRedCardDetails;
        @XmlElement(name = "AwayTeamRedCardDetails")
        protected String awayTeamRedCardDetails;
        @XmlTransient
        protected String season;
    }
}
