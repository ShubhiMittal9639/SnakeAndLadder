package com.example.snakeandladder;

import java.util.Map;

public class Game {

    public void playGame(Entities entities) {
        Player currentPlayer;
        Map<Integer, Integer> snakeList = entities.getSnakeList();
        Map<Integer, Integer> ladderList = entities.getLadderList();
        Dice dice = new Dice();
        currentPlayer = entities.getPlayerList().get(0);

        while (currentPlayer.getCurrentPosition() != 100) {
            for (Player player : entities.getPlayerList()) {
                currentPlayer = player;
                Integer diceNumber = dice.generateRandomNumber();
                Integer newPosition = currentPlayer.getCurrentPosition() + diceNumber;
                Integer finalPosition = newPosition;
                if (snakeList.containsKey(newPosition)) {
                    finalPosition = snakeList.get(newPosition);
                } else if (ladderList.containsKey(newPosition)) {
                    finalPosition = ladderList.get(newPosition);
                }
                System.out.println(currentPlayer.getPlayerName() + " rolled a " + diceNumber + " and moved from " + currentPlayer.getCurrentPosition() + " to " + finalPosition);
                currentPlayer.setCurrentPosition(finalPosition);
                if (finalPosition == 100) {
                    break;
                }
            }

        }



        System.out.println(currentPlayer.getPlayerName() + " wins the game ");
    }



}
