package hw1;

public class MyName {
    public static class Main {
        public static void main(String[] args) {
            var myName = "Kate Popova";
            System.out.println(myName);

            if (myName.length() < 7) {
                System.out.println("less than 7");
            } else if (myName.length() > 7) {
                System.out.println("more than 7");
            }
            for (int i = 0, q = 5; i < 11; i++, q += 2) {
                System.out.println("Шаг " + i + ", значение: " + q);
            }
        }
    }
}
