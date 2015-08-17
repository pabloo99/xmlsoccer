
package com.github.pabloo99.xmlsoccer.webservice;

import com.github.pabloo99.xmlsoccer.model.xml.GetFixturesResultXML;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getFixturesByDateIntervalAndLeagueResult"
})
@XmlRootElement(name = "GetFixturesByDateIntervalAndLeagueResponse")
public class GetFixturesByDateIntervalAndLeagueResponse {

    @XmlElement(name = "GetFixturesByDateIntervalAndLeagueResult")
    protected GetFixturesByDateIntervalAndLeagueResponse.GetFixturesByDateIntervalAndLeagueResult getFixturesByDateIntervalAndLeagueResult;

    /**
     * Gets the value of the getFixturesByDateIntervalAndLeagueResult property.
     *
     * @return
     *     possible object is
     *     {@link GetFixturesByDateIntervalAndLeagueResponse.GetFixturesByDateIntervalAndLeagueResult }
     *
     */
    public GetFixturesByDateIntervalAndLeagueResponse.GetFixturesByDateIntervalAndLeagueResult getGetFixturesByDateIntervalAndLeagueResult() {
        return getFixturesByDateIntervalAndLeagueResult;
    }

    /**
     * Sets the value of the getFixturesByDateIntervalAndLeagueResult property.
     *
     * @param value
     *     allowed object is
     *     {@link GetFixturesByDateIntervalAndLeagueResponse.GetFixturesByDateIntervalAndLeagueResult }
     *
     */
    public void setGetFixturesByDateIntervalAndLeagueResult(GetFixturesByDateIntervalAndLeagueResponse.GetFixturesByDateIntervalAndLeagueResult value) {
        this.getFixturesByDateIntervalAndLeagueResult = value;
    }

    public static class GetFixturesByDateIntervalAndLeagueResult {

        @XmlElementRef(name="XMLSOCCER.COM", type=GetFixturesResultXML.class)
        protected GetFixturesResultXML content;

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
        public GetFixturesResultXML getContent() {
            if (content == null) {
                content = new GetFixturesResultXML();
            }
            return this.content;
        }

    }

}
