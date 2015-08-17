
package com.github.pabloo99.xmlsoccer.webservice;

import com.github.pabloo99.xmlsoccer.model.xml.GetHistoricMatchesResultXML;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getHistoricMatchesByTeamsAndDateIntervalResult"
})
@XmlRootElement(name = "GetHistoricMatchesByTeamsAndDateIntervalResponse")
public class GetHistoricMatchesByTeamsAndDateIntervalResponse {

    @XmlElement(name = "GetHistoricMatchesByTeamsAndDateIntervalResult")
    protected GetHistoricMatchesByTeamsAndDateIntervalResponse.GetHistoricMatchesByTeamsAndDateIntervalResult getHistoricMatchesByTeamsAndDateIntervalResult;

    /**
     * Gets the value of the getHistoricMatchesByTeamsAndDateIntervalResult property.
     *
     * @return
     *     possible object is
     *     {@link GetHistoricMatchesByTeamsAndDateIntervalResponse.GetHistoricMatchesByTeamsAndDateIntervalResult }
     *
     */
    public GetHistoricMatchesByTeamsAndDateIntervalResponse.GetHistoricMatchesByTeamsAndDateIntervalResult getGetHistoricMatchesByTeamsAndDateIntervalResult() {
        return getHistoricMatchesByTeamsAndDateIntervalResult;
    }

    /**
     * Sets the value of the getHistoricMatchesByTeamsAndDateIntervalResult property.
     *
     * @param value
     *     allowed object is
     *     {@link GetHistoricMatchesByTeamsAndDateIntervalResponse.GetHistoricMatchesByTeamsAndDateIntervalResult }
     *
     */
    public void setGetHistoricMatchesByTeamsAndDateIntervalResult(GetHistoricMatchesByTeamsAndDateIntervalResponse.GetHistoricMatchesByTeamsAndDateIntervalResult value) {
        this.getHistoricMatchesByTeamsAndDateIntervalResult = value;
    }

    public static class GetHistoricMatchesByTeamsAndDateIntervalResult {

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
