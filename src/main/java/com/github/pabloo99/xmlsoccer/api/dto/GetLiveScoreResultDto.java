package com.github.pabloo99.xmlsoccer.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by pmazur on 2014-11-30.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetLiveScoreResultDto implements Serializable{

    private int id;
    private Date date;
    private String league;
    private String round;
    private String spectators;
    private String homeTeam;
    private int homeTeamId;
    private String awayTeam;
    private int awayTeamId;
    private String time;
    private int homeGoals;
    private int awayGoals;
    private String homeGoalDetails;
    private String awayGoalDetails;
    private String homeLineupGoalkeeper;
    private String awayLineupGoalkeeper;
    private String homeLineupDefense;
    private String awayLineupDefense;
    private String homeLineupMidfield;
    private String awayLineupMidfield;
    private String homeLineupForward;
    private String awayLineupForward;
    private String homeSubDetails;
    private String awaySubDetails;
    private String homeTeamFormation;
    private String awayTeamFormation;
    private String location;
    private String stadium;
    private String homeTeamYellowCardDetails;
    private String awayTeamYellowCardDetails;
    private String homeTeamRedCardDetails;
    private String awayTeamRedCardDetails;
    private String homeLineupCoach;
    private String awayLineupCoach;
    private String homeLineupSubstitutes;
    private String awayLineupSubstitutes;
}
