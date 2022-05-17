package com.sportradar.football.initializer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WorldCupFixturesTest {

    @Test
    @DisplayName("Test total number of games")
    void testGameFixture() {
        List<String> listOfTeams = new ArrayList<>();
        listOfTeams.add("Norway");
        listOfTeams.add("Sweden");
        listOfTeams.add("Denmark");
        listOfTeams.add("Finland");

        var teamList = WorldCupFixtures.gameFixture(listOfTeams);
        AtomicInteger matchCounter = new AtomicInteger();
        teamList.forEach(teams ->
                teams.getHomeTeam().forEach(homeTeam ->
                        teams.getAwayTeam().forEach(awayTeam -> matchCounter.incrementAndGet())));
        var initTeamSize = listOfTeams.size();
        assertEquals(matchCounter.get(), initTeamSize * (initTeamSize - 1));
    }
}