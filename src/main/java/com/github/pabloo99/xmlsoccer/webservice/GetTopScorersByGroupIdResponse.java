
package com.github.pabloo99.xmlsoccer.webservice;

import com.github.pabloo99.xmlsoccer.model.xml.GetTopScorersResultXML;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getTopScorersByGroupIdResult"
})
@XmlRootElement(name = "GetTopScorersByGroupIdResponse")
public class GetTopScorersByGroupIdResponse {

    @XmlElement(name = "GetTopScorersByGroupIdResult")
    protected GetTopScorersByGroupIdResponse.GetTopScorersByGroupIdResult getTopScorersByGroupIdResult;

    /**
     * Gets the value of the getTopScorersByGroupIdResult property.
     *
     * @return
     *     possible object is
     *     {@link GetTopScorersByGroupIdResponse.GetTopScorersByGroupIdResult }
     *
     */
    public GetTopScorersByGroupIdResponse.GetTopScorersByGroupIdResult getGetTopScorersByGroupIdResult() {
        return getTopScorersByGroupIdResult;
    }

    /**
     * Sets the value of the getTopScorersByGroupIdResult property.
     *
     * @param value
     *     allowed object is
     *     {@link GetTopScorersByGroupIdResponse.GetTopScorersByGroupIdResult }
     *
     */
    public void setGetTopScorersByGroupIdResult(GetTopScorersByGroupIdResponse.GetTopScorersByGroupIdResult value) {
        this.getTopScorersByGroupIdResult = value;
    }

    public static class GetTopScorersByGroupIdResult {

        @XmlElementRef(name="XMLSOCCER.COM", type=GetTopScorersResultXML.class)
        protected GetTopScorersResultXML content;

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
        public GetTopScorersResultXML getContent() {
            if (content == null) {
                content = new GetTopScorersResultXML();
            }
            return this.content;
        }

    }

}
