package com.sportradar.football.service;

import com.sportradar.football.model.Game;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.sportradar.football.service.CompletedMatchesService.completedMatchScoreboard;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class CompletedMatchesServiceTest {

    private final List<Game> gameList = new ArrayList<>();

    @Test
    @DisplayName("Test completed matches")
    void testCompletedMatchScoreboard() {
        var completedMatches = completedMatchScoreboard(gameList);
        assertNotEquals(completedMatches.get(0).getMatchNumber(), gameList.get(1).getMatchNumber());

    }

    @BeforeEach
    private void testDataSetup() {
        Game game = new Game();
        game.setHomeTeam("Norway");
        game.setAwayTeam("Denmark");
        game.setHomeTeamScore(0);
        game.setAwayTeamScore(1);
        game.setMatchNumber(1);
        game.setMatchFinishTime(1652810041475L);
        gameList.add(game);
        game = new Game();
        game.setHomeTeam("Denmark");
        game.setAwayTeam("Norway");
        game.setHomeTeamScore(0);
        game.setAwayTeamScore(1);
        game.setMatchNumber(2);
        game.setMatchFinishTime(1652810041476L);
        gameList.add(game);
    }
}