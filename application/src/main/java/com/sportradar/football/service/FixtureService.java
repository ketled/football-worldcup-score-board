package com.sportradar.football.service;

import com.sportradar.football.initializer.WorldCupFixtures;
import com.sportradar.football.model.FixtureBetweenTeams;
import com.sportradar.football.model.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static com.sportradar.football.common.MatchStatus.TO_BE_STARTED;
import static com.sportradar.football.common.Scoreboard.showLiveMatch;

public class FixtureService {

    public static List<Game> worldCupFixture(List<String> listOfTeams) {
        System.out.println("World cup fixture- ");
        List<FixtureBetweenTeams> fixtureBetweenTeams = WorldCupFixtures.gameFixture(listOfTeams);
        var gameList = new ArrayList<Game>();
        AtomicInteger matchCounter = new AtomicInteger();
        fixtureBetweenTeams.forEach(teams ->
                teams.getHomeTeam().forEach(homeTeam ->
                        teams.getAwayTeam().forEach(awayTeam -> {
                            Game game = new Game();
                            game.setHomeTeam(homeTeam);
                            game.setAwayTeam(awayTeam);
                            game.setHomeTeamScore(0);
                            game.setAwayTeamScore(0);
                            game.setMatchNumber(matchCounter.incrementAndGet());
                            game.setStatus(TO_BE_STARTED);
                            gameList.add(game);
                        })));
        showLiveMatch(gameList, "Game- ");
        return gameList;
    }
}
