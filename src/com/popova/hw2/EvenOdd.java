package com.popova.hw2;

public class EvenOdd {
    public static void main(String[] args){

        int num = (int) (Math.random() * 11);

        System.out.println ("рандомное число: " + num);
        System.out.println("число " + ((num % 2 ==0)? "чётное" : "нечётное") );
}
}