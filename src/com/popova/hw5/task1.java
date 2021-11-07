package com.popova.hw5;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {

        int[] num = new int[4];

        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (10 + Math.random() * 89);
        }
        System.out.println(Arrays.toString(num));

        boolean flag = false;
        for (int i = 1; i < num.length; i++) {
            if (num[i] <= num[i - 1]) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Не возрастающая последовательность.");
        } else {
            System.out.println("Вощрастающая последовательность.");
        }
    }
}