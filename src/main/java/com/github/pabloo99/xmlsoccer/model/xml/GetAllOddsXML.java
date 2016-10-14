package com.github.pabloo99.xmlsoccer.model.xml;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "oddsList",
        "accountInformation"
})
@XmlRootElement(name = "XMLSOCCER.COM")
@Data
public class GetAllOddsXML {

    @XmlElement(name = "OddsList", required = true)
    protected OddsList oddsList;
    @XmlElement(name = "AccountInformation", required = true)
    protected String accountInformation;

    public OddsList getOddsList() {
        return Optional.ofNullable(oddsList).
                orElse(new OddsList());
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "odds"
    })
    public static class OddsList {

        @XmlElement(name = "Odds")
        protected List<Odds> odds;

        public List<Odds> getOdds() {
            return Optional.ofNullable(odds).
                    orElse(Collections.emptyList());
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "fixtureMatchId",
                "bookmaker",
                "updatedDate",
                "type",
                "homeOdds",
                "drawOdds",
                "awayOdds",
                "handicap"
        })
        @Data
        public static class Odds {

            @XmlElement(name = "FixtureMatch_Id")
            protected int fixtureMatchId;
            @XmlElement(name = "Bookmaker", required = true)
            protected String bookmaker;
            @XmlElement(name = "UpdatedDate", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar updatedDate;
            @XmlElement(name = "Type", required = true)
            protected String type;
            @XmlElement(name = "HomeOdds")
            protected float homeOdds;
            @XmlElement(name = "DrawOdds")
            protected float drawOdds;
            @XmlElement(name = "AwayOdds")
            protected float awayOdds;
            @XmlElement(name = "Handicap")
            protected float handicap;
        }

    }

}
