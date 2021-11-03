package com.popova.hw3;

import java.util.Scanner;

public class task0 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String line = scanner.nextLine();
        final String[] parts = line.split(" ");
        int count = 0;

        for (int i = 0; i < parts.length; i++) {
            String s = parts[i];
            if (s.trim().isEmpty()) {
                continue;
            }
            count++;
        }
        System.out.println("length " + parts.length);
        System.out.println("count " + count);
    }
}



