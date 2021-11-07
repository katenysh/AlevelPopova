package com.popova.hw5;

import java.util.Scanner;
import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");

        int input = 0;

        while (input <= 3) {
            input = scanner.nextInt();
            if (input <= 3) {
                System.out.print("Введите число больше 3");
            }
        }
        int[] mas1 = new int[input];
        for (int i = 0; i < input; i++) {
            mas1[i] = (int) (Math.random() * (input + 1));
        }
        System.out.println(Arrays.toString(mas1));

        int[] mas2 = new int[input];
        for (int i = 0; i < input; i++) {
            if (mas1[i] % 2 == 0) {
                mas2[i] = mas1[i];
            }
        }
        System.out.println(Arrays.toString(mas2));
    }

}