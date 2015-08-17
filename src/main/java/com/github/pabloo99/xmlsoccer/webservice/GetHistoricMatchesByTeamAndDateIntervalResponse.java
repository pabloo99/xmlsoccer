
package com.github.pabloo99.xmlsoccer.webservice;

import com.github.pabloo99.xmlsoccer.model.xml.GetHistoricMatchesResultXML;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getHistoricMatchesByTeamAndDateIntervalResult"
})
@XmlRootElement(name = "GetHistoricMatchesByTeamAndDateIntervalResponse")
public class GetHistoricMatchesByTeamAndDateIntervalResponse {

    @XmlElement(name = "GetHistoricMatchesByTeamAndDateIntervalResult")
    protected GetHistoricMatchesByTeamAndDateIntervalResponse.GetHistoricMatchesByTeamAndDateIntervalResult getHistoricMatchesByTeamAndDateIntervalResult;

    /**
     * Gets the value of the getHistoricMatchesByTeamAndDateIntervalResult property.
     *
     * @return
     *     possible object is
     *     {@link GetHistoricMatchesByTeamAndDateIntervalResponse.GetHistoricMatchesByTeamAndDateIntervalResult }
     *
     */
    public GetHistoricMatchesByTeamAndDateIntervalResponse.GetHistoricMatchesByTeamAndDateIntervalResult getGetHistoricMatchesByTeamAndDateIntervalResult() {
        return getHistoricMatchesByTeamAndDateIntervalResult;
    }

    /**
     * Sets the value of the getHistoricMatchesByTeamAndDateIntervalResult property.
     *
     * @param value
     *     allowed object is
     *     {@link GetHistoricMatchesByTeamAndDateIntervalResponse.GetHistoricMatchesByTeamAndDateIntervalResult }
     *
     */
    public void setGetHistoricMatchesByTeamAndDateIntervalResult(GetHistoricMatchesByTeamAndDateIntervalResponse.GetHistoricMatchesByTeamAndDateIntervalResult value) {
        this.getHistoricMatchesByTeamAndDateIntervalResult = value;
    }

    public static class GetHistoricMatchesByTeamAndDateIntervalResult {

        @XmlElementRef(name="XMLSOCCER.COM", type=GetHistoricMatchesResultXML.class)
        protected GetHistoricMatchesResultXML content;

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
        public GetHistoricMatchesResultXML getContent() {
            if (content == null) {
                content = new GetHistoricMatchesResultXML();
            }
            return this.content;
        }

    }

}
