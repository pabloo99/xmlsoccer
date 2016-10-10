package com.github.pabloo99.xmlsoccer.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetFixturesResultDto implements Serializable {

    private int id;
    private Date date;
    private String league;
    private String round;
    private String homeTeam;
    private int homeTeamId;
    private Integer homeGoals;
    private String awayTeam;
    private int awayTeamId;
    private Integer awayGoals;
    private String time;
    private String location;
    private String betAtHome;
    private String betAtDraw;
    private String betAtAway;
    private String betAtHomeLink;
    private String centreBetHome;
    private String centreBetDraw;
    private String centreBetAway;
    private String centreBetLink;
    private String gameBookersHome;
    private String gameBookersDraw;
    private String gameBookersAway;
    private String gameBookersLink;
    private String williamHillHome;
    private String williamHillDraw;
    private String williamHillAway;
    private String williamHillLink;
    private String interwettenHome;
    private String interwettenDraw;
    private String interwettenAway;
    private String interwettenLink;
    private String homeTeamYellowCardDetails;
    private String awayTeamYellowCardDetails;
    private String homeTeamRedCardDetails;
    private String awayTeamRedCardDetails;
}
