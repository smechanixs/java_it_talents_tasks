package com.java_it_talents;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class lesson_1_task8 {
  public static void main(String[] args) {

    //1.Read inputNum from input//

    System.out.println("Please enter 4-digit inputNum: ");
    Scanner sc = new Scanner(System.in);
    int inputNum = sc.nextInt();

    //2.Create 2 2-digit numbers. First = 1st and 4th digit and second = 2nd and third digit//

    if (inputNum < 1000 || inputNum > 9999) {
      System.out.println("Number out of bounds!!!");
    } else {
      int firstDigit = inputNum / 1000;
      int secondDigit = (inputNum % 1000) / 100;
      int thirdDigit = (inputNum % 100) / 10;
      int fourthDigit = inputNum % 10;
      int newNum1 = firstDigit * 10 + fourthDigit;
      int newNum2 = secondDigit * 10 + thirdDigit;

      //3.Compare the two numbers.
      if (newNum1 > newNum2) {
        System.out.println(newNum1 + " is greater than " + newNum2);
      } else if (newNum1 < newNum2) {
        System.out.println(newNum2 + " is greater than " + newNum1);

      } else {

        System.out.println("The numbers are equal. " + newNum1 + " = " + newNum2);
      }

    }
  }
}

