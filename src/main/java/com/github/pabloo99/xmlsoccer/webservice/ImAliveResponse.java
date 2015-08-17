
package com.github.pabloo99.xmlsoccer.webservice;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "imAliveResult"
})
@XmlRootElement(name = "ImAliveResponse")
public class ImAliveResponse {

    @XmlElement(name = "ImAliveResult")
    protected String imAliveResult;

    /**
     * Gets the value of the imAliveResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImAliveResult() {
        return imAliveResult;
    }

    /**
     * Sets the value of the imAliveResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImAliveResult(String value) {
        this.imAliveResult = value;
    }

}
