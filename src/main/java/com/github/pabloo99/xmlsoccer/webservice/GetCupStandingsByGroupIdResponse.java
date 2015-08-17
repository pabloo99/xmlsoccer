
package com.github.pabloo99.xmlsoccer.webservice;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getCupStandingsByGroupIdResult"
})
@XmlRootElement(name = "GetCupStandingsByGroupIdResponse")
public class GetCupStandingsByGroupIdResponse {

    @XmlElement(name = "GetCupStandingsByGroupIdResult")
    protected GetCupStandingsByGroupIdResponse.GetCupStandingsByGroupIdResult getCupStandingsByGroupIdResult;

    /**
     * Gets the value of the getCupStandingsByGroupIdResult property.
     *
     * @return
     *     possible object is
     *     {@link GetCupStandingsByGroupIdResponse.GetCupStandingsByGroupIdResult }
     *
     */
    public GetCupStandingsByGroupIdResponse.GetCupStandingsByGroupIdResult getGetCupStandingsByGroupIdResult() {
        return getCupStandingsByGroupIdResult;
    }

    /**
     * Sets the value of the getCupStandingsByGroupIdResult property.
     *
     * @param value
     *     allowed object is
     *     {@link GetCupStandingsByGroupIdResponse.GetCupStandingsByGroupIdResult }
     *
     */
    public void setGetCupStandingsByGroupIdResult(GetCupStandingsByGroupIdResponse.GetCupStandingsByGroupIdResult value) {
        this.getCupStandingsByGroupIdResult = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class GetCupStandingsByGroupIdResult {

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
         * {@link Object }
         * {@link String }
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
