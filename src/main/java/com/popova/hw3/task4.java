package com.popova.hw3;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        int secret = (int) (Math.random() * (100 + 1));
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        System.out.println("Игра угадай число.");
        do {
            System.out.print("Ваше число:");
            guess = scanner.nextInt();

            if (guess > secret) {
                System.out.println("Меньше");
            } else if (guess < secret) {
                System.out.println("Больше");
            } else {
                System.out.println("Угадал!");
            }
        } while (guess != secret);
    }
}

