
package com.github.pabloo99.xmlsoccer.webservice;

import com.github.pabloo99.xmlsoccer.model.xml.GetAllTeamsByLeagueAndSeasonResultXML;
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
 *         &lt;element name="GetAllTeamsByLeagueAndSeasonResult" minOccurs="0">
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
