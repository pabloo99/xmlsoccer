package com.github.pabloo99.xmlsoccer.model.xml;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "match",
        "accountInformation"
})
@XmlRootElement(name = "XMLSOCCER.COM")
@Data
public class GetLiveScoreResultXML {

    @XmlElement(name = "Match")
    protected List<Match> match;
    @XmlElement(name = "AccountInformation", required = true)
    protected String accountInformation;

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
            "spectators",
            "homeTeam",
            "homeTeamId",
            "awayTeam",
            "awayTeamId",
            "time",
            "homeGoals",
            "awayGoals",
            "homeGoalDetails",
            "awayGoalDetails",
            "homeLineupGoalkeeper",
            "awayLineupGoalkeeper",
            "homeLineupDefense",
            "awayLineupDefense",
            "homeLineupMidfield",
            "awayLineupMidfield",
            "homeLineupForward",
            "awayLineupForward",
            "homeSubDetails",
            "awaySubDetails",
            "homeTeamFormation",
            "awayTeamFormation",
            "location",
            "stadium",
            "homeTeamYellowCardDetails",
            "awayTeamYellowCardDetails",
            "homeTeamRedCardDetails",
            "awayTeamRedCardDetails",
            "awayLineupCoach",
            "homeLineupCoach",
            "awayLineupSubstitutes",
            "homeLineupSubstitutes"
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
        @XmlElement(name = "Spectators", required = true)
        protected String spectators;
        @XmlElement(name = "HomeTeam", required = true)
        protected String homeTeam;
        @XmlElement(name = "HomeTeam_Id")
        protected int homeTeamId;
        @XmlElement(name = "AwayTeam", required = true)
        protected String awayTeam;
        @XmlElement(name = "AwayTeam_Id")
        protected int awayTeamId;
        @XmlElement(name = "Time", required = true)
        protected String time;
        @XmlElement(name = "HomeGoals")
        protected int homeGoals;
        @XmlElement(name = "AwayGoals")
        protected int awayGoals;
        @XmlElement(name = "HomeGoalDetails", required = true)
        protected String homeGoalDetails;
        @XmlElement(name = "AwayGoalDetails", required = true)
        protected String awayGoalDetails;
        @XmlElement(name = "HomeLineupGoalkeeper", required = true)
        protected String homeLineupGoalkeeper;
        @XmlElement(name = "AwayLineupGoalkeeper", required = true)
        protected String awayLineupGoalkeeper;
        @XmlElement(name = "HomeLineupDefense", required = true)
        protected String homeLineupDefense;
        @XmlElement(name = "AwayLineupDefense", required = true)
        protected String awayLineupDefense;
        @XmlElement(name = "HomeLineupMidfield", required = true)
        protected String homeLineupMidfield;
        @XmlElement(name = "AwayLineupMidfield", required = true)
        protected String awayLineupMidfield;
        @XmlElement(name = "HomeLineupForward", required = true)
        protected String homeLineupForward;
        @XmlElement(name = "AwayLineupForward", required = true)
        protected String awayLineupForward;
        @XmlElement(name = "HomeSubDetails", required = true)
        protected String homeSubDetails;
        @XmlElement(name = "AwaySubDetails", required = true)
        protected String awaySubDetails;
        @XmlElement(name = "HomeTeamFormation", required = true)
        protected String homeTeamFormation;
        @XmlElement(name = "AwayTeamFormation", required = true)
        protected String awayTeamFormation;
        @XmlElement(name = "Location", required = true)
        protected String location;
        @XmlElement(name = "Stadium", required = true)
        protected String stadium;
        @XmlElement(name = "HomeTeamYellowCardDetails", required = true)
        protected String homeTeamYellowCardDetails;
        @XmlElement(name = "AwayTeamYellowCardDetails", required = true)
        protected String awayTeamYellowCardDetails;
        @XmlElement(name = "HomeTeamRedCardDetails", required = true)
        protected String homeTeamRedCardDetails;
        @XmlElement(name = "AwayTeamRedCardDetails", required = true)
        protected String awayTeamRedCardDetails;
        @XmlElement(name = "HomeLineupCoach", required = true)
        protected String homeLineupCoach;
        @XmlElement(name = "AwayLineupCoach", required = true)
        protected String awayLineupCoach;
        @XmlElement(name = "HomeLineupSubstitutes", required = true)
        protected String homeLineupSubstitutes;
        @XmlElement(name = "AwayLineupSubstitutes", required = true)
        protected String awayLineupSubstitutes;
    }
}
