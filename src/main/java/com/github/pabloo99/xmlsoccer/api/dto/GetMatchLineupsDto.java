package com.github.pabloo99.xmlsoccer.api.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetMatchLineupsDto implements Serializable {

    private int fixtureMatchId;
    private String lineupType;
    private String participantName;
    private int teamId;
    private String teamName;
}
