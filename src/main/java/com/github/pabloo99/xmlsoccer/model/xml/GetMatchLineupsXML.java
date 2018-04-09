
package com.github.pabloo99.xmlsoccer.model.xml;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "matchLineup",
    "accountInformation"
})
@XmlRootElement(name = "XMLSOCCER.COM")
public class GetMatchLineupsXML {

    @XmlElement(name = "MatchLineup")
    protected List<GetMatchLineupsXML.MatchLineup> matchLineup;
    @XmlElement(name = "AccountInformation", required = true)
    protected String accountInformation;

    public List<GetMatchLineupsXML.MatchLineup> getMatchLineup() {
        if (matchLineup == null) {
            matchLineup = new ArrayList<GetMatchLineupsXML.MatchLineup>();
        }
        return this.matchLineup;
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
        "lineupType",
        "participantName",
        "teamId",
        "teamName"
    })
    @Data
    public static class MatchLineup {

        @XmlElement(name = "FixtureMatchId")
        protected int fixtureMatchId;
        @XmlElement(name = "LineupType", required = true)
        protected String lineupType;
        @XmlElement(name = "ParticipantName", required = true)
        protected String participantName;
        @XmlElement(name = "TeamId")
        protected short teamId;
        @XmlElement(name = "TeamName", required = true)
        protected String teamName;
    }
}
