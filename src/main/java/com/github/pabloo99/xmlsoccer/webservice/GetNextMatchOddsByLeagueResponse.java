
package com.github.pabloo99.xmlsoccer.webservice;

import com.github.pabloo99.xmlsoccer.model.xml.GetOddsByFixtureMatchIdResultXML;

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
 *         &lt;element name="GetNextMatchOddsByLeagueResult" minOccurs="0">
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
    "getNextMatchOddsByLeagueResult"
})
@XmlRootElement(name = "GetNextMatchOddsByLeagueResponse")
public class GetNextMatchOddsByLeagueResponse {

    @XmlElement(name = "GetNextMatchOddsByLeagueResult")
    protected GetNextMatchOddsByLeagueResponse.GetNextMatchOddsByLeagueResult getNextMatchOddsByLeagueResult;

    /**
     * Gets the value of the getNextMatchOddsByLeagueResult property.
     *
     * @return
     *     possible object is
     *     {@link GetNextMatchOddsByLeagueResponse.GetNextMatchOddsByLeagueResult }
     *
     */
    public GetNextMatchOddsByLeagueResponse.GetNextMatchOddsByLeagueResult getGetNextMatchOddsByLeagueResult() {
        return getNextMatchOddsByLeagueResult;
    }

    /**
     * Sets the value of the getNextMatchOddsByLeagueResult property.
     *
     * @param value
     *     allowed object is
     *     {@link GetNextMatchOddsByLeagueResponse.GetNextMatchOddsByLeagueResult }
     *
     */
    public void setGetNextMatchOddsByLeagueResult(GetNextMatchOddsByLeagueResponse.GetNextMatchOddsByLeagueResult value) {
        this.getNextMatchOddsByLeagueResult = value;
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
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class GetNextMatchOddsByLeagueResult {

        @XmlElementRef(name="XMLSOCCER.COM", type=GetOddsByFixtureMatchIdResultXML.class)
        protected GetOddsByFixtureMatchIdResultXML content;

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
        public GetOddsByFixtureMatchIdResultXML getContent() {
            if (content == null) {
                content = new GetOddsByFixtureMatchIdResultXML();
            }
            return this.content;
        }

    }

}
