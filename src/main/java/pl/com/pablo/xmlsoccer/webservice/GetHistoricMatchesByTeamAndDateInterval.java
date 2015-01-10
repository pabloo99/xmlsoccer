
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
 *         &lt;element name="teamId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "teamId",
    "startDateString",
    "endDateString"
})
@XmlRootElement(name = "GetHistoricMatchesByTeamAndDateInterval")
public class GetHistoricMatchesByTeamAndDateInterval {

    @XmlElement(name = "ApiKey")
    protected String apiKey;
    protected String teamId;
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
     * Gets the value of the teamId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamId() {
        return teamId;
    }

    /**
     * Sets the value of the teamId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamId(String value) {
        this.teamId = value;
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
