
package com.github.pabloo99.xmlsoccer.webservice;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "apiKey",
    "fixtureMatchId"
})
@XmlRootElement(name = "GetOddsByFixtureMatchId2")
public class GetOddsByFixtureMatchId2 {

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
