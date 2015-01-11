package com.github.pabloo99.xmlsoccer.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by pmazur on 2014-11-30.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetLeagueStandingsResultDto implements Serializable {

    private String team;
    private int teamId;
    private int played;
    private int playedAtHome;
    private int playedAway;
    private int won;
    private int draw;
    private int lost;
    private int numberOfShots;
    private int yellowCards;
    private int redCards;
    private int goalsFor;
    private int goalsAgainst;
    private int goalDifference;
    private int points;
    private String leagueName;
    private String season;
    private int id;
}

