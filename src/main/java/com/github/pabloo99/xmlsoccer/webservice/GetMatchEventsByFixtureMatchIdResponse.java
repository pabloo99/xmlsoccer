
package com.github.pabloo99.xmlsoccer.webservice;

import com.github.pabloo99.xmlsoccer.model.xml.GetMatchEventsXML;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getMatchEventsByFixtureMatchIdResult"
})
@XmlRootElement(name = "GetMatchEventsByFixtureMatchIdResponse")
public class GetMatchEventsByFixtureMatchIdResponse {

    @XmlElement(name = "GetMatchEventsByFixtureMatchIdResult")
    protected GetMatchEventsByFixtureMatchIdResponse.GetMatchEventsByFixtureMatchIdResult getMatchEventsByFixtureMatchIdResult;

    /**
     * Gets the value of the getMatchEventsByFixtureMatchIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetMatchEventsByFixtureMatchIdResponse.GetMatchEventsByFixtureMatchIdResult }
     *     
     */
    public GetMatchEventsByFixtureMatchIdResponse.GetMatchEventsByFixtureMatchIdResult getGetMatchEventsByFixtureMatchIdResult() {
        return getMatchEventsByFixtureMatchIdResult;
    }

    /**
     * Sets the value of the getMatchEventsByFixtureMatchIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMatchEventsByFixtureMatchIdResponse.GetMatchEventsByFixtureMatchIdResult }
     *     
     */
    public void setGetMatchEventsByFixtureMatchIdResult(GetMatchEventsByFixtureMatchIdResponse.GetMatchEventsByFixtureMatchIdResult value) {
        this.getMatchEventsByFixtureMatchIdResult = value;
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
    public static class GetMatchEventsByFixtureMatchIdResult {

        @XmlElementRef(name="XMLSOCCER.COM", type=GetMatchEventsXML.class)
        protected GetMatchEventsXML content;

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
        public GetMatchEventsXML getContent() {
            if (content == null) {
                content = new GetMatchEventsXML();
            }
            return this.content;
        }

    }

}
