package com.github.pabloo99.xmlsoccer.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetTeamResultDto implements Serializable {

    private Integer teamId;
    private String name;
    private String country;
    private String stadium;
    private String website;
    private String wikiLink;
    private String manager;
    private Integer capacity;
}
