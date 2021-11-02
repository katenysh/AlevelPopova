package hw2;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, c;
        System.out.println("ширина : ");
        a = scanner.nextInt();
        System.out.println("высота : ");
        b = scanner.nextInt();
        System.out.println("длина : ");
        c = scanner.nextInt();

        double p, s;
        p = (a + b + c) / 2;
        s = p * (p - a) * (p - b) * (p - c);

        System.out.printf("площадь(%.3f) = %.3f%n", s, Math.sqrt(s));
    }
}

