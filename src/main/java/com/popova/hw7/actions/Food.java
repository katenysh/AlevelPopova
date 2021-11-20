package com.popova.hw7.actions;

import com.popova.hw7.model.Animal;

public class Food {
    public void doAction(Animal animal) {
        double factor = 1.0 * animal.isHungry() * animal.isVeryUnHappy();
        if (animal.isIll()) {
            factor *= 2;
        }
        double hungry = animal.getHungry();
        hungry += 5;
        animal.addHungry(hungry);

        double clear = animal.getClear();
        clear -= 2 * factor;
        animal.addClear(clear);
    }
}