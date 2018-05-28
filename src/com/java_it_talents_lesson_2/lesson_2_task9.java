package com.java_it_talents_lesson_2;

import java.util.Scanner;

public class lesson_2_task9 {
  public static void main(String[] args) {
    //1. Read two int from console
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter first number: ");
    int inputNum1 = sc.nextInt();
    System.out.println("Please enter second number: ");
    int inputNum2 = sc.nextInt();
    //2. Check if the last digit of the product of the two numbers is even and print the result
    if ((inputNum1 < 10 || inputNum1 > 99) || (inputNum2 < 10 || inputNum2 > 99)) {
      System.out.println("One of the numbers is out of bounds!!!");
    } else {
      int product = inputNum1 * inputNum2;
      int lastdigit = product % 10;
      System.out.println(lastdigit);
      if (lastdigit % 2 == 0) {
        System.out.println(product + ", " + lastdigit + " is even");
      } else {
        System.out.println(product + ", " + lastdigit + " is odd");
      }

    }

  }
}
