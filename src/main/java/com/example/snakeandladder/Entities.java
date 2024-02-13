package com.example.snakeandladder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Entities {

    Map<Integer, Integer> snakeList;
    Map<Integer, Integer> ladderList;
    List<Player> playerList;
    private static volatile Entities instance;

    private Entities() {

    }

    public static Entities getInstance() {
        if (instance == null) {
            synchronized (Entities.class) {
                if (instance == null) {
                    instance = new Entities();
                }
            }
        }
        return instance;
    }

    public Map<Integer, Integer> getSnakeList() {
        return snakeList;
    }

    public void setSnakeList(Map<Integer, Integer> snakeList) {
        this.snakeList = snakeList;
    }

    public Map<Integer, Integer> getLadderList() {
        return ladderList;
    }

    public void setLadderList(Map<Integer, Integer> ladderList) {
        this.ladderList = ladderList;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }
}
