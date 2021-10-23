package task1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kate Popova");
        int sizeMyName = 10;
        if (sizeMyName < 7) {
            System.out.println("less than 7");
        } else if (sizeMyName > 7) {
            System.out.println("more than 7");
        } for (int i = 0, q = 5; i<11; i++, q+=2) {
            System.out.print("Шаг " + i + ", значение: " + q);
        }
    }
}