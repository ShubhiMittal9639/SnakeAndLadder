package com.example.snakeandladder;

public class Player {
    String playerName;
    Integer currentPosition;

    public Player(String playerName,Integer currentPosition){
        this.playerName = playerName;
        this.currentPosition = currentPosition;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Integer getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Integer currentPosition) {
        this.currentPosition = currentPosition;
    }
}
