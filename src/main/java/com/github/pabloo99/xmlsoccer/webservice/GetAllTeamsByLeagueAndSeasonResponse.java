
package com.github.pabloo99.xmlsoccer.webservice;

import com.github.pabloo99.xmlsoccer.model.xml.GetAllTeamsByLeagueAndSeasonResultXML;
import com.github.pabloo99.xmlsoccer.model.xml.GetAllTeamsResultXML;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getAllTeamsByLeagueAndSeasonResult"
})
@XmlRootElement(name = "GetAllTeamsByLeagueAndSeasonResponse")
public class GetAllTeamsByLeagueAndSeasonResponse {

    @XmlElement(name = "GetAllTeamsByLeagueAndSeasonResult")
    protected GetAllTeamsByLeagueAndSeasonResponse.GetAllTeamsByLeagueAndSeasonResult getAllTeamsByLeagueAndSeasonResult;

    /**
     * Gets the value of the getAllTeamsByLeagueAndSeasonResult property.
     *
     * @return
     *     possible object is
     *     {@link GetAllTeamsByLeagueAndSeasonResponse.GetAllTeamsByLeagueAndSeasonResult }
     *
     */
    public GetAllTeamsByLeagueAndSeasonResponse.GetAllTeamsByLeagueAndSeasonResult getGetAllTeamsByLeagueAndSeasonResult() {
        return getAllTeamsByLeagueAndSeasonResult;
    }

    /**
     * Sets the value of the getAllTeamsByLeagueAndSeasonResult property.
     *
     * @param value
     *     allowed object is
     *     {@link GetAllTeamsByLeagueAndSeasonResponse.GetAllTeamsByLeagueAndSeasonResult }
     *
     */
    public void setGetAllTeamsByLeagueAndSeasonResult(GetAllTeamsByLeagueAndSeasonResponse.GetAllTeamsByLeagueAndSeasonResult value) {
        this.getAllTeamsByLeagueAndSeasonResult = value;
    }

    public static class GetAllTeamsByLeagueAndSeasonResult {

        @XmlElementRef(name="XMLSOCCER.COM", type=GetAllTeamsByLeagueAndSeasonResultXML.class)
        protected GetAllTeamsByLeagueAndSeasonResultXML content;

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
        public GetAllTeamsByLeagueAndSeasonResultXML getContent() {
            if (content == null) {
                content = new GetAllTeamsByLeagueAndSeasonResultXML();
            }
            return this.content;
        }

    }

}
