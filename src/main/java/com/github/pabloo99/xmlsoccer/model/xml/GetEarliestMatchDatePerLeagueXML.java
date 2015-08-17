package com.github.pabloo99.xmlsoccer.model.xml;

import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "leagueInformation",
        "accountInformation"
})
@XmlRootElement(name = "XMLSOCCER.COM")
@Data
public class GetEarliestMatchDatePerLeagueXML {

    @XmlElement(name = "LeagueInformation", required = true)
    protected GetEarliestMatchDatePerLeagueXML.LeagueInformation leagueInformation;
    @XmlElement(name = "AccountInformation", required = true)
    protected String accountInformation;

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "date"
    })
    @Data
    public static class LeagueInformation {

        @XmlElement(name = "Date", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar date;
    }

}

