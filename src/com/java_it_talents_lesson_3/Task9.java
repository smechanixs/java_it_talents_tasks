package com.java_it_talents_lesson_3;

import java.util.Scanner;

public class Task9 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        1. Read two numbers
        System.out.println("Please enter 'A': ");
        int a = sc.nextInt();
        System.out.println("Please enter 'A': ");
        int b = sc.nextInt();
        int sum = 0;
        int c = 0;

        if (a > b){
            c = a;
            a = b;
            b = c;
        }
        //        2. Print all numbers between A and B on step 2
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                System.out.print("Skip " + i);
                if (i < b) {
                    System.out.print(" , ");
                }
            } else {
                sum += i * i;
                if (sum > 200) {
                    System.out.print(i * i);
                    break;
                }
                System.out.print(i * i);
                if (i < b) {
                    System.out.print(" , ");
                }
            }
        }
    }
}
//Задача 9: Да се прочетат 2 числа от клавиатурата А и В.
//        Да се изведат всички числа от А до В на степен 2(разделени с
//        запетая).Ако някое число е кратно на 3, да се изведе съобщение че
//        числото се пропуска „skip 3“.Ако сумата от всички изведени числа (без
//        пропуснатите) стане по-голяма от 200, да се прекрати извеждането.