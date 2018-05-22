package com.java_it_talents;

import java.util.Scanner;

public class lesson_1_task8 {
    public static void main(String[] args) {

        //1.Read number from input//

        System.out.println("Please enter 4-digit number: ");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        if (number < 1000 || number > 9999) {
            System.out.println("Number out of bounds!!!");
        }

        //2.Create 2 2-digit numbers. First = 1st and 4th digit and second = 2nd and third digit//
//        int count = 0;
//        while (number > 0) {
//            int digit = number % 10;
//            if (digit == 1) {
//                count++;
//                number /= 10;
//            }
//        }
        System.out.println(number);
        //3.Compare the two numbers.


    }
}

