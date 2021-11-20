package com.popova.module1.task1;

import java.util.Scanner;

public class UserInput {

    private final Scanner scanner = new Scanner(System.in);
    static int input;

    public void userInputMasVolume() {
        System.out.println("Введите размер массива:");

        while (input < 10) {
            input = scanner.nextInt();
            if (input < 10) {
                System.out.println("Введите число больше 10");
            }
        }
    }

    public void setInput(int input) {
        this.input = input;
    }

    public int getInput() {
        return input;
    }

    public void doActions(MathMas mathMas) {
        StringBuilder builder = new StringBuilder("Выберите способ сортировки:\n");
        builder.append(1).append(") По позрастанию\n");
        builder.append(2).append(") По убыванию\n");

        int userAction;

        System.out.println();
        System.out.print(builder);
        userAction = scanner.nextInt();

        switch (userAction) {
            case 1 -> {
                mathMas.bubbleSortMax();
            }
            case 2 -> {
                mathMas.bubbleSortMin();
            }
            default -> {
                throw new IllegalStateException();
            }
        }
    }
}



