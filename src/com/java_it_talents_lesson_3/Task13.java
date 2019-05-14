package com.java_it_talents_lesson_3;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a num between 2 and 27: ");
        int sum = sc.nextInt();

        while (sum < 2 || sum > 27){
            System.out.println("Please enter a num between 2 and 27: ");
            sum = sc.nextInt();
        }

        for (int i = 100; i < 1000; i++){
            int firstD = i / 100;
            int secondD = i / 10 % 10;
            int thirdD = i % 10;
            if (firstD + secondD + thirdD == sum){
                System.out.print(i + "; ");
            }

        }


    }

}
