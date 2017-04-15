package com.github.pabloo99.xmlsoccer.model.xml;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "odds",
        "accountInformation"
})
@XmlRootElement(name = "XMLSOCCER.COM")
public class GetNextMatchOddsByLeagueResultXML {

    @XmlElement(name = "Odds", required = true)
    protected List<Odds> odds;
    @XmlElement(name = "AccountInformation", required = true)
    protected List<String> accountInformation;

    public List<Odds> getOdds() {
        if (odds == null) {
            odds = new ArrayList<>();
        }
        return this.odds;
    }

    public List<String> getAccountInformation() {
        if (accountInformation == null) {
            accountInformation = new ArrayList<>();
        }
        return this.accountInformation;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "fixtureMatchId",
            "dateCreate",
            "bookmaker"
    })
    @Data
    public static class Odds {

        @XmlElement(name = "FixtureMatch_Id")
        protected int fixtureMatchId;
        @XmlElement(name = "Date_Create", required = true)
        protected String dateCreate;
        @XmlElement(name = "Bookmaker", required = true)
        protected List<Odds.Bookmaker> bookmaker;

        public List<Odds.Bookmaker> getBookmaker() {
            if (bookmaker == null) {
                bookmaker = new ArrayList<>();
            }
            return this.bookmaker;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "name",
                "url",
                "home",
                "draw",
                "away"
        })
        @Data
        public static class Bookmaker {

            @XmlElement(name = "Name", required = true)
            protected String name;
            @XmlElement(name = "URL", required = true)
            protected String url;
            @XmlElement(name = "Home")
            protected double home;
            @XmlElement(name = "Draw")
            protected double draw;
            @XmlElement(name = "Away")
            protected double away;
        }

    }

}
