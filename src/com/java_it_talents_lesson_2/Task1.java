package com.java_it_talents_lesson_2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Please type first number: ");
        Scanner numberA = new Scanner(System.in);
        int A = numberA.nextInt();

        System.out.println("Please type second number: ");
        Scanner numberB = new Scanner(System.in);
        int B = numberB.nextInt();

        System.out.println("Please type third number: ");
        Scanner numberC = new Scanner(System.in);
        int C = numberC.nextInt();

        if ((C > A) && (C < B)) {
            System.out.println(C + " is between " + A + " and " + B);
        } else {
            System.out.println("Not between: " + A + " and " + B);
        }
    }
}
