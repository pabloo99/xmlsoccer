
package com.github.pabloo99.xmlsoccer.webservice;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "apiKey",
    "league"
})
@XmlRootElement(name = "GetNextMatchOddsByLeague")
public class GetNextMatchOddsByLeague {

    @XmlElement(name = "ApiKey")
    protected String apiKey;
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
