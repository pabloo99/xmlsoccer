
package com.github.pabloo99.xmlsoccer.webservice;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getOddsByFixtureMatchId2Result"
})
@XmlRootElement(name = "GetOddsByFixtureMatchId2Response")
public class GetOddsByFixtureMatchId2Response {

    @XmlElement(name = "GetOddsByFixtureMatchId2Result")
    protected GetOddsByFixtureMatchId2Response.GetOddsByFixtureMatchId2Result getOddsByFixtureMatchId2Result;

    /**
     * Gets the value of the getOddsByFixtureMatchId2Result property.
     *
     * @return
     *     possible object is
     *     {@link GetOddsByFixtureMatchId2Response.GetOddsByFixtureMatchId2Result }
     *
     */
    public GetOddsByFixtureMatchId2Response.GetOddsByFixtureMatchId2Result getGetOddsByFixtureMatchId2Result() {
        return getOddsByFixtureMatchId2Result;
    }

    /**
     * Sets the value of the getOddsByFixtureMatchId2Result property.
     *
     * @param value
     *     allowed object is
     *     {@link GetOddsByFixtureMatchId2Response.GetOddsByFixtureMatchId2Result }
     *
     */
    public void setGetOddsByFixtureMatchId2Result(GetOddsByFixtureMatchId2Response.GetOddsByFixtureMatchId2Result value) {
        this.getOddsByFixtureMatchId2Result = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class GetOddsByFixtureMatchId2Result {

        @XmlMixed
        @XmlAnyElement(lax = true)
        protected List<Object> content;

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
        public List<Object> getContent() {
            if (content == null) {
                content = new ArrayList<Object>();
            }
            return this.content;
        }

    }

}
