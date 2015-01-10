
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
 *         &lt;element name="ImAliveResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
