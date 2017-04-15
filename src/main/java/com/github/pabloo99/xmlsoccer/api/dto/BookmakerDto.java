package com.github.pabloo99.xmlsoccer.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookmakerDto implements Serializable {

    private String name;
    private String url;
    private double home;
    private double draw;
    private double away;
}
