
package com.github.pabloo99.xmlsoccer.webservice;

import com.github.pabloo99.xmlsoccer.model.xml.GetLiveScoreResultXML;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getLiveScoreResult"
})
@XmlRootElement(name = "GetLiveScoreResponse")
public class GetLiveScoreResponse {

    @XmlElement(name = "GetLiveScoreResult")
    protected GetLiveScoreResponse.GetLiveScoreResult getLiveScoreResult;

    /**
     * Gets the value of the getLiveScoreResult property.
     *
     * @return
     *     possible object is
     *     {@link GetLiveScoreResponse.GetLiveScoreResult }
     *
     */
    public GetLiveScoreResponse.GetLiveScoreResult getGetLiveScoreResult() {
        return getLiveScoreResult;
    }

    /**
     * Sets the value of the getLiveScoreResult property.
     *
     * @param value
     *     allowed object is
     *     {@link GetLiveScoreResponse.GetLiveScoreResult }
     *
     */
    public void setGetLiveScoreResult(GetLiveScoreResponse.GetLiveScoreResult value) {
        this.getLiveScoreResult = value;
    }

    public static class GetLiveScoreResult {

        @XmlElementRef(name="XMLSOCCER.COM", type=GetLiveScoreResultXML.class)
        protected GetLiveScoreResultXML content;

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
        public GetLiveScoreResultXML getContent() {
            if (content == null) {
                content = new GetLiveScoreResultXML();
            }
            return this.content;
        }

    }

}
