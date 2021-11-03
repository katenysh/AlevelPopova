package com.popova.hw3;

//добавила секунды к этому делу
public class task3 {
    public static void main(String[] args) {
        for (int hour = 0; hour < 24; hour++) {
            String hourS = hour < 10 ? "0" + hour : String.valueOf(hour);
            for (int min = 0; min < 60; min++) {
                String minS = min < 10 ? "0" + min : String.valueOf(min);
                for (int second = 0; second < 60; second++) {
                    String secondS = second < 10 ? "0" + second : String.valueOf(second);
                    if (hourS.equals(minS)) {
                        StringBuilder stringMin = new StringBuilder(minS);
                        String minReverse = stringMin.reverse().toString();
                        if (minS.equals(secondS)) {
                            StringBuilder stringSecond = new StringBuilder(secondS);
                            String secondReverse = stringSecond.reverse().toString();
                            if (Integer.valueOf(minReverse) < 60) {
                                System.out.print("hourS " + hourS);
                                System.out.print(" minReverse " + minReverse);
                                System.out.println(" seconds " + secondS);
                            }
                        }
                    }
                }
            }
        }
    }
}