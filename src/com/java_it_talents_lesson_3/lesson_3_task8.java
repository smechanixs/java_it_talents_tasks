package com.java_it_talents_lesson_3;

import java.util.Scanner;

public class lesson_3_task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 'n': ");
        int inputN = sc.nextInt();
        int step = inputN - 1;
        if (inputN <= 0) {
            System.out.print("Invalid input. The number must be a positive integer!");
        } else {

            for (int i = 1; i <= inputN; i++) {
                for (int j = 0; j < inputN; j++) {
                    System.out.print(step);
                }
                step += 2;
                System.out.println();
            }
        }
    }
}

