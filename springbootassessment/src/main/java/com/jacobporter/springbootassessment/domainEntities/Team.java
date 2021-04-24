package com.jacobporter.springbootassessment.domainEntities;

public class Team {

    private int teamId;
    private String teamName;
    private String city;
    private String mascot;

    public Team(int teamId, String teamName, String city, String mascot) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.city = city;
        this.mascot = mascot;
    }
}
