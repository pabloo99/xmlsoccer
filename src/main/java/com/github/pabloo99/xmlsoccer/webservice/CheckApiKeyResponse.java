
package com.github.pabloo99.xmlsoccer.webservice;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "checkApiKeyResult"
})
@XmlRootElement(name = "CheckApiKeyResponse")
public class CheckApiKeyResponse {

    @XmlElement(name = "CheckApiKeyResult")
    protected String checkApiKeyResult;

    /**
     * Gets the value of the checkApiKeyResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckApiKeyResult() {
        return checkApiKeyResult;
    }

    /**
     * Sets the value of the checkApiKeyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckApiKeyResult(String value) {
        this.checkApiKeyResult = value;
    }

}
