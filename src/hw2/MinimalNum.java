package hw2;

public class MinimalNum {
    public static void main(String[] args) {

        System.out.println("Сгенерированы 3 числа: ");

        int a = (int) (Math.random() * 11);
        System.out.println("1 число = " + a);

        int b = (int) (Math.random() * 11);
        System.out.println("2 число = " + b);

        int c = (int) (Math.random() * 11);
        System.out.println("3 число = " + c);

        a = (a < b && a < c) ? a : ((b < c) ? b : c);
        System.out.println("Наименьшее число: " + a);
    }
}