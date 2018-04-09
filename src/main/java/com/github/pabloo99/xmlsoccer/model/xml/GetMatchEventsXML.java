
package com.github.pabloo99.xmlsoccer.model.xml;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "matchEvent",
        "accountInformation"
})
@XmlRootElement(name = "XMLSOCCER.COM")
public class GetMatchEventsXML {

    @XmlElement(name = "MatchEvent")
    protected List<GetMatchEventsXML.MatchEvent> matchEvent;
    @XmlElement(name = "AccountInformation", required = true)
    protected String accountInformation;

    public List<GetMatchEventsXML.MatchEvent> getMatchEvent() {
        if (matchEvent == null) {
            matchEvent = new ArrayList<MatchEvent>();
        }
        return this.matchEvent;
    }

    public String getAccountInformation() {
        return accountInformation;
    }

    public void setAccountInformation(String value) {
        this.accountInformation = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fixtureMatchId",
        "participantName",
        "eventName",
        "teamId",
        "teamName",
        "elapsedTime",
        "id"
    })
    @Data
    public static class MatchEvent {

        @XmlElement(name = "FixtureMatchId")
        protected int fixtureMatchId;
        @XmlElement(name = "ParticipantName")
        protected String participantName;
        @XmlElement(name = "EventName", required = true)
        protected String eventName;
        @XmlElement(name = "TeamId")
        protected int teamId;
        @XmlElement(name = "TeamName", required = true)
        protected String teamName;
        @XmlElement(name = "ElapsedTime")
        protected int elapsedTime;
        @XmlElement(name = "Id")
        protected int id;
    }
}
