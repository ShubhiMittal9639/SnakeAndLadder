package com.example.snakeandladder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SnakeAndLadderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SnakeAndLadderApplication.class, args);
        Scanner scanner = new Scanner(System.in);
        int noOfSnakes = scanner.nextInt();
        Entities entities = Entities.getInstance();
        HashMap<Integer, Integer> snakeList = new HashMap<>();
        while (noOfSnakes > 0) {
            int startLocation = scanner.nextInt();
            int endLocation = scanner.nextInt();
            snakeList.put(startLocation, endLocation);
            noOfSnakes--;
        }
        int noOfLadders = scanner.nextInt();
        HashMap<Integer, Integer> ladderList = new HashMap<>();
        while (noOfLadders > 0) {
            int startLocation = scanner.nextInt();
            int endLocation = scanner.nextInt();
            ladderList.put(startLocation, endLocation);
            noOfLadders--;
        }
        int noOfPlayers = scanner.nextInt();
        List<Player> playerList = new ArrayList<>();
        while (noOfPlayers > 0) {
            String playerName = scanner.next();
            playerList.add(new Player(playerName,0));
            noOfPlayers--;
        }

        entities.setLadderList(ladderList);
        entities.setSnakeList(snakeList);
        entities.setPlayerList(playerList);

        Game game = new Game();
        game.playGame(entities);
    }

}
