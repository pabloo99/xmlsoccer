package com.github.pabloo99.xmlsoccer.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "apiKey",
    "seasonDateString",
    "league"
})
@XmlRootElement(name = "GetPlayoffFixturesByLeagueAndSeason")
public class GetPlayoffFixturesByLeagueAndSeason {

    @XmlElement(name = "ApiKey")
    protected String apiKey;
    protected String seasonDateString;
    protected String league;

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
     * Gets the value of the seasonDateString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeasonDateString() {
        return seasonDateString;
    }

    /**
     * Sets the value of the seasonDateString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeasonDateString(String value) {
        this.seasonDateString = value;
    }

    /**
     * Gets the value of the league property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeague() {
        return league;
    }

    /**
     * Sets the value of the league property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeague(String value) {
        this.league = value;
    }

}
