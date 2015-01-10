
package pl.com.pablo.xmlsoccer.webservice;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApiKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="team1Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="team2Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDateString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDateString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
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
