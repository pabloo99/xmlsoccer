package com.github.pabloo99.xmlsoccer.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetNextOddsResultDto implements Serializable {

    private int fixtureMatchId;
    private String dateCreate;
    private List<BookmakerDto> bookmaker;
}
