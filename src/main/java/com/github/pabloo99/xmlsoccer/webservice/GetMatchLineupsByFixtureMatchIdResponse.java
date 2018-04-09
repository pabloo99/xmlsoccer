
package com.github.pabloo99.xmlsoccer.webservice;

import com.github.pabloo99.xmlsoccer.model.xml.GetMatchLineupsXML;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getMatchLineupsByFixtureMatchIdResult"
})
@XmlRootElement(name = "GetMatchLineupsByFixtureMatchIdResponse", namespace = "http://xmlsoccer.com/")
public class GetMatchLineupsByFixtureMatchIdResponse {

    @XmlElement(name = "GetMatchLineupsByFixtureMatchIdResult", namespace = "http://xmlsoccer.com/")
    protected GetMatchLineupsByFixtureMatchIdResponse.GetMatchLineupsByFixtureMatchIdResult getMatchLineupsByFixtureMatchIdResult;

    /**
     * Gets the value of the getMatchLineupsByFixtureMatchIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetMatchLineupsByFixtureMatchIdResponse.GetMatchLineupsByFixtureMatchIdResult }
     *     
     */
    public GetMatchLineupsByFixtureMatchIdResponse.GetMatchLineupsByFixtureMatchIdResult getGetMatchLineupsByFixtureMatchIdResult() {
        return getMatchLineupsByFixtureMatchIdResult;
    }

    /**
     * Sets the value of the getMatchLineupsByFixtureMatchIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMatchLineupsByFixtureMatchIdResponse.GetMatchLineupsByFixtureMatchIdResult }
     *     
     */
    public void setGetMatchLineupsByFixtureMatchIdResult(GetMatchLineupsByFixtureMatchIdResponse.GetMatchLineupsByFixtureMatchIdResult value) {
        this.getMatchLineupsByFixtureMatchIdResult = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class GetMatchLineupsByFixtureMatchIdResult {

        @XmlElementRef(name="XMLSOCCER.COM", type=GetMatchLineupsXML.class)
        protected GetMatchLineupsXML content;

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
        public GetMatchLineupsXML getContent() {
            if (content == null) {
                content = new GetMatchLineupsXML();
            }
            return this.content;
        }
    }
}
