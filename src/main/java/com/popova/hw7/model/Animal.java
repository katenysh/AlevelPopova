package com.popova.hw7.model;

import java.util.Arrays;

public class Animal {
    private final String name;
    private final AnimalType type;
    private int age;
    private double hungry;
    private int money;
    private double clear;
    private double happy;
    private boolean unHappy;
    private boolean veryUnHappy;
    private boolean isIll;
    private Present[] presents;

    public Animal(String name, AnimalType type) {
        this.name = name;
        this.type = type;
        this.age = 1;
        this.hungry = 100;
        this.money = 0;
        this.clear = 100;
        this.happy = 50;
        this.presents = new Present[0];
    }

    public String getName() {
        return name;
    }

    public AnimalType getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public void addAge(int age) {
        this.age += age;
    }

    public double getHungry() {
        return hungry;
    }

    public void addHungry(double hungry) {
        this.hungry += hungry;
    }


    public int getMoney() {
        return money;
    }

    public void addMoney(int money) {
        this.money += money;
    }

    public double getClear() {
        return clear;
    }

    public void addClear(double clear) {
        this.clear += clear;
    }

    public double getHappy() {
        return happy;
    }

    public void addHappy(double happy) {
        this.happy += happy;
    }

    public boolean isUnHappy() {
        return (happy < 20);
    }

    public double isVeryUnHappy() {
        return (happy < 10) ? 1.2 : 1;
    }

    public double isHungry() {
        return (hungry < 50.0) ? 1.5 : 1.0;
    }

    public Present[] getPresents() {
        return presents;
    }

    public void addPresents(Present[] presents) {
        this.presents = presents;
    }

    public boolean isIll() {
        return isIll;
    }

    public void setIll(boolean isIll) {
        this.isIll = isIll;
    }

    @Override
    public String toString() {
        return "Animal{" +

                "name='" + name + '\'' +
                ", type=" + type +
                ", age=" + age +
                ", hungry=" + hungry +
                ", money=" + money +
                ", clear=" + clear +
                ", happy=" + happy +
                ", unHappy=" + unHappy +
                ", veryUnHappy=" + veryUnHappy +
                ", isIll=" + isIll +
                ", presents=" + Arrays.toString(presents) +
                '}';
    }
}