
package pl.com.pablo.xmlsoccer.webservice;

import pl.com.pablo.xmlsoccer.model.xml.GetEarliestMatchDatePerLeagueXML;

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
 *         &lt;element name="GetEarliestMatchDatePerLeagueResult" minOccurs="0">
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
    "getEarliestMatchDatePerLeagueResult"
})
@XmlRootElement(name = "GetEarliestMatchDatePerLeagueResponse")
public class GetEarliestMatchDatePerLeagueResponse {

    @XmlElement(name = "GetEarliestMatchDatePerLeagueResult")
    protected GetEarliestMatchDatePerLeagueResponse.GetEarliestMatchDatePerLeagueResult getEarliestMatchDatePerLeagueResult;

    /**
     * Gets the value of the getEarliestMatchDatePerLeagueResult property.
     *
     * @return
     *     possible object is
     *     {@link GetEarliestMatchDatePerLeagueResponse.GetEarliestMatchDatePerLeagueResult }
     *
     */
    public GetEarliestMatchDatePerLeagueResponse.GetEarliestMatchDatePerLeagueResult getGetEarliestMatchDatePerLeagueResult() {
        return getEarliestMatchDatePerLeagueResult;
    }

    /**
     * Sets the value of the getEarliestMatchDatePerLeagueResult property.
     *
     * @param value
     *     allowed object is
     *     {@link GetEarliestMatchDatePerLeagueResponse.GetEarliestMatchDatePerLeagueResult }
     *
     */
    public void setGetEarliestMatchDatePerLeagueResult(GetEarliestMatchDatePerLeagueResponse.GetEarliestMatchDatePerLeagueResult value) {
        this.getEarliestMatchDatePerLeagueResult = value;
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
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class GetEarliestMatchDatePerLeagueResult {

        @XmlElementRef(name="XMLSOCCER.COM", type=GetEarliestMatchDatePerLeagueXML.class)
        protected GetEarliestMatchDatePerLeagueXML content;

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
        public GetEarliestMatchDatePerLeagueXML getContent() {
            if (content == null) {
                content = new GetEarliestMatchDatePerLeagueXML();
            }
            return this.content;
        }

    }

}
