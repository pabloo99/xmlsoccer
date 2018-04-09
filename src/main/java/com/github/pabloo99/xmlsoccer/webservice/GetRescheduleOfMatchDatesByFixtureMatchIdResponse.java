
package com.github.pabloo99.xmlsoccer.webservice;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element name="GetRescheduleOfMatchDatesByFixtureMatchIdResult" minOccurs="0">
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
    "getRescheduleOfMatchDatesByFixtureMatchIdResult"
})
@XmlRootElement(name = "GetRescheduleOfMatchDatesByFixtureMatchIdResponse", namespace = "http://xmlsoccer.com/")
public class GetRescheduleOfMatchDatesByFixtureMatchIdResponse {

    @XmlElement(name = "GetRescheduleOfMatchDatesByFixtureMatchIdResult", namespace = "http://xmlsoccer.com/")
    protected GetRescheduleOfMatchDatesByFixtureMatchIdResponse.GetRescheduleOfMatchDatesByFixtureMatchIdResult getRescheduleOfMatchDatesByFixtureMatchIdResult;

    /**
     * Gets the value of the getRescheduleOfMatchDatesByFixtureMatchIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetRescheduleOfMatchDatesByFixtureMatchIdResponse.GetRescheduleOfMatchDatesByFixtureMatchIdResult }
     *     
     */
    public GetRescheduleOfMatchDatesByFixtureMatchIdResponse.GetRescheduleOfMatchDatesByFixtureMatchIdResult getGetRescheduleOfMatchDatesByFixtureMatchIdResult() {
        return getRescheduleOfMatchDatesByFixtureMatchIdResult;
    }

    /**
     * Sets the value of the getRescheduleOfMatchDatesByFixtureMatchIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRescheduleOfMatchDatesByFixtureMatchIdResponse.GetRescheduleOfMatchDatesByFixtureMatchIdResult }
     *     
     */
    public void setGetRescheduleOfMatchDatesByFixtureMatchIdResult(GetRescheduleOfMatchDatesByFixtureMatchIdResponse.GetRescheduleOfMatchDatesByFixtureMatchIdResult value) {
        this.getRescheduleOfMatchDatesByFixtureMatchIdResult = value;
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
    public static class GetRescheduleOfMatchDatesByFixtureMatchIdResult {

        @XmlMixed
        @XmlAnyElement(lax = true)
        protected List<Object> content;

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
         * {@link String }
         * {@link Object }
         * 
         * 
         */
        public List<Object> getContent() {
            if (content == null) {
                content = new ArrayList<Object>();
            }
            return this.content;
        }

    }

}
