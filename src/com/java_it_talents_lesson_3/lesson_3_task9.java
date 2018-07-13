package com.java_it_talents_lesson_3;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class lesson_3_task9 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        1. Read two numbers
        System.out.println("Please enter 'A': ");
        int a = sc.nextInt();
        System.out.println("Please enter 'A': ");
        int b = sc.nextInt();
        int sum = 0;
        //        2. Print all numbers between A and B on step 2
        for (int i = a; i <= b; i++) {
            if ((i * i) % 3 == 0) {
                System.out.print("Skip 3" + ", ");
            }
            System.out.print(i * i + ", ");
        }
    }

}


