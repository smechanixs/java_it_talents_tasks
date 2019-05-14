package com.java_it_talents_lesson_3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 'n': ");
        int inputN = sc.nextInt();

        if (inputN <= 0) {
            System.out.println("The number has to be with positive value!");
        } else {
            for (int i = 3; i <= 3 * inputN; i+=3) {
                System.out.print(i);
                if (i < 3 * inputN){
                    System.out.print(", ");
                }
                }

            }
        }

    }
