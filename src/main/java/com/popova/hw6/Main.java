package com.popova.hw6;

public class Main {

    public static void main(String[] args) {
        Engine engine1 = new Engine();
        engine1.setType("Diesel");
        engine1.setPower(250);

        Engine engine2 = new Engine();
        engine2.setType("Gas");
        engine2.setPower(150);

        final Car car1 = new Car(Manufacturer.BMW, engine1, "black");
        final Car car2 = new Car(Manufacturer.TOYOTA, engine2, "white");

        System.out.println(car1);
        Garage.checkCar(car1);

        System.out.println(car2);
        Garage.checkCar(car2);
    }
}
