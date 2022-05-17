package com.sportradar.football.common;

import com.sportradar.football.model.Game;

import java.util.List;

public class Scoreboard {

    public static void showLiveMatch(List<Game> games, String gameStatus) {

        System.out.println("____________________________");
        games.stream().map(game -> gameStatus + game.getMatchNumber() + ", home team- " + game.getHomeTeam() + "(" + game.getHomeTeamScore()
                        + "), away team- " + game.getAwayTeam() + "(" + game.getAwayTeamScore() + "), match status- " + game.getStatus())
                .forEach(System.out::println);
        System.out.println("____________________________");

    }
}
