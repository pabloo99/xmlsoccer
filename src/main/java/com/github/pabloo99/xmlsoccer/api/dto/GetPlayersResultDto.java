package com.github.pabloo99.xmlsoccer.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetPlayersResultDto implements Serializable {

    private Integer id;
    private String name;
    private Double height;
    private Double weight;
    private String nationality;
    private String position;
    private Integer teamId;
    private Integer playerNumber;
    private Date dateOfBirth;
    private Date dateOfSigning;
    private String signing;
    private Integer loanTo;
}
