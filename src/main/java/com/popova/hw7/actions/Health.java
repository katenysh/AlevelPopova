package com.popova.hw7.actions;

import com.popova.hw7.model.Animal;

public class Health {
    public void doAction(Animal animal) {
        if (animal.isIll()) {
            int price = 50;
            if (animal.getMoney() < price) {
                System.out.printf("Недостаточно денег.");
                return;
            }
            animal.addMoney(-price);
            if (animal.getHappy() > 10) {
                animal.addHappy(10);
            }
            if (animal.getHungry() > 70) {
                animal.addHungry(70);
            }
            if (animal.getClear() < 80) {

                animal.addClear(80);
            }
            animal.setIll(false);
            System.out.println(animal.getName() + " выздоровел.");

        } else {
            System.out.println(animal.getName() + " не болеет.");
        }


    }
}
