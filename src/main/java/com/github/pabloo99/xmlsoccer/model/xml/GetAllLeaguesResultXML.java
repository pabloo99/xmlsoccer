package com.github.pabloo99.xmlsoccer.model.xml;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "league",
    "accountInformation"
})
@XmlRootElement(name = "XMLSOCCER.COM")
@Data
public class GetAllLeaguesResultXML {

    @XmlElement(name = "League")
    protected List<League> league;
    @XmlElement(name = "AccountInformation", required = true)
    protected String accountInformation;

    public List<League> getLeague() {
        if (league == null) {
            league = new ArrayList<League>();
        }
        return this.league;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "name",
        "country",
        "historicalData",
        "fixtures",
        "livescore",
        "numberOfMatches",
        "latestMatch"
    })
    @Data
    public static class League {

        @XmlElement(name = "Id")
        protected int id;
        @XmlElement(name = "Name", required = true)
        protected String name;
        @XmlElement(name = "Country", required = true)
        protected String country;
        @XmlElement(name = "Historical_Data", required = true)
        protected String historicalData;
        @XmlElement(name = "Fixtures", required = true)
        protected String fixtures;
        @XmlElement(name = "Livescore", required = true)
        protected String livescore;
        @XmlElement(name = "NumberOfMatches")
        protected int numberOfMatches;
        @XmlElement(name = "LatestMatch", required = true)
        @XmlSchemaType(name = "dateTime")
        protected Date latestMatch;
    }
}
