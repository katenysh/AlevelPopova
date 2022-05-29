package com.popova.hw5;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] num1 = new int[5];
        int[] num2 = new int[5];

        for (int i = 0; i < num1.length; i++) {
            num1[i] = (int) (Math.random() * 5);
            num2[i] = (int) (Math.random() * 5);
        }
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));

        int mean1 = 0, mean2 = 0;

        for (int i = 0; i < num1.length; i++) {
            mean1 += num1[i];
            mean2 += num2[i];
        }
        mean1 /= 5;
        mean2 /= 5;

        if (mean1 > mean2) {
            System.out.println("Среднее арифметическое первого массива больше среднего арифметического второго массива.");
        } else if (mean1 < mean2) {
            System.out.println("Среднее арифметическое второго массива больше среднего арифметического первого массива.");
        } else {
            System.out.println("Средние арифметические массивов равны.");
        }
    }
}
