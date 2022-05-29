package com.popova.hw7.actions;

import com.popova.hw7.model.Animal;
import com.popova.hw7.model.Present;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Store {
    public void doAction(Animal animal) {

        final Scanner scanner = new Scanner(System.in);
        final Random random = new Random();

        int userChoice;

        do {

            System.out.println("""
                    Выберите стоимость подарка:\s
                     1. 100 монет (+20 счастье)\s
                     2. 150 монет (+25 счастье)\s
                     3. 200 монет (+30 счастье)""");

            Present[] variants = Present.values();
            int variant = random.nextInt(variants.length);

            userChoice = scanner.nextInt();
            switch (userChoice) {
                case 0 -> {
                    int price = 100;
                    if (animal.getMoney() < price) {
                        System.out.println("Не хватает денег.");
                        break;
                    }
                    animal.addMoney(-price);
                    animal.addPresents(variants);
                    animal.addHappy(+20);

                }
                case 1 -> {
                    int price = 150;
                    if (animal.getMoney() < price) {
                        System.out.println("Не хватает денег.");
                        break;
                    }
                    animal.addMoney(-price);
                    animal.addPresents(variants);
                    animal.addHappy(+25);

                }
                case 2 -> {
                    int price = 200;
                    if (animal.getMoney() < price) {
                        System.out.println("Не хватает денег.");
                        break;
                    }
                    animal.addMoney(-price);
                    animal.addPresents(variants);
                    animal.addHappy(+30);

                }
                default -> throw new IllegalStateException("Unexpected value: ");
            }
        } while (userChoice > 3);
    }
}
