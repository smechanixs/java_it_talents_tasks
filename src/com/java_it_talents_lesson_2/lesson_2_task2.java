package com.java_it_talents_lesson_2;

import java.util.Scanner;

public class lesson_2_task2 {
    public static void main(String[] args) {

        System.out.println("Please type first number: ");
        Scanner numberA = new Scanner(System.in);
        double A = numberA.nextDouble();

        System.out.println("Please type second number: ");
        Scanner numberB = new Scanner(System.in);
        double B = numberB.nextDouble();

        //calc sum of the numbers//
        System.out.println("The sum is: " + (A + B));

        //calc division of the numbers//
        System.out.println("The result of the division is: " + (A / B));

        //calc modulo of the nums//
        System.out.println("The result of the modulo is: " + (A % B));
    }
}
