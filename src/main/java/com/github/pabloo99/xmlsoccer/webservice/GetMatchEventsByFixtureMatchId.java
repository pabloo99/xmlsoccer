
package com.github.pabloo99.xmlsoccer.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "apiKey",
    "matchId"
})
@XmlRootElement(name = "GetMatchEventsByFixtureMatchId")
public class GetMatchEventsByFixtureMatchId {

    @XmlElement(name = "ApiKey")
    protected String apiKey;
    protected int matchId;

    /**
     * Gets the value of the apiKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     * Sets the value of the apiKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiKey(String value) {
        this.apiKey = value;
    }

    /**
     * Gets the value of the matchId property.
     * 
     */
    public int getMatchId() {
        return matchId;
    }

    /**
     * Sets the value of the matchId property.
     * 
     */
    public void setMatchId(int value) {
        this.matchId = value;
    }

}
