package com.popova.hw6;

public class Car {

    private Manufacturer manufacturer;
    private Engine engine;
    private String colour;
    private int petrol;

    public Car(Manufacturer manufacturer, Engine engine, String colour) {
        this.manufacturer = manufacturer;
        this.engine = engine;
        this.colour = colour;
        this.petrol = 100;
    }

    public Manufacturer getManufacturer() {

        return manufacturer;
    }

    public void setManyfacturer(Manufacturer manufacturer) {

        this.manufacturer = manufacturer;
    }

    public Engine getEngine() {

        return engine;
    }

    public void setEngine(Engine engine) {

        this.engine = engine;
    }

    public String getColour() {

        return colour;
    }

    public void setColour(String colour) {

        this.colour = colour;
    }

    public int getPetrol() {

        return petrol;
    }

    public void setPetrol(String petrol) {

        petrol = petrol;
    }

    public void startEngine(String name) {

        if (isEnoughPetrolLevel()) {
            System.out.println(name + "запустил двигатель");
        } else {
            System.out.println(name + "  НЕ запустил двигатель");
        }
    }

    public boolean isEnoughPetrolLevel() {
        return this.petrol > 50;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer=" + manufacturer.getRussianName() +
                ", engine=" + engine +
                ", colour='" + colour + '\'' +
                ", petrol=" + petrol +
                '}';
    }
}



