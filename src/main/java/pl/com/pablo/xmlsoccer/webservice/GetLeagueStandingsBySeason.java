
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
 *         &lt;element name="league" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seasonDateString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "league",
    "seasonDateString"
})
@XmlRootElement(name = "GetLeagueStandingsBySeason")
public class GetLeagueStandingsBySeason {

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
