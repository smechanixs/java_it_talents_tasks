package com.java_it_talents_lesson_3;

import java.util.Scanner;

public class lesson_3_task10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to check if it is prime: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        while (num < 1) {
            System.out.println("Please enter enter a number bigger than 1: ");
            num = sc.nextInt();
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.print("The number is prime!");
        } else {
            System.out.print("The number is NOT PRIME!");
            }
        }
    }


//Задача 10: Въведете число от клавиатурата и определете дали е
//        просто. Просто число е това което се дели САМО на 1 и на себе
//        си