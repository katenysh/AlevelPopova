package com.popova.hw6;
public class Garage {

    public static void checkCar(Car car) {

        if (car.isEnoughPetrolLevel() && car.getEngine().getPower() > 200) {
            System.out.println("Проверка пройдена.");
        } else if (car.isEnoughPetrolLevel() != car.getEngine().getPower() > 200) {
            System.out.println("Не хватает мощности двигателя.");
        } else if (car.getEngine().getPower() > 200 != car.isEnoughPetrolLevel()) {
            System.out.println("Не хватает бензина.");
        } else {
            System.out.println("Не хватает бензина и мощности двигателя.");
        }
    }

    @Override
    public String toString() {
        return "Garage{}";
    }
}