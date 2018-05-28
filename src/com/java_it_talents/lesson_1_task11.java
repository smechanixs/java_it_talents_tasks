package com.java_it_talents;

import java.util.Scanner;

public class lesson_1_task11 {
  public static void main(String[] args) {
    //1. Read volume number from console
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a 3 digit number: ");
    int inputNum = sc.nextInt();

    //2. Extract the digits
    if (inputNum < 100 || inputNum > 999) {
      System.out.println("Number out of bounds!");
    } else {
      int firstDigit = inputNum / 100;
      int secondDigit = (inputNum % 100) / 10;
      int thirdDigit = inputNum % 10;
      if (inputNum % firstDigit == 0 && inputNum % secondDigit == 0 && inputNum % thirdDigit == 0) {
        System.out.println(inputNum + " can be divided on any of its digits.");
      } else {
        System.out.println(inputNum + " can't be divided on some or all of its digits! :((");
      }
    }
  }
}