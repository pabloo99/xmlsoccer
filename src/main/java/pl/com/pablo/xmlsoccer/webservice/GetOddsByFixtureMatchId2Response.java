
package pl.com.pablo.xmlsoccer.webservice;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element name="GetOddsByFixtureMatchId2Result" minOccurs="0">
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
