package com.github.pabloo99.xmlsoccer.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllOddsResultDto implements Serializable {

    private int fixtureMatchId;
    private String bookmaker;
    private XMLGregorianCalendar updatedDate;
    private String type;
    private float homeOdds;
    private float drawOdds;
    private float awayOdds;
    private float handicap;
}
