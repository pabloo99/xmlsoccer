package com.github.pabloo99.xmlsoccer.model.xml;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "team",
    "accountInformation"
})
@XmlRootElement(name = "XMLSOCCER.COM")
@Data
public class GetAllTeamsResultXML {

    @XmlElement(name = "Team")
    protected List<Team> team;
    @XmlElement(name = "AccountInformation", required = true)
    protected String accountInformation;

    public List<Team> getTeam() {
        if (team == null) {
            team = new ArrayList<Team>();
        }
        return this.team;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "teamId",
        "name",
        "country",
        "stadium",
        "homePageURL",
        "wikiLink"
    })
    @Data
    public static class Team {

        @XmlElement(name = "Team_Id")
        protected int teamId;
        @XmlElement(name = "Name", required = true)
        protected String name;
        @XmlElement(name = "Country", required = true)
        protected String country;
        @XmlElement(name = "Stadium", required = true)
        protected String stadium;
        @XmlElement(name = "HomePageURL", required = true)
        protected String homePageURL;
        @XmlElement(name = "WIKILink", required = true)
        protected String wikiLink;
    }
}
