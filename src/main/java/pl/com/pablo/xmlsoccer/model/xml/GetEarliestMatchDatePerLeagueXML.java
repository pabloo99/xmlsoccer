package pl.com.pablo.xmlsoccer.model.xml;

/**
 * Created by pmazur on 2014-12-21.
 */

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

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
 *         &lt;element name="LeagueInformation">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AccountInformation" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "leagueInformation",
        "accountInformation"
})
@XmlRootElement(name = "XMLSOCCER.COM")
public class GetEarliestMatchDatePerLeagueXML {

    @XmlElement(name = "LeagueInformation", required = true)
    protected GetEarliestMatchDatePerLeagueXML.LeagueInformation leagueInformation;
    @XmlElement(name = "AccountInformation", required = true)
    protected String accountInformation;

    /**
     * Gets the value of the leagueInformation property.
     *
     * @return
     *     possible object is
     *     {@link XMLSOCCERCOM.LeagueInformation }
     *
     */
    public GetEarliestMatchDatePerLeagueXML.LeagueInformation getLeagueInformation() {
        return leagueInformation;
    }

    /**
     * Sets the value of the leagueInformation property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLSOCCERCOM.LeagueInformation }
     *
     */
    public void setLeagueInformation(GetEarliestMatchDatePerLeagueXML.LeagueInformation value) {
        this.leagueInformation = value;
    }

    /**
     * Gets the value of the accountInformation property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAccountInformation() {
        return accountInformation;
    }

    /**
     * Sets the value of the accountInformation property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAccountInformation(String value) {
        this.accountInformation = value;
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
     *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
            "date"
    })
    public static class LeagueInformation {

        @XmlElement(name = "Date", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar date;

        /**
         * Gets the value of the date property.
         *
         * @return
         *     possible object is
         *     {@link javax.xml.datatype.XMLGregorianCalendar }
         *
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         *
         * @param value
         *     allowed object is
         *     {@link javax.xml.datatype.XMLGregorianCalendar }
         *
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
        }

    }

}

