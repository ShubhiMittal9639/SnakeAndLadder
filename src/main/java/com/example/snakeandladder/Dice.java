package com.example.snakeandladder;

import java.util.Random;

public class Dice {
    Random random = new Random();

    public Integer generateRandomNumber() {
        return random.nextInt(6) + 1;
    }
}
