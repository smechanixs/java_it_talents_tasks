package com.java_it_talents_lesson_3;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a num between 10 and 200: ");
        int num = sc.nextInt();

        while (num < 10 || num > 200) {
            System.out.println("Incorrect input!");
            System.out.println("Please enter a num between 10 and 200: ");
            num = sc.nextInt();
        }
    }

}
