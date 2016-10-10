package com.github.pabloo99.xmlsoccer.model.xml;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "topscorer",
        "accountInformation"
})
@XmlRootElement(name = "XMLSOCCER.COM")
@Data
public class GetTopScorersResultXML {

    @XmlElement(name = "Topscorer")
    protected List<Topscorer> topscorer;
    @XmlElement(name = "AccountInformation", required = true)
    protected String accountInformation;

    public List<Topscorer> getTopscorer() {
        if (topscorer == null) {
            topscorer = new ArrayList<Topscorer>();
        }
        return this.topscorer;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "rank",
            "name",
            "teamName",
            "teamId",
            "nationality",
            "goals",
            "firstScorer",
            "penalties",
            "missedPenalties"
    })
    @Data
    public static class Topscorer {

        @XmlElement(name = "Rank")
        protected int rank;
        @XmlElement(name = "Name", required = true)
        protected String name;
        @XmlElement(name = "TeamName", required = true)
        protected String teamName;
        @XmlElement(name = "Team_Id")
        protected int teamId;
        @XmlElement(name = "Nationality", required = true)
        protected String nationality;
        @XmlElement(name = "Goals")
        protected int goals;
        @XmlElement(name = "FirstScorer")
        protected int firstScorer;
        @XmlElement(name = "Penalties")
        protected int penalties;
        @XmlElement(name = "MissedPenalties")
        protected int missedPenalties;
        @XmlTransient
        protected String leagueName;
        @XmlTransient
        protected String season;
        @XmlTransient
        protected int id;
    }
}
