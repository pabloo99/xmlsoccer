
package com.github.pabloo99.xmlsoccer.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="IsMyApiKeyPutOnSpammersListResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "isMyApiKeyPutOnSpammersListResult"
})
@XmlRootElement(name = "IsMyApiKeyPutOnSpammersListResponse", namespace = "http://xmlsoccer.com/")
public class IsMyApiKeyPutOnSpammersListResponse {

    @XmlElement(name = "IsMyApiKeyPutOnSpammersListResult", namespace = "http://xmlsoccer.com/")
    protected String isMyApiKeyPutOnSpammersListResult;

    /**
     * Gets the value of the isMyApiKeyPutOnSpammersListResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsMyApiKeyPutOnSpammersListResult() {
        return isMyApiKeyPutOnSpammersListResult;
    }

    /**
     * Sets the value of the isMyApiKeyPutOnSpammersListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsMyApiKeyPutOnSpammersListResult(String value) {
        this.isMyApiKeyPutOnSpammersListResult = value;
    }

}
