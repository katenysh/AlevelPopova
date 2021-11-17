package com.popova.module1.task1;

import java.util.Arrays;

public class MathMas {
    UserInput userInput = new UserInput();
    final int[] mas = new int[userInput.getInput()];

    public int[] getMas() {
        return mas;
    }

    public void randomMathMas() {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (-100 + Math.random() * 200);
        }
        System.out.println(Arrays.toString(mas));
    }

    public void bubbleSortMax() {
        for (int i = mas.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mas[j] > mas[j + 1]) {
                    int tmp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = tmp;

                }

            }
        }
        System.out.println(Arrays.toString(mas));
    }

    public void bubbleSortMin() {
        for (int i = mas.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (mas[j] < mas[j + 1]) {

                    int tmp = mas[j + 1];

                    mas[j + 1] = mas[j];

                    mas[j] = tmp;

                }

            }

        }
        System.out.println(Arrays.toString(mas));
    }

    public void masCube() {
        for (int i = 2; i < getMas().length; i += 3) {
            mas[i] = (int) Math.pow(getMas()[i], 3);
        }
        System.out.println("Массив с кубическим значением каждого третьего: " + "\n" + Arrays.toString(mas));
    }
}




