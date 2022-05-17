package com.sportradar.football;

import com.sportradar.football.initializer.WorldCupTeams;
import com.sportradar.football.service.FixtureService;
import com.sportradar.football.service.PlayService;

import java.util.List;

import static com.sportradar.football.common.Scoreboard.showLiveMatch;

public class Application {

    public static void main(String[] args) {

        System.out.println("Football world cup has started");
        System.out.println("______________________________");

        var listOfTeams = teamList();// Read me point 1
        var worldCupFixture = FixtureService.worldCupFixture(listOfTeams);// Read me point 2
        var gamesInProgress = PlayService.scoreboard(worldCupFixture);// Read me point 3
        showLiveMatch(gamesInProgress, "Games in progress- ");
        System.out.println("Football world cup has ended");
    }

    private static List<String> teamList() {
        var listOfTeams = WorldCupTeams.listOfTeams();
        listOfTeams.sort(String::compareToIgnoreCase);
        System.out.println("List of teams participating in the tournament are- ");
        System.out.println("___________________________________________________");
        listOfTeams.forEach(System.out::println);
        System.out.println("___________________");
        return listOfTeams;
    }
}
