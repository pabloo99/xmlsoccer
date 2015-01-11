
package com.github.pabloo99.xmlsoccer.webservice;

import com.github.pabloo99.xmlsoccer.model.xml.GetAllTeamsResultXML;

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
 *         &lt;element name="GetAllTeamsResult" minOccurs="0">
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
    "getAllTeamsResult"
})
@XmlRootElement(name = "GetAllTeamsResponse")
public class GetAllTeamsResponse {

    @XmlElement(name = "GetAllTeamsResult")
    protected GetAllTeamsResponse.GetAllTeamsResult getAllTeamsResult;

    /**
     * Gets the value of the getAllTeamsResult property.
     *
     * @return
     *     possible object is
     *     {@link GetAllTeamsResponse.GetAllTeamsResult }
     *
     */
    public GetAllTeamsResponse.GetAllTeamsResult getGetAllTeamsResult() {
        return getAllTeamsResult;
    }

    /**
     * Sets the value of the getAllTeamsResult property.
     *
     * @param value
     *     allowed object is
     *     {@link GetAllTeamsResponse.GetAllTeamsResult }
     *
     */
    public void setGetAllTeamsResult(GetAllTeamsResponse.GetAllTeamsResult value) {
        this.getAllTeamsResult = value;
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

    public static class GetAllTeamsResult {

        @XmlElementRef(name="XMLSOCCER.COM", type=GetAllTeamsResultXML.class)
        protected GetAllTeamsResultXML content;

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
        public GetAllTeamsResultXML getContent() {
            if (content == null) {
                content = new GetAllTeamsResultXML();
            }
            return this.content;
        }

    }

}
