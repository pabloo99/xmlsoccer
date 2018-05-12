package com.github.pabloo99.xmlsoccer.model.xml;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "team",
        "accountInformation"
})
@XmlRootElement(name = "XMLSOCCER.COM")
@Data
public class GetTeamResultXML {

    @XmlElement(name = "Team", required = true)
    protected GetTeamResultXML.Team team;
    @XmlElement(name = "AccountInformation", required = true)
    protected String accountInformation;

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "id",
            "name",
            "stadium",
            "website",
            "wikiPageUrl",
            "country",
            "capacity",
            "manager"
    })
    @Data
    public static class Team {

        @XmlElement(name = "Id")
        protected short id;
        @XmlElement(name = "Name", required = true)
        protected String name;
        @XmlElement(name = "Stadium", required = true)
        protected String stadium;
        @XmlElement(name = "Website", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String website;
        @XmlElement(name = "WikiPageUrl", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String wikiPageUrl;
        @XmlElement(name = "Country", required = true)
        protected String country;
        @XmlElement(name = "Capacity")
        protected Integer capacity;
        @XmlElement(name = "Manager")
        protected String manager;
    }
}
