package com.popova.hw6;

public enum Manufacturer {
    BMW("БМВ"),
    FORD("Форд"),
    TOYOTA("Тойота");

   private String russianName;

    Manufacturer(String russianName) {
        this.russianName = russianName;
    }

    public String getRussianName() {
        return russianName;
    }
}
