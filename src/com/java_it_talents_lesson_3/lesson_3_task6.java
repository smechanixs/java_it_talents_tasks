package com.java_it_talents_lesson_3;

import java.util.Scanner;

public class lesson_3_task6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int inputNum1 = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= inputNum1 ; i++) {

            sum+=i;
        }
        System.out.println(sum);
    }
}