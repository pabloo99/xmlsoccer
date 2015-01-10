package pl.com.pablo.xmlsoccer.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by pmazur on 2014-11-30.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllLeaguesResultDto implements Serializable{

    private int id;
    private String name;
    private String country;
    private String historicalData;
    private String fixtures;
    private String livescore;
    private int numberOfMatches;
    private Date latestMatch;
}
