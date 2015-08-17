
package com.github.pabloo99.xmlsoccer.webservice;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "apiKey",
    "league",
    "seasonDateString"
})
@XmlRootElement(name = "GetAllTeamsByLeagueAndSeason")
public class GetAllTeamsByLeagueAndSeason {

    @XmlElement(name = "ApiKey")
    protected String apiKey;
    protected String league;
    protected String seasonDateString;

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

}
