package com.github.pabloo99.xmlsoccer.model.enums;

public enum Seasons {
    SEASON_1999_2000("9900"),
    SEASON_2000_2001("0001"),
    SEASON_2001_2002("0102"),
    SEASON_2002_2003("0203"),
    SEASON_2003_2004("0304"),
    SEASON_2004_2005("0405"),
    SEASON_2005_2006("0506"),
    SEASON_2006_2007("0607"),
    SEASON_2007_2008("0708"),
    SEASON_2008_2009("0809"),
    SEASON_2009_2010("0910"),
    SEASON_2010_2011("1011"),
    SEASON_2011_2012("1112"),
    SEASON_2012_2013("1213"),
    SEASON_2013_2014("1314"),
    SEASON_2014_2015("1415"),
    SEASON_2015_2016("1516"),
    SEASON_2016_2017("1617");

    private final String text;

    Seasons(final String text) {
        this.text = text;
    }

    public String getParam() {
        return text;
    }
}
