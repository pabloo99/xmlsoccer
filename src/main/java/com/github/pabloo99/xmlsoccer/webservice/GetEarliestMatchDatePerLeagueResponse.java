
package com.github.pabloo99.xmlsoccer.webservice;

import com.github.pabloo99.xmlsoccer.model.xml.GetEarliestMatchDatePerLeagueXML;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getEarliestMatchDatePerLeagueResult"
})
@XmlRootElement(name = "GetEarliestMatchDatePerLeagueResponse")
public class GetEarliestMatchDatePerLeagueResponse {

    @XmlElement(name = "GetEarliestMatchDatePerLeagueResult")
    protected GetEarliestMatchDatePerLeagueResponse.GetEarliestMatchDatePerLeagueResult getEarliestMatchDatePerLeagueResult;

    /**
     * Gets the value of the getEarliestMatchDatePerLeagueResult property.
     *
     * @return
     *     possible object is
     *     {@link GetEarliestMatchDatePerLeagueResponse.GetEarliestMatchDatePerLeagueResult }
     *
     */
    public GetEarliestMatchDatePerLeagueResponse.GetEarliestMatchDatePerLeagueResult getGetEarliestMatchDatePerLeagueResult() {
        return getEarliestMatchDatePerLeagueResult;
    }

    /**
     * Sets the value of the getEarliestMatchDatePerLeagueResult property.
     *
     * @param value
     *     allowed object is
     *     {@link GetEarliestMatchDatePerLeagueResponse.GetEarliestMatchDatePerLeagueResult }
     *
     */
    public void setGetEarliestMatchDatePerLeagueResult(GetEarliestMatchDatePerLeagueResponse.GetEarliestMatchDatePerLeagueResult value) {
        this.getEarliestMatchDatePerLeagueResult = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class GetEarliestMatchDatePerLeagueResult {

        @XmlElementRef(name="XMLSOCCER.COM", type=GetEarliestMatchDatePerLeagueXML.class)
        protected GetEarliestMatchDatePerLeagueXML content;

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
        public GetEarliestMatchDatePerLeagueXML getContent() {
            if (content == null) {
                content = new GetEarliestMatchDatePerLeagueXML();
            }
            return this.content;
        }

    }

}
