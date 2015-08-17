
package com.github.pabloo99.xmlsoccer.webservice;

import com.github.pabloo99.xmlsoccer.model.xml.GetHistoricMatchesResultXML;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getHistoricMatchesByFixtureMatchIDResult"
})
@XmlRootElement(name = "GetHistoricMatchesByFixtureMatchIDResponse")
public class GetHistoricMatchesByFixtureMatchIDResponse {

    @XmlElement(name = "GetHistoricMatchesByFixtureMatchIDResult")
    protected GetHistoricMatchesByFixtureMatchIDResponse.GetHistoricMatchesByFixtureMatchIDResult getHistoricMatchesByFixtureMatchIDResult;

    /**
     * Gets the value of the getHistoricMatchesByFixtureMatchIDResult property.
     *
     * @return
     *     possible object is
     *     {@link GetHistoricMatchesByFixtureMatchIDResponse.GetHistoricMatchesByFixtureMatchIDResult }
     *
     */
    public GetHistoricMatchesByFixtureMatchIDResponse.GetHistoricMatchesByFixtureMatchIDResult getGetHistoricMatchesByFixtureMatchIDResult() {
        return getHistoricMatchesByFixtureMatchIDResult;
    }

    /**
     * Sets the value of the getHistoricMatchesByFixtureMatchIDResult property.
     *
     * @param value
     *     allowed object is
     *     {@link GetHistoricMatchesByFixtureMatchIDResponse.GetHistoricMatchesByFixtureMatchIDResult }
     *
     */
    public void setGetHistoricMatchesByFixtureMatchIDResult(GetHistoricMatchesByFixtureMatchIDResponse.GetHistoricMatchesByFixtureMatchIDResult value) {
        this.getHistoricMatchesByFixtureMatchIDResult = value;
    }

    public static class GetHistoricMatchesByFixtureMatchIDResult {

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
