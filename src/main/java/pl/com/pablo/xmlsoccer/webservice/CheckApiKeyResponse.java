
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
 *         &lt;element name="CheckApiKeyResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
