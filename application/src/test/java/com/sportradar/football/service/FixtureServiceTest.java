package com.sportradar.football.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.sportradar.football.service.FixtureService.worldCupFixture;
import static org.junit.jupiter.api.Assertions.*;

class FixtureServiceTest {

    @Test
    @DisplayName("Test world cup fixture games")
    void testWorldCupFixture() {
        List<String> listOfTeams = new ArrayList<>();
        listOfTeams.add("Norway");
        listOfTeams.add("Sweden");
        listOfTeams.add("Denmark");
        listOfTeams.add("Finland");

        var fixture = worldCupFixture(listOfTeams);
        var initTeamSize = listOfTeams.size();
        assertEquals(fixture.size(), initTeamSize * (initTeamSize - 1));
    }
}