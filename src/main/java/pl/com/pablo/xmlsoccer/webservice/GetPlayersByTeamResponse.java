
package pl.com.pablo.xmlsoccer.webservice;

import pl.com.pablo.xmlsoccer.model.xml.GetPlayersByTeamResultXML;

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
 *         &lt;element name="GetPlayersByTeamResult" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "getPlayersByTeamResult"
})
@XmlRootElement(name = "GetPlayersByTeamResponse")
public class GetPlayersByTeamResponse {

    @XmlElement(name = "GetPlayersByTeamResult")
    protected GetPlayersByTeamResponse.GetPlayersByTeamResult getPlayersByTeamResult;

    /**
     * Gets the value of the getPlayersByTeamResult property.
     *
     * @return
     *     possible object is
     *     {@link GetPlayersByTeamResponse.GetPlayersByTeamResult }
     *
     */
    public GetPlayersByTeamResponse.GetPlayersByTeamResult getGetPlayersByTeamResult() {
        return getPlayersByTeamResult;
    }

    /**
     * Sets the value of the getPlayersByTeamResult property.
     *
     * @param value
     *     allowed object is
     *     {@link GetPlayersByTeamResponse.GetPlayersByTeamResult }
     *
     */
    public void setGetPlayersByTeamResult(GetPlayersByTeamResponse.GetPlayersByTeamResult value) {
        this.getPlayersByTeamResult = value;
    }


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
     *         &lt;any/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */

    public static class GetPlayersByTeamResult {

        @XmlElementRef(name="XMLSOCCER.COM", type=GetPlayersByTeamResultXML.class)
        protected GetPlayersByTeamResultXML content;

        /**
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * {@link String }
         * 
         * 
         */
        public GetPlayersByTeamResultXML getContent() {
            if (content == null) {
                content = new GetPlayersByTeamResultXML();
            }
            return this.content;
        }

    }

}
