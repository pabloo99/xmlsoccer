package com.github.pabloo99.xmlsoccer.model.enums;

public enum Leagues {
    ENGLISH_PREMIER_LEAGUE("English Premier League"),
    ENGLISH_LEAGUE_CHAMPIONSHIP("English League Championship"),
    SCOTTISH_PREMIER_LEAGUE("Scottish Premier League"),
    BUNDESLIGA("Bundesliga"),
    SERIE_A("Serie A"),
    SERIE_B("Serie B"),
    LIGUE_1("Ligue 1"),
    LA_LIGA("La Liga"),
    SUPERLEAGUE_GREECE("Superleague Greece"),
    EREDIVISIE("Eredivisie"),
    JUPILER_LEAGUE("Jupiler League"),
    SUPER_LIG("Süper Lig"),
    SUPERLIGA("Superliga"),
    EURO_2012("EURO 2012"),
    CHAMPIONS_LEAGUE("Champions League"),
    EUROPE_LEAGUE("Europe League"),
    PRIMEIRA_LIGA("Primeira Liga"),
    SCOTTISH_FIRST_DIVISION("Scottish First Division"),
    MAJOR_LEAGUE_SOCCER("Major League Soccer"),
    ALLSVENSKAN("Allsvenskan"),
    FA_CUP("FA Cup"),
    LEAGUE_CUP("League Cup"),
    MEXICAN_PRIMERA_LEAGUE("Mexican Primera League"),
    BRASILEIRAO("Brasileirao"),
    ENGLISH_LEAGUE_1("English League 1"),
    ENGLISH_LEAGUE_2("English League 2"),
    UKRAINIAN_PREMIER_LEAGUE("Ukrainian Premier League"),
    RUSSIAN_FOOTBALL_PREMIER_LEAGUE("Russian Football Premier League"),
    AUSTRALIAN_A_LEAGUE("Australian A-League"),
    TIPPELIGAEN("Tippeligaen"),
    CHINESE_SUPER_LEAGUE("Chinese Super League"),
    LEGA_PRO("Lega Pro"),
    BUNDESLIGA_2("2. Bundesliga"),
    ADELANTE("Adelante"),
    LIGUE_2("Ligue 2"),
    SUPERETTAN("Superettan"),
    BRASILEIRAO_SERIE_B("Brasileirão Série B"),
    NORWEGIAN_1_DIVISJON("Norwegian 1. Divisjon"),
    EKSTRAKLASA("Ekstraklasa"),
    PRIMERA_DIVISION("Primera Division"),
    EURO_2016("EURO 2016");

    private final String text;

    Leagues(final String text) {
        this.text = text;
    }

    public String getParam() {
        return text;
    }
}