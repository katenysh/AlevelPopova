package com.popova.hw7.actions;

import com.popova.hw7.model.Animal;

import java.util.Random;

public class Game {

    private int gamesCount = 0;
    private final Random random = new Random();

    public void doAction(Animal animal) {
        animal.addHungry(-3 * animal.getIndex());

        animal.addHappy(6);

        animal.addMoney(random.nextInt(10));

        if (++gamesCount == 6) {
            gamesCount = 0;
            animal.addAge(1);
        }
        final int randomNumber = random.nextInt(100);
        if (randomNumber <= 10) {
            animal.setIll(true);
        }
    }
}
