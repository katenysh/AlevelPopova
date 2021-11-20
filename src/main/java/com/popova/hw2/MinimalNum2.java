package com.popova.hw2;

public class MinimalNum2 {
    public static void main(String args[]){

        System.out.println ("Сгенерированы 3 числа: ");

        double a = Math.random() ;
        System.out.println ("1 число = " + a );

        double b = Math.random();
        System.out.println ("2 число = " + b);

        double c = Math.random();
        System.out.println ("3 число = " + c );

        a = Math.abs(a);
        b = Math.abs(b);
        c = Math.abs(c);

        double tmp = Math.min(a,b);
        double min = Math.min(tmp, c);
        System.out.println("Наименьшее вещественное число по модулю: " + min);

    }
}
