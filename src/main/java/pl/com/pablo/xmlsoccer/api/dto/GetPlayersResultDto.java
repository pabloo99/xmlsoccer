package pl.com.pablo.xmlsoccer.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by pmazur on 2014-11-30.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetPlayersResultDto {

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
}
