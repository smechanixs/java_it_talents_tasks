package com.java_it_talents_lesson_3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a starting number: ");
        int inputNum1 = sc.nextInt();

        System.out.println("Please enter an ending number: ");
        int inputNum2 = sc.nextInt();

        for (int i = inputNum1; i <= inputNum2; i++) {
            System.out.println(i);
        }
    }
}
