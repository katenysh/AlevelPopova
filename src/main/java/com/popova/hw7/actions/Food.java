package com.popova.hw7.actions;

import com.popova.hw7.model.Animal;

public class Food {
    public void doAction(Animal animal) {

        animal.addHungry(+ 5  * animal.getIndex());
        animal.addClear(-2 * animal.getIndex());
    }
}