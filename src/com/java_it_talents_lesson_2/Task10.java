package com.java_it_talents_lesson_2;

import java.util.Scanner;

public class Task10 {
  public static void main(String[] args) {
    //1. Read volume number from console
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter volume which you want to fill: ");
    int waterVolume = sc.nextInt();

    if (waterVolume < 10 || waterVolume > 9999) {
      System.out.println("Volume is out of bounds!!");
    //TO DO
    }

    }
  }
