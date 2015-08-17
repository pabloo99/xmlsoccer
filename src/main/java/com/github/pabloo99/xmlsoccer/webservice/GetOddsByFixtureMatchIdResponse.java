
package com.github.pabloo99.xmlsoccer.webservice;

import com.github.pabloo99.xmlsoccer.model.xml.GetOddsByFixtureMatchIdResultXML;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getOddsByFixtureMatchIdResult"
})
@XmlRootElement(name = "GetOddsByFixtureMatchIdResponse")
public class GetOddsByFixtureMatchIdResponse {

    @XmlElement(name = "GetOddsByFixtureMatchIdResult")
    protected GetOddsByFixtureMatchIdResponse.GetOddsByFixtureMatchIdResult getOddsByFixtureMatchIdResult;

    /**
     * Gets the value of the getOddsByFixtureMatchIdResult property.
     *
     * @return
     *     possible object is
     *     {@link GetOddsByFixtureMatchIdResponse.GetOddsByFixtureMatchIdResult }
     *
     */
    public GetOddsByFixtureMatchIdResponse.GetOddsByFixtureMatchIdResult getGetOddsByFixtureMatchIdResult() {
        return getOddsByFixtureMatchIdResult;
    }

    /**
     * Sets the value of the getOddsByFixtureMatchIdResult property.
     *
     * @param value
     *     allowed object is
     *     {@link GetOddsByFixtureMatchIdResponse.GetOddsByFixtureMatchIdResult }
     *
     */
    public void setGetOddsByFixtureMatchIdResult(GetOddsByFixtureMatchIdResponse.GetOddsByFixtureMatchIdResult value) {
        this.getOddsByFixtureMatchIdResult = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class GetOddsByFixtureMatchIdResult {

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
