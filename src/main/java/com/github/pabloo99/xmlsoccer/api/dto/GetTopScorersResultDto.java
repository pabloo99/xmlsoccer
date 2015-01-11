package com.github.pabloo99.xmlsoccer.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * Created by pmazur on 2014-11-30.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetTopScorersResultDto {

    private int rank;
    private String name;
    private String teamName;
    private int teamId;
    private String nationality;
    private int goals;
    private int firstScorer;
    private int penalties;
    private int missedPenalties;
    private String leagueName;
    private String season;
    private int id;
}
