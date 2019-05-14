package com.java_it_talents_lesson_3;


public class Task12 {
    public static void main(String[] args) {



        int startNum = 100;

        for (int i = startNum; i < 1000; i++) {

            int firstD = i / 100;
            int secondD = i / 10 % 10;
            int thirdD = i % 10;
            if (firstD != secondD && firstD != thirdD && secondD != thirdD) {
                System.out.println(i);

            }

        }

    }

}
