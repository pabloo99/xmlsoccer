
package com.github.pabloo99.xmlsoccer.webservice;

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
 *         &lt;element name="fixtureMatch_Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "fixtureMatchId"
})
@XmlRootElement(name = "GetOddsByFixtureMatchId")
public class GetOddsByFixtureMatchId {

    @XmlElement(name = "ApiKey")
    protected String apiKey;
    @XmlElement(name = "fixtureMatch_Id")
    protected String fixtureMatchId;

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
     * Gets the value of the fixtureMatchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixtureMatchId() {
        return fixtureMatchId;
    }

    /**
     * Sets the value of the fixtureMatchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixtureMatchId(String value) {
        this.fixtureMatchId = value;
    }

}
