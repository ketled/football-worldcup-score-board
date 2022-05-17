package com.sportradar.football.service;

import com.sportradar.football.model.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.sportradar.football.common.MatchStatus.COMPLETED;
import static com.sportradar.football.common.Scoreboard.showLiveMatch;
import static com.sportradar.football.service.CompletedMatchesService.completedMatchScoreboard;

public class PlayService {

    public static List<Game> scoreboard(List<Game> worldCupFixture) {
        System.out.println("Score board for the world cup");
        System.out.println("_____________________________");
        var completedGames = new ArrayList<Game>();
        var gamesInProgress = new ArrayList<Game>();
        Random random = new Random(); // Match is started, if nextBoolean() returns true then match is in progress else it's completed
        worldCupFixture.forEach(game -> {
            if (random.nextBoolean()) {
                System.out.println("Game in play- " + game.getMatchNumber() + ", home team- " + game.getHomeTeam() + "(" + goal()
                        + "), away team- " + game.getAwayTeam() + "(" + goal() + ")");
                gamesInProgress.add(game);
            } else {
                var completedGame = new Game();
                completedGame.setHomeTeam(game.getHomeTeam());
                completedGame.setAwayTeam(game.getAwayTeam());
                completedGame.setHomeTeamScore(goal());
                completedGame.setAwayTeamScore(goal());
                completedGame.setMatchNumber(game.getMatchNumber());
                completedGame.setStatus(COMPLETED);
                completedGame.setMatchFinishTime(System.currentTimeMillis());
                completedGames.add(completedGame);
            }
        });
        var completedMatches = completedMatchScoreboard(completedGames);
        showLiveMatch(completedMatches, "Completed games- ");
        return gamesInProgress;
    }

    private static int goal() {
        int min = 0;
        int max = 5;
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }

}
