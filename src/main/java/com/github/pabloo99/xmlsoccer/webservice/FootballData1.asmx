<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://xmlsoccer.com/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://xmlsoccer.com/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://xmlsoccer.com/">
      <s:element name="GetHistoricMatchesByTeamAndDateInterval">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ApiKey" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="teamId" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="startDateString" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="endDateString" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetHistoricMatchesByTeamAndDateIntervalResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetHistoricMatchesByTeamAndDateIntervalResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFixturesByDateIntervalAndTeam">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ApiKey" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="startDateString" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="endDateString" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="teamId" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFixturesByDateIntervalAndTeamResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFixturesByDateIntervalAndTeamResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFixturesByLeagueAndSeason">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ApiKey" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="seasonDateString" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="league" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFixturesByLeagueAndSeasonResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFixturesByLeagueAndSeasonResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetHistoricMatchesByID">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ApiKey" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="Id" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetHistoricMatchesByIDResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetHistoricMatchesByIDResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetHistoricMatchesByFixtureMatchID">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ApiKey" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="Id" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetHistoricMatchesByFixtureMatchIDResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetHistoricMatchesByFixtureMatchIDResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetTopScorersByLeagueAndSeason">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ApiKey" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="league" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="seasonDateString" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetTopScorersByLeagueAndSeasonResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetTopScorersByLeagueAndSeasonResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetTopScorersByGroupId">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ApiKey" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="groupId" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetTopScorersByGroupIdResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetTopScorersByGroupIdResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetHistoricMatchesByLeagueAndDateInterval">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ApiKey" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="league" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="startDateString" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="endDateString" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetHistoricMatchesByLeagueAndDateIntervalResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetHistoricMatchesByLeagueAndDateIntervalResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetHistoricMatchesByLeagueAndSeason">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ApiKey" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="league" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="seasonDateString" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetHistoricMatchesByLeagueAndSeasonResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetHistoricMatchesByLeagueAndSeasonResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetHistoricMatchesByTeamsAndDateInterval">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ApiKey" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="team1Id" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="team2Id" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="startDateString" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="endDateString" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetHistoricMatchesByTeamsAndDateIntervalResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetHistoricMatchesByTeamsAndDateIntervalResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFixturesByDateInterval">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ApiKey" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="startDateString" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="endDateString" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFixturesByDateIntervalResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFixturesByDateIntervalResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFixturesByDateIntervalAndLeague">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="league" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="ApiKey" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="startDateString" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="endDateString" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFixturesByDateIntervalAndLeagueResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFixturesByDateIntervalAndLeagueResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAllTeams">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ApiKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAllTeamsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetAllTeamsResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAllLeagues">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ApiKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAllLeaguesResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetAllLeaguesResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAllGroupsByLeagueAndSeason">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ApiKey" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="league" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="seasonDateString" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAllGroupsByLeagueAndSeasonResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetAllGroupsByLeagueAndSeasonResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetLeagueStandingsBySeason">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ApiKey" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="league" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="seasonDateString" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetLeagueStandingsBySeasonResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetLeagueStandingsBySeasonResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCupStandingsByGroupId">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ApiKey" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="group_Id" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCupStandingsByGroupIdResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetCupStandingsByGroupIdResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAllTeamsByLeagueAndSeason">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ApiKey" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="league" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="seasonDateString" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAllTeamsByLeagueAndSeasonResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetAllTeamsByLeagueAndSeasonResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetEarliestMatchDatePerLeague">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ApiKey" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="league" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetEarliestMatchDatePerLeagueResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetEarliestMatchDatePerLeagueResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetLiveScore">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ApiKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetLiveScoreResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetLiveScoreResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetLiveScoreByLeague">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ApiKey" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="league" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetLiveScoreByLeagueResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetLiveScoreByLeagueResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetPlayersByTeam">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ApiKey" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="teamId" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetPlayersByTeamResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetPlayersByTeamResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetPlayerById">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ApiKey" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="playerId" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetPlayerByIdResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetPlayerByIdResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetTeam">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ApiKey" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="teamName" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetTeamResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetTeamResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetOddsByFixtureMatchId">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ApiKey" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="fixtureMatch_Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetOddsByFixtureMatchIdResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetOddsByFixtureMatchIdResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetOddsByFixtureMatchId2">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ApiKey" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="fixtureMatch_Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetOddsByFixtureMatchId2Response">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetOddsByFixtureMatchId2Result">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAllOddsByFixtureMatchId">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ApiKey" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="fixtureMatch_Id" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAllOddsByFixtureMatchIdResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetAllOddsByFixtureMatchIdResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetNextMatchOddsByLeague">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ApiKey" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="league" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetNextMatchOddsByLeagueResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetNextMatchOddsByLeagueResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CheckApiKey">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ApiKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CheckApiKeyResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CheckApiKeyResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ImAlive">
        <s:complexType />
      </s:element>
      <s:element name="ImAliveResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ImAliveResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="string" nillable="true" type="s:string" />
    </s:schema>
  </wsdl:types>
  <wsdl:message name="GetHistoricMatchesByTeamAndDateIntervalSoapIn">
    <wsdl:part name="parameters" element="tns:GetHistoricMatchesByTeamAndDateInterval" />
  </wsdl:message>
  <wsdl:message name="GetHistoricMatchesByTeamAndDateIntervalSoapOut">
    <wsdl:part name="parameters" element="tns:GetHistoricMatchesByTeamAndDateIntervalResponse" />
  </wsdl:message>
  <wsdl:message name="GetFixturesByDateIntervalAndTeamSoapIn">
    <wsdl:part name="parameters" element="tns:GetFixturesByDateIntervalAndTeam" />
  </wsdl:message>
  <wsdl:message name="GetFixturesByDateIntervalAndTeamSoapOut">
    <wsdl:part name="parameters" element="tns:GetFixturesByDateIntervalAndTeamResponse" />
  </wsdl:message>
  <wsdl:message name="GetFixturesByLeagueAndSeasonSoapIn">
    <wsdl:part name="parameters" element="tns:GetFixturesByLeagueAndSeason" />
  </wsdl:message>
  <wsdl:message name="GetFixturesByLeagueAndSeasonSoapOut">
    <wsdl:part name="parameters" element="tns:GetFixturesByLeagueAndSeasonResponse" />
  </wsdl:message>
  <wsdl:message name="GetHistoricMatchesByIDSoapIn">
    <wsdl:part name="parameters" element="tns:GetHistoricMatchesByID" />
  </wsdl:message>
  <wsdl:message name="GetHistoricMatchesByIDSoapOut">
    <wsdl:part name="parameters" element="tns:GetHistoricMatchesByIDResponse" />
  </wsdl:message>
  <wsdl:message name="GetHistoricMatchesByFixtureMatchIDSoapIn">
    <wsdl:part name="parameters" element="tns:GetHistoricMatchesByFixtureMatchID" />
  </wsdl:message>
  <wsdl:message name="GetHistoricMatchesByFixtureMatchIDSoapOut">
    <wsdl:part name="parameters" element="tns:GetHistoricMatchesByFixtureMatchIDResponse" />
  </wsdl:message>
  <wsdl:message name="GetTopScorersByLeagueAndSeasonSoapIn">
    <wsdl:part name="parameters" element="tns:GetTopScorersByLeagueAndSeason" />
  </wsdl:message>
  <wsdl:message name="GetTopScorersByLeagueAndSeasonSoapOut">
    <wsdl:part name="parameters" element="tns:GetTopScorersByLeagueAndSeasonResponse" />
  </wsdl:message>
  <wsdl:message name="GetTopScorersByGroupIdSoapIn">
    <wsdl:part name="parameters" element="tns:GetTopScorersByGroupId" />
  </wsdl:message>
  <wsdl:message name="GetTopScorersByGroupIdSoapOut">
    <wsdl:part name="parameters" element="tns:GetTopScorersByGroupIdResponse" />
  </wsdl:message>
  <wsdl:message name="GetHistoricMatchesByLeagueAndDateIntervalSoapIn">
    <wsdl:part name="parameters" element="tns:GetHistoricMatchesByLeagueAndDateInterval" />
  </wsdl:message>
  <wsdl:message name="GetHistoricMatchesByLeagueAndDateIntervalSoapOut">
    <wsdl:part name="parameters" element="tns:GetHistoricMatchesByLeagueAndDateIntervalResponse" />
  </wsdl:message>
  <wsdl:message name="GetHistoricMatchesByLeagueAndSeasonSoapIn">
    <wsdl:part name="parameters" element="tns:GetHistoricMatchesByLeagueAndSeason" />
  </wsdl:message>
  <wsdl:message name="GetHistoricMatchesByLeagueAndSeasonSoapOut">
    <wsdl:part name="parameters" element="tns:GetHistoricMatchesByLeagueAndSeasonResponse" />
  </wsdl:message>
  <wsdl:message name="GetHistoricMatchesByTeamsAndDateIntervalSoapIn">
    <wsdl:part name="parameters" element="tns:GetHistoricMatchesByTeamsAndDateInterval" />
  </wsdl:message>
  <wsdl:message name="GetHistoricMatchesByTeamsAndDateIntervalSoapOut">
    <wsdl:part name="parameters" element="tns:GetHistoricMatchesByTeamsAndDateIntervalResponse" />
  </wsdl:message>
  <wsdl:message name="GetFixturesByDateIntervalSoapIn">
    <wsdl:part name="parameters" element="tns:GetFixturesByDateInterval" />
  </wsdl:message>
  <wsdl:message name="GetFixturesByDateIntervalSoapOut">
    <wsdl:part name="parameters" element="tns:GetFixturesByDateIntervalResponse" />
  </wsdl:message>
  <wsdl:message name="GetFixturesByDateIntervalAndLeagueSoapIn">
    <wsdl:part name="parameters" element="tns:GetFixturesByDateIntervalAndLeague" />
  </wsdl:message>
  <wsdl:message name="GetFixturesByDateIntervalAndLeagueSoapOut">
    <wsdl:part name="parameters" element="tns:GetFixturesByDateIntervalAndLeagueResponse" />
  </wsdl:message>
  <wsdl:message name="GetAllTeamsSoapIn">
    <wsdl:part name="parameters" element="tns:GetAllTeams" />
  </wsdl:message>
  <wsdl:message name="GetAllTeamsSoapOut">
    <wsdl:part name="parameters" element="tns:GetAllTeamsResponse" />
  </wsdl:message>
  <wsdl:message name="GetAllLeaguesSoapIn">
    <wsdl:part name="parameters" element="tns:GetAllLeagues" />
  </wsdl:message>
  <wsdl:message name="GetAllLeaguesSoapOut">
    <wsdl:part name="parameters" element="tns:GetAllLeaguesResponse" />
  </wsdl:message>
  <wsdl:message name="GetAllGroupsByLeagueAndSeasonSoapIn">
    <wsdl:part name="parameters" element="tns:GetAllGroupsByLeagueAndSeason" />
  </wsdl:message>
  <wsdl:message name="GetAllGroupsByLeagueAndSeasonSoapOut">
    <wsdl:part name="parameters" element="tns:GetAllGroupsByLeagueAndSeasonResponse" />
  </wsdl:message>
  <wsdl:message name="GetLeagueStandingsBySeasonSoapIn">
    <wsdl:part name="parameters" element="tns:GetLeagueStandingsBySeason" />
  </wsdl:message>
  <wsdl:message name="GetLeagueStandingsBySeasonSoapOut">
    <wsdl:part name="parameters" element="tns:GetLeagueStandingsBySeasonResponse" />
  </wsdl:message>
  <wsdl:message name="GetCupStandingsByGroupIdSoapIn">
    <wsdl:part name="parameters" element="tns:GetCupStandingsByGroupId" />
  </wsdl:message>
  <wsdl:message name="GetCupStandingsByGroupIdSoapOut">
    <wsdl:part name="parameters" element="tns:GetCupStandingsByGroupIdResponse" />
  </wsdl:message>
  <wsdl:message name="GetAllTeamsByLeagueAndSeasonSoapIn">
    <wsdl:part name="parameters" element="tns:GetAllTeamsByLeagueAndSeason" />
  </wsdl:message>
  <wsdl:message name="GetAllTeamsByLeagueAndSeasonSoapOut">
    <wsdl:part name="parameters" element="tns:GetAllTeamsByLeagueAndSeasonResponse" />
  </wsdl:message>
  <wsdl:message name="GetEarliestMatchDatePerLeagueSoapIn">
    <wsdl:part name="parameters" element="tns:GetEarliestMatchDatePerLeague" />
  </wsdl:message>
  <wsdl:message name="GetEarliestMatchDatePerLeagueSoapOut">
    <wsdl:part name="parameters" element="tns:GetEarliestMatchDatePerLeagueResponse" />
  </wsdl:message>
  <wsdl:message name="GetLiveScoreSoapIn">
    <wsdl:part name="parameters" element="tns:GetLiveScore" />
  </wsdl:message>
  <wsdl:message name="GetLiveScoreSoapOut">
    <wsdl:part name="parameters" element="tns:GetLiveScoreResponse" />
  </wsdl:message>
  <wsdl:message name="GetLiveScoreByLeagueSoapIn">
    <wsdl:part name="parameters" element="tns:GetLiveScoreByLeague" />
  </wsdl:message>
  <wsdl:message name="GetLiveScoreByLeagueSoapOut">
    <wsdl:part name="parameters" element="tns:GetLiveScoreByLeagueResponse" />
  </wsdl:message>
  <wsdl:message name="GetPlayersByTeamSoapIn">
    <wsdl:part name="parameters" element="tns:GetPlayersByTeam" />
  </wsdl:message>
  <wsdl:message name="GetPlayersByTeamSoapOut">
    <wsdl:part name="parameters" element="tns:GetPlayersByTeamResponse" />
  </wsdl:message>
  <wsdl:message name="GetPlayerByIdSoapIn">
    <wsdl:part name="parameters" element="tns:GetPlayerById" />
  </wsdl:message>
  <wsdl:message name="GetPlayerByIdSoapOut">
    <wsdl:part name="parameters" element="tns:GetPlayerByIdResponse" />
  </wsdl:message>
  <wsdl:message name="GetTeamSoapIn">
    <wsdl:part name="parameters" element="tns:GetTeam" />
  </wsdl:message>
  <wsdl:message name="GetTeamSoapOut">
    <wsdl:part name="parameters" element="tns:GetTeamResponse" />
  </wsdl:message>
  <wsdl:message name="GetOddsByFixtureMatchIdSoapIn">
    <wsdl:part name="parameters" element="tns:GetOddsByFixtureMatchId" />
  </wsdl:message>
  <wsdl:message name="GetOddsByFixtureMatchIdSoapOut">
    <wsdl:part name="parameters" element="tns:GetOddsByFixtureMatchIdResponse" />
  </wsdl:message>
  <wsdl:message name="GetOddsByFixtureMatchId2SoapIn">
    <wsdl:part name="parameters" element="tns:GetOddsByFixtureMatchId2" />
  </wsdl:message>
  <wsdl:message name="GetOddsByFixtureMatchId2SoapOut">
    <wsdl:part name="parameters" element="tns:GetOddsByFixtureMatchId2Response" />
  </wsdl:message>
  <wsdl:message name="GetAllOddsByFixtureMatchIdSoapIn">
    <wsdl:part name="parameters" element="tns:GetAllOddsByFixtureMatchId" />
  </wsdl:message>
  <wsdl:message name="GetAllOddsByFixtureMatchIdSoapOut">
    <wsdl:part name="parameters" element="tns:GetAllOddsByFixtureMatchIdResponse" />
  </wsdl:message>
  <wsdl:message name="GetNextMatchOddsByLeagueSoapIn">
    <wsdl:part name="parameters" element="tns:GetNextMatchOddsByLeague" />
  </wsdl:message>
  <wsdl:message name="GetNextMatchOddsByLeagueSoapOut">
    <wsdl:part name="parameters" element="tns:GetNextMatchOddsByLeagueResponse" />
  </wsdl:message>
  <wsdl:message name="CheckApiKeySoapIn">
    <wsdl:part name="parameters" element="tns:CheckApiKey" />
  </wsdl:message>
  <wsdl:message name="CheckApiKeySoapOut">
    <wsdl:part name="parameters" element="tns:CheckApiKeyResponse" />
  </wsdl:message>
  <wsdl:message name="ImAliveSoapIn">
    <wsdl:part name="parameters" element="tns:ImAlive" />
  </wsdl:message>
  <wsdl:message name="ImAliveSoapOut">
    <wsdl:part name="parameters" element="tns:ImAliveResponse" />
  </wsdl:message>
  <wsdl:message name="GetHistoricMatchesByTeamAndDateIntervalHttpGetIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="teamId" type="s:string" />
    <wsdl:part name="startDateString" type="s:string" />
    <wsdl:part name="endDateString" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetHistoricMatchesByTeamAndDateIntervalHttpGetOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetFixturesByDateIntervalAndTeamHttpGetIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="startDateString" type="s:string" />
    <wsdl:part name="endDateString" type="s:string" />
    <wsdl:part name="teamId" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetFixturesByDateIntervalAndTeamHttpGetOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetFixturesByLeagueAndSeasonHttpGetIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="seasonDateString" type="s:string" />
    <wsdl:part name="league" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetFixturesByLeagueAndSeasonHttpGetOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetHistoricMatchesByIDHttpGetIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="Id" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetHistoricMatchesByIDHttpGetOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetHistoricMatchesByFixtureMatchIDHttpGetIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="Id" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetHistoricMatchesByFixtureMatchIDHttpGetOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetTopScorersByLeagueAndSeasonHttpGetIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="league" type="s:string" />
    <wsdl:part name="seasonDateString" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetTopScorersByLeagueAndSeasonHttpGetOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetTopScorersByGroupIdHttpGetIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="groupId" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetTopScorersByGroupIdHttpGetOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetHistoricMatchesByLeagueAndDateIntervalHttpGetIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="league" type="s:string" />
    <wsdl:part name="startDateString" type="s:string" />
    <wsdl:part name="endDateString" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetHistoricMatchesByLeagueAndDateIntervalHttpGetOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetHistoricMatchesByLeagueAndSeasonHttpGetIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="league" type="s:string" />
    <wsdl:part name="seasonDateString" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetHistoricMatchesByLeagueAndSeasonHttpGetOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetHistoricMatchesByTeamsAndDateIntervalHttpGetIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="team1Id" type="s:string" />
    <wsdl:part name="team2Id" type="s:string" />
    <wsdl:part name="startDateString" type="s:string" />
    <wsdl:part name="endDateString" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetHistoricMatchesByTeamsAndDateIntervalHttpGetOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetFixturesByDateIntervalHttpGetIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="startDateString" type="s:string" />
    <wsdl:part name="endDateString" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetFixturesByDateIntervalHttpGetOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetFixturesByDateIntervalAndLeagueHttpGetIn">
    <wsdl:part name="league" type="s:string" />
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="startDateString" type="s:string" />
    <wsdl:part name="endDateString" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetFixturesByDateIntervalAndLeagueHttpGetOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetAllTeamsHttpGetIn">
    <wsdl:part name="ApiKey" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetAllTeamsHttpGetOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetAllLeaguesHttpGetIn">
    <wsdl:part name="ApiKey" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetAllLeaguesHttpGetOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetAllGroupsByLeagueAndSeasonHttpGetIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="league" type="s:string" />
    <wsdl:part name="seasonDateString" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetAllGroupsByLeagueAndSeasonHttpGetOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetLeagueStandingsBySeasonHttpGetIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="league" type="s:string" />
    <wsdl:part name="seasonDateString" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetLeagueStandingsBySeasonHttpGetOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetCupStandingsByGroupIdHttpGetIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="group_Id" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetCupStandingsByGroupIdHttpGetOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetAllTeamsByLeagueAndSeasonHttpGetIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="league" type="s:string" />
    <wsdl:part name="seasonDateString" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetAllTeamsByLeagueAndSeasonHttpGetOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetEarliestMatchDatePerLeagueHttpGetIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="league" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetEarliestMatchDatePerLeagueHttpGetOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetLiveScoreHttpGetIn">
    <wsdl:part name="ApiKey" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetLiveScoreHttpGetOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetLiveScoreByLeagueHttpGetIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="league" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetLiveScoreByLeagueHttpGetOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetPlayersByTeamHttpGetIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="teamId" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetPlayersByTeamHttpGetOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetPlayerByIdHttpGetIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="playerId" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetPlayerByIdHttpGetOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetTeamHttpGetIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="teamName" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetTeamHttpGetOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetOddsByFixtureMatchIdHttpGetIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="fixtureMatch_Id" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetOddsByFixtureMatchIdHttpGetOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetOddsByFixtureMatchId2HttpGetIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="fixtureMatch_Id" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetOddsByFixtureMatchId2HttpGetOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetAllOddsByFixtureMatchIdHttpGetIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="fixtureMatch_Id" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetAllOddsByFixtureMatchIdHttpGetOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetNextMatchOddsByLeagueHttpGetIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="league" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetNextMatchOddsByLeagueHttpGetOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="CheckApiKeyHttpGetIn">
    <wsdl:part name="ApiKey" type="s:string" />
  </wsdl:message>
  <wsdl:message name="CheckApiKeyHttpGetOut">
    <wsdl:part name="Body" element="tns:string" />
  </wsdl:message>
  <wsdl:message name="ImAliveHttpGetIn" />
  <wsdl:message name="ImAliveHttpGetOut">
    <wsdl:part name="Body" element="tns:string" />
  </wsdl:message>
  <wsdl:message name="GetHistoricMatchesByTeamAndDateIntervalHttpPostIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="teamId" type="s:string" />
    <wsdl:part name="startDateString" type="s:string" />
    <wsdl:part name="endDateString" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetHistoricMatchesByTeamAndDateIntervalHttpPostOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetFixturesByDateIntervalAndTeamHttpPostIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="startDateString" type="s:string" />
    <wsdl:part name="endDateString" type="s:string" />
    <wsdl:part name="teamId" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetFixturesByDateIntervalAndTeamHttpPostOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetFixturesByLeagueAndSeasonHttpPostIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="seasonDateString" type="s:string" />
    <wsdl:part name="league" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetFixturesByLeagueAndSeasonHttpPostOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetHistoricMatchesByIDHttpPostIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="Id" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetHistoricMatchesByIDHttpPostOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetHistoricMatchesByFixtureMatchIDHttpPostIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="Id" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetHistoricMatchesByFixtureMatchIDHttpPostOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetTopScorersByLeagueAndSeasonHttpPostIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="league" type="s:string" />
    <wsdl:part name="seasonDateString" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetTopScorersByLeagueAndSeasonHttpPostOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetTopScorersByGroupIdHttpPostIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="groupId" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetTopScorersByGroupIdHttpPostOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetHistoricMatchesByLeagueAndDateIntervalHttpPostIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="league" type="s:string" />
    <wsdl:part name="startDateString" type="s:string" />
    <wsdl:part name="endDateString" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetHistoricMatchesByLeagueAndDateIntervalHttpPostOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetHistoricMatchesByLeagueAndSeasonHttpPostIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="league" type="s:string" />
    <wsdl:part name="seasonDateString" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetHistoricMatchesByLeagueAndSeasonHttpPostOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetHistoricMatchesByTeamsAndDateIntervalHttpPostIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="team1Id" type="s:string" />
    <wsdl:part name="team2Id" type="s:string" />
    <wsdl:part name="startDateString" type="s:string" />
    <wsdl:part name="endDateString" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetHistoricMatchesByTeamsAndDateIntervalHttpPostOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetFixturesByDateIntervalHttpPostIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="startDateString" type="s:string" />
    <wsdl:part name="endDateString" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetFixturesByDateIntervalHttpPostOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetFixturesByDateIntervalAndLeagueHttpPostIn">
    <wsdl:part name="league" type="s:string" />
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="startDateString" type="s:string" />
    <wsdl:part name="endDateString" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetFixturesByDateIntervalAndLeagueHttpPostOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetAllTeamsHttpPostIn">
    <wsdl:part name="ApiKey" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetAllTeamsHttpPostOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetAllLeaguesHttpPostIn">
    <wsdl:part name="ApiKey" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetAllLeaguesHttpPostOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetAllGroupsByLeagueAndSeasonHttpPostIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="league" type="s:string" />
    <wsdl:part name="seasonDateString" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetAllGroupsByLeagueAndSeasonHttpPostOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetLeagueStandingsBySeasonHttpPostIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="league" type="s:string" />
    <wsdl:part name="seasonDateString" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetLeagueStandingsBySeasonHttpPostOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetCupStandingsByGroupIdHttpPostIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="group_Id" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetCupStandingsByGroupIdHttpPostOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetAllTeamsByLeagueAndSeasonHttpPostIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="league" type="s:string" />
    <wsdl:part name="seasonDateString" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetAllTeamsByLeagueAndSeasonHttpPostOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetEarliestMatchDatePerLeagueHttpPostIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="league" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetEarliestMatchDatePerLeagueHttpPostOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetLiveScoreHttpPostIn">
    <wsdl:part name="ApiKey" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetLiveScoreHttpPostOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetLiveScoreByLeagueHttpPostIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="league" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetLiveScoreByLeagueHttpPostOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetPlayersByTeamHttpPostIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="teamId" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetPlayersByTeamHttpPostOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetPlayerByIdHttpPostIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="playerId" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetPlayerByIdHttpPostOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetTeamHttpPostIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="teamName" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetTeamHttpPostOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetOddsByFixtureMatchIdHttpPostIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="fixtureMatch_Id" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetOddsByFixtureMatchIdHttpPostOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetOddsByFixtureMatchId2HttpPostIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="fixtureMatch_Id" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetOddsByFixtureMatchId2HttpPostOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetAllOddsByFixtureMatchIdHttpPostIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="fixtureMatch_Id" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetAllOddsByFixtureMatchIdHttpPostOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="GetNextMatchOddsByLeagueHttpPostIn">
    <wsdl:part name="ApiKey" type="s:string" />
    <wsdl:part name="league" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetNextMatchOddsByLeagueHttpPostOut">
    <wsdl:part name="Body" />
  </wsdl:message>
  <wsdl:message name="CheckApiKeyHttpPostIn">
    <wsdl:part name="ApiKey" type="s:string" />
  </wsdl:message>
  <wsdl:message name="CheckApiKeyHttpPostOut">
    <wsdl:part name="Body" element="tns:string" />
  </wsdl:message>
  <wsdl:message name="ImAliveHttpPostIn" />
  <wsdl:message name="ImAliveHttpPostOut">
    <wsdl:part name="Body" element="tns:string" />
  </wsdl:message>
  <wsdl:portType name="FootballDataSoap">
    <wsdl:operation name="GetHistoricMatchesByTeamAndDateInterval">
      <wsdl:input message="tns:GetHistoricMatchesByTeamAndDateIntervalSoapIn" />
      <wsdl:output message="tns:GetHistoricMatchesByTeamAndDateIntervalSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFixturesByDateIntervalAndTeam">
      <wsdl:input message="tns:GetFixturesByDateIntervalAndTeamSoapIn" />
      <wsdl:output message="tns:GetFixturesByDateIntervalAndTeamSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFixturesByLeagueAndSeason">
      <wsdl:input message="tns:GetFixturesByLeagueAndSeasonSoapIn" />
      <wsdl:output message="tns:GetFixturesByLeagueAndSeasonSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetHistoricMatchesByID">
      <wsdl:input message="tns:GetHistoricMatchesByIDSoapIn" />
      <wsdl:output message="tns:GetHistoricMatchesByIDSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetHistoricMatchesByFixtureMatchID">
      <wsdl:input message="tns:GetHistoricMatchesByFixtureMatchIDSoapIn" />
      <wsdl:output message="tns:GetHistoricMatchesByFixtureMatchIDSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetTopScorersByLeagueAndSeason">
      <wsdl:input message="tns:GetTopScorersByLeagueAndSeasonSoapIn" />
      <wsdl:output message="tns:GetTopScorersByLeagueAndSeasonSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetTopScorersByGroupId">
      <wsdl:input message="tns:GetTopScorersByGroupIdSoapIn" />
      <wsdl:output message="tns:GetTopScorersByGroupIdSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetHistoricMatchesByLeagueAndDateInterval">
      <wsdl:input message="tns:GetHistoricMatchesByLeagueAndDateIntervalSoapIn" />
      <wsdl:output message="tns:GetHistoricMatchesByLeagueAndDateIntervalSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetHistoricMatchesByLeagueAndSeason">
      <wsdl:input message="tns:GetHistoricMatchesByLeagueAndSeasonSoapIn" />
      <wsdl:output message="tns:GetHistoricMatchesByLeagueAndSeasonSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetHistoricMatchesByTeamsAndDateInterval">
      <wsdl:input message="tns:GetHistoricMatchesByTeamsAndDateIntervalSoapIn" />
      <wsdl:output message="tns:GetHistoricMatchesByTeamsAndDateIntervalSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFixturesByDateInterval">
      <wsdl:input message="tns:GetFixturesByDateIntervalSoapIn" />
      <wsdl:output message="tns:GetFixturesByDateIntervalSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFixturesByDateIntervalAndLeague">
      <wsdl:input message="tns:GetFixturesByDateIntervalAndLeagueSoapIn" />
      <wsdl:output message="tns:GetFixturesByDateIntervalAndLeagueSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAllTeams">
      <wsdl:input message="tns:GetAllTeamsSoapIn" />
      <wsdl:output message="tns:GetAllTeamsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAllLeagues">
      <wsdl:input message="tns:GetAllLeaguesSoapIn" />
      <wsdl:output message="tns:GetAllLeaguesSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAllGroupsByLeagueAndSeason">
      <wsdl:input message="tns:GetAllGroupsByLeagueAndSeasonSoapIn" />
      <wsdl:output message="tns:GetAllGroupsByLeagueAndSeasonSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetLeagueStandingsBySeason">
      <wsdl:input message="tns:GetLeagueStandingsBySeasonSoapIn" />
      <wsdl:output message="tns:GetLeagueStandingsBySeasonSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetCupStandingsByGroupId">
      <wsdl:input message="tns:GetCupStandingsByGroupIdSoapIn" />
      <wsdl:output message="tns:GetCupStandingsByGroupIdSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAllTeamsByLeagueAndSeason">
      <wsdl:input message="tns:GetAllTeamsByLeagueAndSeasonSoapIn" />
      <wsdl:output message="tns:GetAllTeamsByLeagueAndSeasonSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetEarliestMatchDatePerLeague">
      <wsdl:input message="tns:GetEarliestMatchDatePerLeagueSoapIn" />
      <wsdl:output message="tns:GetEarliestMatchDatePerLeagueSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetLiveScore">
      <wsdl:input message="tns:GetLiveScoreSoapIn" />
      <wsdl:output message="tns:GetLiveScoreSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetLiveScoreByLeague">
      <wsdl:input message="tns:GetLiveScoreByLeagueSoapIn" />
      <wsdl:output message="tns:GetLiveScoreByLeagueSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetPlayersByTeam">
      <wsdl:input message="tns:GetPlayersByTeamSoapIn" />
      <wsdl:output message="tns:GetPlayersByTeamSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetPlayerById">
      <wsdl:input message="tns:GetPlayerByIdSoapIn" />
      <wsdl:output message="tns:GetPlayerByIdSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetTeam">
      <wsdl:input message="tns:GetTeamSoapIn" />
      <wsdl:output message="tns:GetTeamSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetOddsByFixtureMatchId">
      <wsdl:input message="tns:GetOddsByFixtureMatchIdSoapIn" />
      <wsdl:output message="tns:GetOddsByFixtureMatchIdSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetOddsByFixtureMatchId2">
      <wsdl:input message="tns:GetOddsByFixtureMatchId2SoapIn" />
      <wsdl:output message="tns:GetOddsByFixtureMatchId2SoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAllOddsByFixtureMatchId">
      <wsdl:input message="tns:GetAllOddsByFixtureMatchIdSoapIn" />
      <wsdl:output message="tns:GetAllOddsByFixtureMatchIdSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetNextMatchOddsByLeague">
      <wsdl:input message="tns:GetNextMatchOddsByLeagueSoapIn" />
      <wsdl:output message="tns:GetNextMatchOddsByLeagueSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CheckApiKey">
      <wsdl:input message="tns:CheckApiKeySoapIn" />
      <wsdl:output message="tns:CheckApiKeySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ImAlive">
      <wsdl:input message="tns:ImAliveSoapIn" />
      <wsdl:output message="tns:ImAliveSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:portType name="FootballDataHttpGet">
    <wsdl:operation name="GetHistoricMatchesByTeamAndDateInterval">
      <wsdl:input message="tns:GetHistoricMatchesByTeamAndDateIntervalHttpGetIn" />
      <wsdl:output message="tns:GetHistoricMatchesByTeamAndDateIntervalHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFixturesByDateIntervalAndTeam">
      <wsdl:input message="tns:GetFixturesByDateIntervalAndTeamHttpGetIn" />
      <wsdl:output message="tns:GetFixturesByDateIntervalAndTeamHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFixturesByLeagueAndSeason">
      <wsdl:input message="tns:GetFixturesByLeagueAndSeasonHttpGetIn" />
      <wsdl:output message="tns:GetFixturesByLeagueAndSeasonHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="GetHistoricMatchesByID">
      <wsdl:input message="tns:GetHistoricMatchesByIDHttpGetIn" />
      <wsdl:output message="tns:GetHistoricMatchesByIDHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="GetHistoricMatchesByFixtureMatchID">
      <wsdl:input message="tns:GetHistoricMatchesByFixtureMatchIDHttpGetIn" />
      <wsdl:output message="tns:GetHistoricMatchesByFixtureMatchIDHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="GetTopScorersByLeagueAndSeason">
      <wsdl:input message="tns:GetTopScorersByLeagueAndSeasonHttpGetIn" />
      <wsdl:output message="tns:GetTopScorersByLeagueAndSeasonHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="GetTopScorersByGroupId">
      <wsdl:input message="tns:GetTopScorersByGroupIdHttpGetIn" />
      <wsdl:output message="tns:GetTopScorersByGroupIdHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="GetHistoricMatchesByLeagueAndDateInterval">
      <wsdl:input message="tns:GetHistoricMatchesByLeagueAndDateIntervalHttpGetIn" />
      <wsdl:output message="tns:GetHistoricMatchesByLeagueAndDateIntervalHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="GetHistoricMatchesByLeagueAndSeason">
      <wsdl:input message="tns:GetHistoricMatchesByLeagueAndSeasonHttpGetIn" />
      <wsdl:output message="tns:GetHistoricMatchesByLeagueAndSeasonHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="GetHistoricMatchesByTeamsAndDateInterval">
      <wsdl:input message="tns:GetHistoricMatchesByTeamsAndDateIntervalHttpGetIn" />
      <wsdl:output message="tns:GetHistoricMatchesByTeamsAndDateIntervalHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFixturesByDateInterval">
      <wsdl:input message="tns:GetFixturesByDateIntervalHttpGetIn" />
      <wsdl:output message="tns:GetFixturesByDateIntervalHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFixturesByDateIntervalAndLeague">
      <wsdl:input message="tns:GetFixturesByDateIntervalAndLeagueHttpGetIn" />
      <wsdl:output message="tns:GetFixturesByDateIntervalAndLeagueHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAllTeams">
      <wsdl:input message="tns:GetAllTeamsHttpGetIn" />
      <wsdl:output message="tns:GetAllTeamsHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAllLeagues">
      <wsdl:input message="tns:GetAllLeaguesHttpGetIn" />
      <wsdl:output message="tns:GetAllLeaguesHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAllGroupsByLeagueAndSeason">
      <wsdl:input message="tns:GetAllGroupsByLeagueAndSeasonHttpGetIn" />
      <wsdl:output message="tns:GetAllGroupsByLeagueAndSeasonHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="GetLeagueStandingsBySeason">
      <wsdl:input message="tns:GetLeagueStandingsBySeasonHttpGetIn" />
      <wsdl:output message="tns:GetLeagueStandingsBySeasonHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="GetCupStandingsByGroupId">
      <wsdl:input message="tns:GetCupStandingsByGroupIdHttpGetIn" />
      <wsdl:output message="tns:GetCupStandingsByGroupIdHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAllTeamsByLeagueAndSeason">
      <wsdl:input message="tns:GetAllTeamsByLeagueAndSeasonHttpGetIn" />
      <wsdl:output message="tns:GetAllTeamsByLeagueAndSeasonHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="GetEarliestMatchDatePerLeague">
      <wsdl:input message="tns:GetEarliestMatchDatePerLeagueHttpGetIn" />
      <wsdl:output message="tns:GetEarliestMatchDatePerLeagueHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="GetLiveScore">
      <wsdl:input message="tns:GetLiveScoreHttpGetIn" />
      <wsdl:output message="tns:GetLiveScoreHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="GetLiveScoreByLeague">
      <wsdl:input message="tns:GetLiveScoreByLeagueHttpGetIn" />
      <wsdl:output message="tns:GetLiveScoreByLeagueHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="GetPlayersByTeam">
      <wsdl:input message="tns:GetPlayersByTeamHttpGetIn" />
      <wsdl:output message="tns:GetPlayersByTeamHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="GetPlayerById">
      <wsdl:input message="tns:GetPlayerByIdHttpGetIn" />
      <wsdl:output message="tns:GetPlayerByIdHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="GetTeam">
      <wsdl:input message="tns:GetTeamHttpGetIn" />
      <wsdl:output message="tns:GetTeamHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="GetOddsByFixtureMatchId">
      <wsdl:input message="tns:GetOddsByFixtureMatchIdHttpGetIn" />
      <wsdl:output message="tns:GetOddsByFixtureMatchIdHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="GetOddsByFixtureMatchId2">
      <wsdl:input message="tns:GetOddsByFixtureMatchId2HttpGetIn" />
      <wsdl:output message="tns:GetOddsByFixtureMatchId2HttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAllOddsByFixtureMatchId">
      <wsdl:input message="tns:GetAllOddsByFixtureMatchIdHttpGetIn" />
      <wsdl:output message="tns:GetAllOddsByFixtureMatchIdHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="GetNextMatchOddsByLeague">
      <wsdl:input message="tns:GetNextMatchOddsByLeagueHttpGetIn" />
      <wsdl:output message="tns:GetNextMatchOddsByLeagueHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="CheckApiKey">
      <wsdl:input message="tns:CheckApiKeyHttpGetIn" />
      <wsdl:output message="tns:CheckApiKeyHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="ImAlive">
      <wsdl:input message="tns:ImAliveHttpGetIn" />
      <wsdl:output message="tns:ImAliveHttpGetOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:portType name="FootballDataHttpPost">
    <wsdl:operation name="GetHistoricMatchesByTeamAndDateInterval">
      <wsdl:input message="tns:GetHistoricMatchesByTeamAndDateIntervalHttpPostIn" />
      <wsdl:output message="tns:GetHistoricMatchesByTeamAndDateIntervalHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFixturesByDateIntervalAndTeam">
      <wsdl:input message="tns:GetFixturesByDateIntervalAndTeamHttpPostIn" />
      <wsdl:output message="tns:GetFixturesByDateIntervalAndTeamHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFixturesByLeagueAndSeason">
      <wsdl:input message="tns:GetFixturesByLeagueAndSeasonHttpPostIn" />
      <wsdl:output message="tns:GetFixturesByLeagueAndSeasonHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="GetHistoricMatchesByID">
      <wsdl:input message="tns:GetHistoricMatchesByIDHttpPostIn" />
      <wsdl:output message="tns:GetHistoricMatchesByIDHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="GetHistoricMatchesByFixtureMatchID">
      <wsdl:input message="tns:GetHistoricMatchesByFixtureMatchIDHttpPostIn" />
      <wsdl:output message="tns:GetHistoricMatchesByFixtureMatchIDHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="GetTopScorersByLeagueAndSeason">
      <wsdl:input message="tns:GetTopScorersByLeagueAndSeasonHttpPostIn" />
      <wsdl:output message="tns:GetTopScorersByLeagueAndSeasonHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="GetTopScorersByGroupId">
      <wsdl:input message="tns:GetTopScorersByGroupIdHttpPostIn" />
      <wsdl:output message="tns:GetTopScorersByGroupIdHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="GetHistoricMatchesByLeagueAndDateInterval">
      <wsdl:input message="tns:GetHistoricMatchesByLeagueAndDateIntervalHttpPostIn" />
      <wsdl:output message="tns:GetHistoricMatchesByLeagueAndDateIntervalHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="GetHistoricMatchesByLeagueAndSeason">
      <wsdl:input message="tns:GetHistoricMatchesByLeagueAndSeasonHttpPostIn" />
      <wsdl:output message="tns:GetHistoricMatchesByLeagueAndSeasonHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="GetHistoricMatchesByTeamsAndDateInterval">
      <wsdl:input message="tns:GetHistoricMatchesByTeamsAndDateIntervalHttpPostIn" />
      <wsdl:output message="tns:GetHistoricMatchesByTeamsAndDateIntervalHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFixturesByDateInterval">
      <wsdl:input message="tns:GetFixturesByDateIntervalHttpPostIn" />
      <wsdl:output message="tns:GetFixturesByDateIntervalHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFixturesByDateIntervalAndLeague">
      <wsdl:input message="tns:GetFixturesByDateIntervalAndLeagueHttpPostIn" />
      <wsdl:output message="tns:GetFixturesByDateIntervalAndLeagueHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAllTeams">
      <wsdl:input message="tns:GetAllTeamsHttpPostIn" />
      <wsdl:output message="tns:GetAllTeamsHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAllLeagues">
      <wsdl:input message="tns:GetAllLeaguesHttpPostIn" />
      <wsdl:output message="tns:GetAllLeaguesHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAllGroupsByLeagueAndSeason">
      <wsdl:input message="tns:GetAllGroupsByLeagueAndSeasonHttpPostIn" />
      <wsdl:output message="tns:GetAllGroupsByLeagueAndSeasonHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="GetLeagueStandingsBySeason">
      <wsdl:input message="tns:GetLeagueStandingsBySeasonHttpPostIn" />
      <wsdl:output message="tns:GetLeagueStandingsBySeasonHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="GetCupStandingsByGroupId">
      <wsdl:input message="tns:GetCupStandingsByGroupIdHttpPostIn" />
      <wsdl:output message="tns:GetCupStandingsByGroupIdHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAllTeamsByLeagueAndSeason">
      <wsdl:input message="tns:GetAllTeamsByLeagueAndSeasonHttpPostIn" />
      <wsdl:output message="tns:GetAllTeamsByLeagueAndSeasonHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="GetEarliestMatchDatePerLeague">
      <wsdl:input message="tns:GetEarliestMatchDatePerLeagueHttpPostIn" />
      <wsdl:output message="tns:GetEarliestMatchDatePerLeagueHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="GetLiveScore">
      <wsdl:input message="tns:GetLiveScoreHttpPostIn" />
      <wsdl:output message="tns:GetLiveScoreHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="GetLiveScoreByLeague">
      <wsdl:input message="tns:GetLiveScoreByLeagueHttpPostIn" />
      <wsdl:output message="tns:GetLiveScoreByLeagueHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="GetPlayersByTeam">
      <wsdl:input message="tns:GetPlayersByTeamHttpPostIn" />
      <wsdl:output message="tns:GetPlayersByTeamHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="GetPlayerById">
      <wsdl:input message="tns:GetPlayerByIdHttpPostIn" />
      <wsdl:output message="tns:GetPlayerByIdHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="GetTeam">
      <wsdl:input message="tns:GetTeamHttpPostIn" />
      <wsdl:output message="tns:GetTeamHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="GetOddsByFixtureMatchId">
      <wsdl:input message="tns:GetOddsByFixtureMatchIdHttpPostIn" />
      <wsdl:output message="tns:GetOddsByFixtureMatchIdHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="GetOddsByFixtureMatchId2">
      <wsdl:input message="tns:GetOddsByFixtureMatchId2HttpPostIn" />
      <wsdl:output message="tns:GetOddsByFixtureMatchId2HttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAllOddsByFixtureMatchId">
      <wsdl:input message="tns:GetAllOddsByFixtureMatchIdHttpPostIn" />
      <wsdl:output message="tns:GetAllOddsByFixtureMatchIdHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="GetNextMatchOddsByLeague">
      <wsdl:input message="tns:GetNextMatchOddsByLeagueHttpPostIn" />
      <wsdl:output message="tns:GetNextMatchOddsByLeagueHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="CheckApiKey">
      <wsdl:input message="tns:CheckApiKeyHttpPostIn" />
      <wsdl:output message="tns:CheckApiKeyHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="ImAlive">
      <wsdl:input message="tns:ImAliveHttpPostIn" />
      <wsdl:output message="tns:ImAliveHttpPostOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="FootballDataSoap" type="tns:FootballDataSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="GetHistoricMatchesByTeamAndDateInterval">
      <soap:operation soapAction="http://xmlsoccer.com/GetHistoricMatchesByTeamAndDateInterval" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFixturesByDateIntervalAndTeam">
      <soap:operation soapAction="http://xmlsoccer.com/GetFixturesByDateIntervalAndTeam" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFixturesByLeagueAndSeason">
      <soap:operation soapAction="http://xmlsoccer.com/GetFixturesByLeagueAndSeason" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetHistoricMatchesByID">
      <soap:operation soapAction="http://xmlsoccer.com/GetHistoricMatchesByID" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetHistoricMatchesByFixtureMatchID">
      <soap:operation soapAction="http://xmlsoccer.com/GetHistoricMatchesByFixtureMatchID" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTopScorersByLeagueAndSeason">
      <soap:operation soapAction="http://xmlsoccer.com/GetTopScorersByLeagueAndSeason" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTopScorersByGroupId">
      <soap:operation soapAction="http://xmlsoccer.com/GetTopScorersByGroupId" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetHistoricMatchesByLeagueAndDateInterval">
      <soap:operation soapAction="http://xmlsoccer.com/GetHistoricMatchesByLeagueAndDateInterval" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetHistoricMatchesByLeagueAndSeason">
      <soap:operation soapAction="http://xmlsoccer.com/GetHistoricMatchesByLeagueAndSeason" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetHistoricMatchesByTeamsAndDateInterval">
      <soap:operation soapAction="http://xmlsoccer.com/GetHistoricMatchesByTeamsAndDateInterval" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFixturesByDateInterval">
      <soap:operation soapAction="http://xmlsoccer.com/GetFixturesByDateInterval" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFixturesByDateIntervalAndLeague">
      <soap:operation soapAction="http://xmlsoccer.com/GetFixturesByDateIntervalAndLeague" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllTeams">
      <soap:operation soapAction="http://xmlsoccer.com/GetAllTeams" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllLeagues">
      <soap:operation soapAction="http://xmlsoccer.com/GetAllLeagues" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllGroupsByLeagueAndSeason">
      <soap:operation soapAction="http://xmlsoccer.com/GetAllGroupsByLeagueAndSeason" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLeagueStandingsBySeason">
      <soap:operation soapAction="http://xmlsoccer.com/GetLeagueStandingsBySeason" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCupStandingsByGroupId">
      <soap:operation soapAction="http://xmlsoccer.com/GetCupStandingsByGroupId" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllTeamsByLeagueAndSeason">
      <soap:operation soapAction="http://xmlsoccer.com/GetAllTeamsByLeagueAndSeason" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEarliestMatchDatePerLeague">
      <soap:operation soapAction="http://xmlsoccer.com/GetEarliestMatchDatePerLeague" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLiveScore">
      <soap:operation soapAction="http://xmlsoccer.com/GetLiveScore" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLiveScoreByLeague">
      <soap:operation soapAction="http://xmlsoccer.com/GetLiveScoreByLeague" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPlayersByTeam">
      <soap:operation soapAction="http://xmlsoccer.com/GetPlayersByTeam" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPlayerById">
      <soap:operation soapAction="http://xmlsoccer.com/GetPlayerById" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTeam">
      <soap:operation soapAction="http://xmlsoccer.com/GetTeam" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetOddsByFixtureMatchId">
      <soap:operation soapAction="http://xmlsoccer.com/GetOddsByFixtureMatchId" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetOddsByFixtureMatchId2">
      <soap:operation soapAction="http://xmlsoccer.com/GetOddsByFixtureMatchId2" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllOddsByFixtureMatchId">
      <soap:operation soapAction="http://xmlsoccer.com/GetAllOddsByFixtureMatchId" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetNextMatchOddsByLeague">
      <soap:operation soapAction="http://xmlsoccer.com/GetNextMatchOddsByLeague" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CheckApiKey">
      <soap:operation soapAction="http://xmlsoccer.com/CheckApiKey" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ImAlive">
      <soap:operation soapAction="http://xmlsoccer.com/ImAlive" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="FootballDataSoap12" type="tns:FootballDataSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="GetHistoricMatchesByTeamAndDateInterval">
      <soap12:operation soapAction="http://xmlsoccer.com/GetHistoricMatchesByTeamAndDateInterval" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFixturesByDateIntervalAndTeam">
      <soap12:operation soapAction="http://xmlsoccer.com/GetFixturesByDateIntervalAndTeam" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFixturesByLeagueAndSeason">
      <soap12:operation soapAction="http://xmlsoccer.com/GetFixturesByLeagueAndSeason" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetHistoricMatchesByID">
      <soap12:operation soapAction="http://xmlsoccer.com/GetHistoricMatchesByID" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetHistoricMatchesByFixtureMatchID">
      <soap12:operation soapAction="http://xmlsoccer.com/GetHistoricMatchesByFixtureMatchID" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTopScorersByLeagueAndSeason">
      <soap12:operation soapAction="http://xmlsoccer.com/GetTopScorersByLeagueAndSeason" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTopScorersByGroupId">
      <soap12:operation soapAction="http://xmlsoccer.com/GetTopScorersByGroupId" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetHistoricMatchesByLeagueAndDateInterval">
      <soap12:operation soapAction="http://xmlsoccer.com/GetHistoricMatchesByLeagueAndDateInterval" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetHistoricMatchesByLeagueAndSeason">
      <soap12:operation soapAction="http://xmlsoccer.com/GetHistoricMatchesByLeagueAndSeason" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetHistoricMatchesByTeamsAndDateInterval">
      <soap12:operation soapAction="http://xmlsoccer.com/GetHistoricMatchesByTeamsAndDateInterval" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFixturesByDateInterval">
      <soap12:operation soapAction="http://xmlsoccer.com/GetFixturesByDateInterval" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFixturesByDateIntervalAndLeague">
      <soap12:operation soapAction="http://xmlsoccer.com/GetFixturesByDateIntervalAndLeague" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllTeams">
      <soap12:operation soapAction="http://xmlsoccer.com/GetAllTeams" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllLeagues">
      <soap12:operation soapAction="http://xmlsoccer.com/GetAllLeagues" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllGroupsByLeagueAndSeason">
      <soap12:operation soapAction="http://xmlsoccer.com/GetAllGroupsByLeagueAndSeason" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLeagueStandingsBySeason">
      <soap12:operation soapAction="http://xmlsoccer.com/GetLeagueStandingsBySeason" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCupStandingsByGroupId">
      <soap12:operation soapAction="http://xmlsoccer.com/GetCupStandingsByGroupId" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllTeamsByLeagueAndSeason">
      <soap12:operation soapAction="http://xmlsoccer.com/GetAllTeamsByLeagueAndSeason" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEarliestMatchDatePerLeague">
      <soap12:operation soapAction="http://xmlsoccer.com/GetEarliestMatchDatePerLeague" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLiveScore">
      <soap12:operation soapAction="http://xmlsoccer.com/GetLiveScore" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLiveScoreByLeague">
      <soap12:operation soapAction="http://xmlsoccer.com/GetLiveScoreByLeague" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPlayersByTeam">
      <soap12:operation soapAction="http://xmlsoccer.com/GetPlayersByTeam" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPlayerById">
      <soap12:operation soapAction="http://xmlsoccer.com/GetPlayerById" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTeam">
      <soap12:operation soapAction="http://xmlsoccer.com/GetTeam" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetOddsByFixtureMatchId">
      <soap12:operation soapAction="http://xmlsoccer.com/GetOddsByFixtureMatchId" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetOddsByFixtureMatchId2">
      <soap12:operation soapAction="http://xmlsoccer.com/GetOddsByFixtureMatchId2" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllOddsByFixtureMatchId">
      <soap12:operation soapAction="http://xmlsoccer.com/GetAllOddsByFixtureMatchId" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetNextMatchOddsByLeague">
      <soap12:operation soapAction="http://xmlsoccer.com/GetNextMatchOddsByLeague" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CheckApiKey">
      <soap12:operation soapAction="http://xmlsoccer.com/CheckApiKey" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ImAlive">
      <soap12:operation soapAction="http://xmlsoccer.com/ImAlive" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="FootballDataHttpGet" type="tns:FootballDataHttpGet">
    <http:binding verb="GET" />
    <wsdl:operation name="GetHistoricMatchesByTeamAndDateInterval">
      <http:operation location="/GetHistoricMatchesByTeamAndDateInterval" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFixturesByDateIntervalAndTeam">
      <http:operation location="/GetFixturesByDateIntervalAndTeam" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFixturesByLeagueAndSeason">
      <http:operation location="/GetFixturesByLeagueAndSeason" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetHistoricMatchesByID">
      <http:operation location="/GetHistoricMatchesByID" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetHistoricMatchesByFixtureMatchID">
      <http:operation location="/GetHistoricMatchesByFixtureMatchID" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTopScorersByLeagueAndSeason">
      <http:operation location="/GetTopScorersByLeagueAndSeason" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTopScorersByGroupId">
      <http:operation location="/GetTopScorersByGroupId" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetHistoricMatchesByLeagueAndDateInterval">
      <http:operation location="/GetHistoricMatchesByLeagueAndDateInterval" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetHistoricMatchesByLeagueAndSeason">
      <http:operation location="/GetHistoricMatchesByLeagueAndSeason" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetHistoricMatchesByTeamsAndDateInterval">
      <http:operation location="/GetHistoricMatchesByTeamsAndDateInterval" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFixturesByDateInterval">
      <http:operation location="/GetFixturesByDateInterval" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFixturesByDateIntervalAndLeague">
      <http:operation location="/GetFixturesByDateIntervalAndLeague" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllTeams">
      <http:operation location="/GetAllTeams" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllLeagues">
      <http:operation location="/GetAllLeagues" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllGroupsByLeagueAndSeason">
      <http:operation location="/GetAllGroupsByLeagueAndSeason" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLeagueStandingsBySeason">
      <http:operation location="/GetLeagueStandingsBySeason" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCupStandingsByGroupId">
      <http:operation location="/GetCupStandingsByGroupId" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllTeamsByLeagueAndSeason">
      <http:operation location="/GetAllTeamsByLeagueAndSeason" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEarliestMatchDatePerLeague">
      <http:operation location="/GetEarliestMatchDatePerLeague" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLiveScore">
      <http:operation location="/GetLiveScore" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLiveScoreByLeague">
      <http:operation location="/GetLiveScoreByLeague" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPlayersByTeam">
      <http:operation location="/GetPlayersByTeam" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPlayerById">
      <http:operation location="/GetPlayerById" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTeam">
      <http:operation location="/GetTeam" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetOddsByFixtureMatchId">
      <http:operation location="/GetOddsByFixtureMatchId" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetOddsByFixtureMatchId2">
      <http:operation location="/GetOddsByFixtureMatchId2" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllOddsByFixtureMatchId">
      <http:operation location="/GetAllOddsByFixtureMatchId" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetNextMatchOddsByLeague">
      <http:operation location="/GetNextMatchOddsByLeague" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CheckApiKey">
      <http:operation location="/CheckApiKey" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ImAlive">
      <http:operation location="/ImAlive" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="FootballDataHttpPost" type="tns:FootballDataHttpPost">
    <http:binding verb="POST" />
    <wsdl:operation name="GetHistoricMatchesByTeamAndDateInterval">
      <http:operation location="/GetHistoricMatchesByTeamAndDateInterval" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFixturesByDateIntervalAndTeam">
      <http:operation location="/GetFixturesByDateIntervalAndTeam" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFixturesByLeagueAndSeason">
      <http:operation location="/GetFixturesByLeagueAndSeason" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetHistoricMatchesByID">
      <http:operation location="/GetHistoricMatchesByID" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetHistoricMatchesByFixtureMatchID">
      <http:operation location="/GetHistoricMatchesByFixtureMatchID" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTopScorersByLeagueAndSeason">
      <http:operation location="/GetTopScorersByLeagueAndSeason" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTopScorersByGroupId">
      <http:operation location="/GetTopScorersByGroupId" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetHistoricMatchesByLeagueAndDateInterval">
      <http:operation location="/GetHistoricMatchesByLeagueAndDateInterval" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetHistoricMatchesByLeagueAndSeason">
      <http:operation location="/GetHistoricMatchesByLeagueAndSeason" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetHistoricMatchesByTeamsAndDateInterval">
      <http:operation location="/GetHistoricMatchesByTeamsAndDateInterval" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFixturesByDateInterval">
      <http:operation location="/GetFixturesByDateInterval" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFixturesByDateIntervalAndLeague">
      <http:operation location="/GetFixturesByDateIntervalAndLeague" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllTeams">
      <http:operation location="/GetAllTeams" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllLeagues">
      <http:operation location="/GetAllLeagues" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllGroupsByLeagueAndSeason">
      <http:operation location="/GetAllGroupsByLeagueAndSeason" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLeagueStandingsBySeason">
      <http:operation location="/GetLeagueStandingsBySeason" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCupStandingsByGroupId">
      <http:operation location="/GetCupStandingsByGroupId" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllTeamsByLeagueAndSeason">
      <http:operation location="/GetAllTeamsByLeagueAndSeason" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEarliestMatchDatePerLeague">
      <http:operation location="/GetEarliestMatchDatePerLeague" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLiveScore">
      <http:operation location="/GetLiveScore" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLiveScoreByLeague">
      <http:operation location="/GetLiveScoreByLeague" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPlayersByTeam">
      <http:operation location="/GetPlayersByTeam" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPlayerById">
      <http:operation location="/GetPlayerById" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTeam">
      <http:operation location="/GetTeam" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetOddsByFixtureMatchId">
      <http:operation location="/GetOddsByFixtureMatchId" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetOddsByFixtureMatchId2">
      <http:operation location="/GetOddsByFixtureMatchId2" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllOddsByFixtureMatchId">
      <http:operation location="/GetAllOddsByFixtureMatchId" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetNextMatchOddsByLeague">
      <http:operation location="/GetNextMatchOddsByLeague" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:content part="Body" type="text/xml" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CheckApiKey">
      <http:operation location="/CheckApiKey" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ImAlive">
      <http:operation location="/ImAlive" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="FootballData">
    <wsdl:port name="FootballDataSoap" binding="tns:FootballDataSoap">
      <soap:address location="http://www.xmlsoccer.com/FootballData.asmx" />
    </wsdl:port>
    <wsdl:port name="FootballDataSoap12" binding="tns:FootballDataSoap12">
      <soap12:address location="http://www.xmlsoccer.com/FootballData.asmx" />
    </wsdl:port>
    <wsdl:port name="FootballDataHttpGet" binding="tns:FootballDataHttpGet">
      <http:address location="http://www.xmlsoccer.com/FootballData.asmx" />
    </wsdl:port>
    <wsdl:port name="FootballDataHttpPost" binding="tns:FootballDataHttpPost">
      <http:address location="http://www.xmlsoccer.com/FootballData.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>