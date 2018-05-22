package com.java_it_talents;

import java.util.Scanner;

public class lesson_1_task3 {
    public static void main(String[] args) {

        System.out.println("Please type number A: ");
        Scanner numberA = new Scanner(System.in);
        double A = numberA.nextDouble();

        System.out.println("Please type number B: ");
        Scanner numberB = new Scanner(System.in);
        double B = numberB.nextDouble();

        double aNew = B;
        double bNew = A;
        System.out.println("A is: " + aNew);
        System.out.println("B is: " + bNew);


    }
}
