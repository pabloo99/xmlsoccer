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
public class GetTeamResultDto {

    private int teamId;
    private String name;
    private String country;
    private String stadium;
    private String homePageURL;
    private String wikiLink;
}
