package com.sportradar.football.service;

import com.sportradar.football.model.Game;

import java.util.List;

public class CompletedMatchesService {

    // Read me point 4
    public static List<Game> completedMatchScoreboard(List<Game> completedGames) {
        completedGames.sort((o1, o2) -> Integer.compare(o2.getHomeTeamScore() + o2.getAwayTeamScore(), o1.getHomeTeamScore() + o1.getAwayTeamScore()));
        completedGames.sort((o1, o2) -> {
            if (o1.getHomeTeamScore() + o1.getAwayTeamScore() == o2.getHomeTeamScore() + o2.getAwayTeamScore())
                return Long.compare(o2.getMatchFinishTime(), o1.getMatchFinishTime());
            return 0;
        });
        return completedGames;
    }
}
