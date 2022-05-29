package com.popova.hw5;

import java.util.Arrays;

public class Task0 {

    public static void main(String[] args) {

        int[] num = new int[8];

        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (1 + Math.random() * 10);
        }
        System.out.println(Arrays.toString(num));
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0)
                num[i] = 0;
        }
        System.out.println(Arrays.toString(num));
    }
}