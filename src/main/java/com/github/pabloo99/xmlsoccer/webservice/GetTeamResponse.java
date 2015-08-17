
package com.github.pabloo99.xmlsoccer.webservice;

import com.github.pabloo99.xmlsoccer.model.xml.GetTeamResultXML;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getTeamResult"
})
@XmlRootElement(name = "GetTeamResponse")
public class GetTeamResponse {

    @XmlElement(name = "GetTeamResult")
    protected GetTeamResponse.GetTeamResult getTeamResult;

    /**
     * Gets the value of the getTeamResult property.
     *
     * @return
     *     possible object is
     *     {@link GetTeamResponse.GetTeamResult }
     *
     */
    public GetTeamResponse.GetTeamResult getGetTeamResult() {
        return getTeamResult;
    }

    /**
     * Sets the value of the getTeamResult property.
     *
     * @param value
     *     allowed object is
     *     {@link GetTeamResponse.GetTeamResult }
     *
     */
    public void setGetTeamResult(GetTeamResponse.GetTeamResult value) {
        this.getTeamResult = value;
    }

    public static class GetTeamResult {

        @XmlElementRef(name="XMLSOCCER.COM", type=GetTeamResultXML.class)
        protected GetTeamResultXML content;

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
        public GetTeamResultXML getContent() {
            if (content == null) {
                content = new GetTeamResultXML();
            }
            return this.content;
        }

    }

}
