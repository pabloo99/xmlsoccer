
package com.github.pabloo99.xmlsoccer.webservice;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "apiKey",
    "team1Id",
    "team2Id",
    "startDateString",
    "endDateString"
})
@XmlRootElement(name = "GetHistoricMatchesByTeamsAndDateInterval")
public class GetHistoricMatchesByTeamsAndDateInterval {

    @XmlElement(name = "ApiKey")
    protected String apiKey;
    protected String team1Id;
    protected String team2Id;
    protected String startDateString;
    protected String endDateString;

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
     * Gets the value of the team1Id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeam1Id() {
        return team1Id;
    }

    /**
     * Sets the value of the team1Id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeam1Id(String value) {
        this.team1Id = value;
    }

    /**
     * Gets the value of the team2Id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeam2Id() {
        return team2Id;
    }

    /**
     * Sets the value of the team2Id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeam2Id(String value) {
        this.team2Id = value;
    }

    /**
     * Gets the value of the startDateString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDateString() {
        return startDateString;
    }

    /**
     * Sets the value of the startDateString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDateString(String value) {
        this.startDateString = value;
    }

    /**
     * Gets the value of the endDateString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDateString() {
        return endDateString;
    }

    /**
     * Sets the value of the endDateString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDateString(String value) {
        this.endDateString = value;
    }

}
