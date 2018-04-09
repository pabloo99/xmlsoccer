package com.github.pabloo99.xmlsoccer.api.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetMatchEventsDto implements Serializable {

    protected int fixtureMatchId;
    protected String participantName;
    protected String eventName;
    protected int teamId;
    protected String teamName;
    protected int elapsedTime;
    protected int id;
}
