package com.sportradar.football.initializer;

import com.sportradar.football.model.FixtureBetweenTeams;

import java.util.ArrayList;
import java.util.List;

public class WorldCupFixtures {

    public static List<FixtureBetweenTeams> gameFixture(List<String> listOfTeams) {
        var fixtureBetweenTeams = new ArrayList<FixtureBetweenTeams>();
        for (String homeTeamName : listOfTeams) {
            var homeTeam = new ArrayList<String>();
            var awayTeam = new ArrayList<String>();
            var teams = new FixtureBetweenTeams();
            homeTeam.add(homeTeamName);
            listOfTeams.forEach(awayTeamName -> {
                if (!awayTeamName.equalsIgnoreCase(homeTeamName))
                    awayTeam.add(awayTeamName);
                teams.setHomeTeam(homeTeam);
                teams.setAwayTeam(awayTeam);
            });
            fixtureBetweenTeams.add(teams);
        }
        return fixtureBetweenTeams;
    }
}
