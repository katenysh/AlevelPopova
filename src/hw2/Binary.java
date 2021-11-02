package hw2;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Введите число: ");
        int input = s.nextInt();

        String output = "";

        if (input <= 0) {
            System.out.println("Недопустимое число");
        } else {
            do {
                output = input % 2 + output;
                input /= 2;
            } while (input > 0);
            System.out.println(output);


        }
    }
}


