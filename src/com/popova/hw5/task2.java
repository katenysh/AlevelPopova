package com.popova.hw5;

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        int[] num1 = new int[5];
        int[] num2 = new int[5];

        for (int i = 0; i < num1.length; i++) {
            num1[i] = (int) (Math.random() * 5);
        }
        System.out.println(Arrays.toString(num1));

        for (int i = 0; i < num2.length; i++) {
            num2[i] = (int) (Math.random() * 5);
        }
        System.out.println(Arrays.toString(num2));

        int sumNum = 0;
        int sumNum2 = 0;

        for (int i = 0; i < num1.length; i++) {
            sumNum = sumNum + num1[i];
        }
        for (int i = 0; i < num2.length; i++) {
            sumNum2 = sumNum2 + num2[i];
        }
        if (sumNum > sumNum2) {
            System.out.println("Сумма массива num1 больше.");
        } else if (sumNum < sumNum2) {
            System.out.println("Сумма массива num2 больше.");
        } else {
            System.out.println("Сумма равна");
        }
    }
}

