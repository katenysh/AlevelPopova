package com.popova.module1.task2;

public class Lock {

    private int[] array;

    public Lock(int[] array) {
        this.array = array == null ? null : array.clone();
    }

    public int[] getArray() {
        return array == null ? null : array.clone();
    }
}