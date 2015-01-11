package com.github.pabloo99.xmlsoccer.model.enums;

/**
 * Created by pmazur on 2014-12-17.
 */
public enum Leagues {
    ENGLAND_ENGLISH_PREMIER_LEAGUE("English Premier League"),
    ENGLAND_ENGLISH_LEAGUE_CHAMPIONSHIP("English League Championship"),
    SCOTLAND_SCOTTISH_PREMIER_LEAGUE("Scottish Premier League"),
    GERMANY_BUNDESLIGA("Bundesliga"),
    ITALY_SERIE_A("Serie A"),
    ITALY_SERIE_B("Serie B"),
    FRANCE_LIGUE_1("Ligue 1"),
    SPAIN_LA_LIGA("La Liga"),
    GREECE_SUPERLEAGUE_GREECE("Superleague Greece"),
    HOLLAND_EREDIVISIE("Eredivisie"),
    BELGIUM_JUPILER_LEAGUE("Jupiler League"),
    TURKEY_SUPER_LIG("Süper Lig"),
    DENMARK_SUPERLIGA("Superliga"),
    EUROPE_EURO_2012("EURO 2012"),
    EUROPE_CHAMPIONS_LEAGUE("Champions League"),
    EUROPE_EUROPE_LEAGUE("Europe League"),
    PORTUGAL_PRIMEIRA_LIGA("Primeira Liga"),
    SCOTLAND_SCOTTISH_FIRST_DIVISION("Scottish First Division"),
    USA_MAJOR_LEAGUE_SOCCER("Major League Soccer"),
    SWEDEN_ALLSVENSKAN("Allsvenskan"),
    ENGLAND_FA_CUP("FA Cup"),
    ENGLAND_LEAGUE_CUP("League Cup"),
    MEXICO_MEXICAN_PRIMERA_LEAGUE("Mexican Primera League"),
    BRAZIL_BRASILEIRAO("Brasileirao"),
    ENGLAND_ENGLISH_LEAGUE_1("English League 1"),
    ENGLAND_ENGLISH_LEAGUE_2("English League 2"),
    UKRAINE_UKRAINIAN_PREMIER_LEAGUE("Ukrainian Premier League"),
    RUSSIA_RUSSIAN_FOOTBALL_PREMIER_LEAGUE_("Russian Football Premier League "),
    AUSTRALIA_AUSTRALIAN_A_LEAGUE("Australian A-League"),
    INTERNATIONAL_WORLD_CUP_2014("World Cup 2014")
    ;

    private final String text;

    /**
     * @param text
     */
    private Leagues(final String text) {
        this.text = text;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */

    public String getParam() {
        return text;
    }
}