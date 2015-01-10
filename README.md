# XMLSoccer
Java client for XMLSoccer API

# API Reference
http://xmlsoccer.wikia.com/wiki/Main_Page

# Motivation
The project aims to facilitate the use of the API XMLSoccer.com
if someone wants to create its own application to the presentation live scores
and statistics available on the site using Java.

# Requirements
- Java 7 (Not tested using the Java 8)
- if you want to make some changes in this project you should install
  in your development environment (I used IntelliJ IDEA) plugin lombok if you do not have
  link: https://plugins.jetbrains.com/plugin/6317

# Code Example

```
import pl.com.pablo.xmlsoccer.api.dto.GetLiveScoreResultDto;
import pl.com.pablo.xmlsoccer.api.service.XmlSoccerService;
import pl.com.pablo.xmlsoccer.client.XmlSoccerServiceImpl;
import pl.com.pablo.xmlsoccer.api.dto.GetLeagueStandingsResultDto;
import pl.com.pablo.xmlsoccer.api.dto.GetTeamResultDto;
import pl.com.pablo.xmlsoccer.model.enums.Leagues;
import pl.com.pablo.xmlsoccer.model.enums.Seasons;

import java.util.List;

/**
 * Created by pmazur on 2014-11-30.
 */
public class Main {

    public static void main(String[] args)
    {
        XmlSoccerService xmlSoccerService = new XmlSoccerServiceImpl();
        xmlSoccerService.setApiKey("YOUR API KEY");

        // demo access
        xmlSoccerService.setServiceUrl("http://www.xmlsoccer.com/FootballDataDemo.asmx");

         // full access
         //xmlSoccerService.setServiceUrl("http://www.xmlsoccer.com/FootballData.asmx");

        GetTeamResultDto getTeamResultDto = xmlSoccerService.getTeam("Celtic");
        System.out.println(getTeamResultDto.toString());

        List<GetLiveScoreResultDto> getLiveScoreResultDto = xmlSoccerService.getLiveScore();
        System.out.println(getLiveScoreResultDto.toString());

        List<GetLeagueStandingsResultDto> getLeagueStandingsResultDtoList = xmlSoccerService.getLeagueStandingsBySeason("Scottish Premier League", "1415");
        System.out.println(getLeagueStandingsResultDtoList.toString());

        /* to pass in a parameter the name of the league or the season,
        ** you can use specially prepared enumerated type,
        ** which can be found in the package pl.com.pablo.xmlsoccer.model.enums
        **
        ** example:
        ** List<GetLeagueStandingsResultDto> getLeagueStandingsResultDtoList = xmlSoccerService.getLeagueStandingsBySeason(Leagues.SCOTLAND_SCOTTISH_PREMIER_LEAGUE.getParam(), Seasons.SEASON_2014_2015.getParam());
        ** System.out.println(getLeagueStandingsResultDtoList.toString());
        */

    }
}
```

# Contributing
Pull requests are welcome:)

# License
The MIT License (MIT)

Copyright (c) 2015 Paweł Mazur

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

