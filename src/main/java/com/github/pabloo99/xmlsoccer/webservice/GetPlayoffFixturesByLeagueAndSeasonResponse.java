package com.github.pabloo99.xmlsoccer.webservice;

import com.github.pabloo99.xmlsoccer.model.xml.GetFixturesResultXML;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getPlayoffFixturesByLeagueAndSeasonResult"
})
@XmlRootElement(name = "GetPlayoffFixturesByLeagueAndSeasonResponse")
public class GetPlayoffFixturesByLeagueAndSeasonResponse {

    @XmlElement(name = "GetPlayoffFixturesByLeagueAndSeasonResult")
    protected GetPlayoffFixturesByLeagueAndSeasonResult getPlayoffFixturesByLeagueAndSeasonResult;

    /**
     * Gets the value of the getPlayoffFixturesByLeagueAndSeasonResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetPlayoffFixturesByLeagueAndSeasonResult }
     *     
     */
    public GetPlayoffFixturesByLeagueAndSeasonResult getGetPlayoffFixturesByLeagueAndSeasonResult() {
        return getPlayoffFixturesByLeagueAndSeasonResult;
    }

    /**
     * Sets the value of the getPlayoffFixturesByLeagueAndSeasonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPlayoffFixturesByLeagueAndSeasonResult }
     *     
     */
    public void setGetPlayoffFixturesByLeagueAndSeasonResult(GetPlayoffFixturesByLeagueAndSeasonResult value) {
        this.getPlayoffFixturesByLeagueAndSeasonResult = value;
    }

    public static class GetPlayoffFixturesByLeagueAndSeasonResult {

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
         * {@link String }         *
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
