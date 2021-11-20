package com.popova.hw7.actions;

import com.popova.hw7.model.Animal;

import java.util.Random;

public class Work {
    private final Random random = new Random();
    private int workCount;

    public void doAction(Animal animal) {

        if (animal.getAge() < 5) {
            System.out.println(animal.getName() + " несовершеннолетний!");
            return;
        } else if (animal.getClear() < 20) {
            System.out.println(animal.getName() + " не может работать.");
            return;
        }

        double factor = 1.0 * animal.isHungry() * animal.isVeryUnHappy();
        final int randomNumber1 = random.nextInt(100);
        if (randomNumber1 <= 10) {
            if (animal.isIll()) {
                factor *= 2;
            }

            final int randomNumber2 = random.nextInt(100);
            if (randomNumber2 <= 30) {
                if (animal.getClear() < 50) {
                    factor *= 3;
                }
                animal.addMoney(random.nextInt(5 + 20));

                animal.addHungry(-4 * factor);
                animal.addHappy(-2 * factor);

                if (++workCount == 6) {
                    workCount = 0;
                    animal.addAge(1);
                }
            }
        }
    }
}