package com.jacobporter.springbootassessment.domainEntities;

public class Player {

    private int playerId;
    private int teamId;
    private int positionId;
    private String playerName;
    private int age;
    private int heightInInches;
    private int weightInPounds;

    public Player(int playerId, int teamId, int positionId, String playerName, int age, int heightInInches, int weightInPounds) {
        this.playerId = playerId;
        this.teamId = teamId;
        this.positionId = positionId;
        this.playerName = playerName;
        this.age = age;
        this.heightInInches = heightInInches;
        this.weightInPounds = weightInPounds;
    }
}
