package com.sportradar.football.model;

import java.util.List;

public class FixtureBetweenTeams {
    private List<String> homeTeam;
    private List<String> awayTeam;

    public List<String> getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(List<String> homeTeam) {
        this.homeTeam = homeTeam;
    }

    public List<String> getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(List<String> awayTeam) {
        this.awayTeam = awayTeam;
    }
}
