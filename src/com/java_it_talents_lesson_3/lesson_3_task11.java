package com.java_it_talents_lesson_3;

import java.util.Scanner;

public class lesson_3_task11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a height: ");
        int height = sc.nextInt();
        int spaces = height - 1;
        int stars = 1;

        while (height < 4) {
            System.out.println("Please enter a valid height(min 4): ");
            height = sc.nextInt();
        }

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int s = 1; s <= stars; s++) {
                System.out.print("*");
            }
            spaces--;
            stars += 2;
            System.out.println();
        }

    }
}
