package com.popova.module1.task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 3, 2, 1};
        Lock lock = new Lock(array.clone());
        lock.getArray()[0] = 200;
        lock.getArray()[1] = 300;
        System.out.println(Arrays.toString(array));
    }
}


