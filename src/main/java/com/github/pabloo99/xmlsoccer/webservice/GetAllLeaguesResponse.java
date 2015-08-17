
package com.github.pabloo99.xmlsoccer.webservice;

import com.github.pabloo99.xmlsoccer.model.xml.GetAllLeaguesResultXML;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getAllLeaguesResult"
})
@XmlRootElement(name = "GetAllLeaguesResponse")
public class GetAllLeaguesResponse {

    @XmlElement(name = "GetAllLeaguesResult")
    protected GetAllLeaguesResponse.GetAllLeaguesResult getAllLeaguesResult;

    /**
     * Gets the value of the getAllLeaguesResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetAllLeaguesResponse.GetAllLeaguesResult }
     *     
     */
    public GetAllLeaguesResponse.GetAllLeaguesResult getGetAllLeaguesResult() {
        return getAllLeaguesResult;
    }

    /**
     * Sets the value of the getAllLeaguesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAllLeaguesResponse.GetAllLeaguesResult }
     *     
     */
    public void setGetAllLeaguesResult(GetAllLeaguesResponse.GetAllLeaguesResult value) {
        this.getAllLeaguesResult = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })

   // @XmlRootElement(name = "League")
   // @XmlSeeAlso(GetAllLeaguesResultXML.class)
    public static class GetAllLeaguesResult {

        //@XmlMixed
        //@XmlAnyElement(lax = true)
        @XmlElementRef(name="XMLSOCCER.COM", type=GetAllLeaguesResultXML.class)
        protected GetAllLeaguesResultXML content;

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
        public GetAllLeaguesResultXML getContent() {
            if (content == null) {
                content = new GetAllLeaguesResultXML();
            }
            return this.content;
        }

    }

}
