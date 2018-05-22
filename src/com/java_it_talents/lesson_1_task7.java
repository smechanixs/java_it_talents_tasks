package com.java_it_talents;

import java.util.Scanner;

public class lesson_1_task7 {
    public static void main(String[] args) {

        System.out.println("Please type hour: ");
        Scanner hr = new Scanner(System.in);
        int hour = hr.nextInt();

        System.out.println("Please enter amount of money: ");
        Scanner mny = new Scanner(System.in);
        float money = mny.nextFloat();

        System.out.println("Are you healthy?: ");
        Scanner stat = new Scanner(System.in);
        String status = stat.nextLine();
        boolean statusResult = false;
        if (status.equals("yes")) {
            statusResult = true;
        } else if (status.equals("no")) {
            statusResult = false;

        } else {
            System.out.println("Unknown input :(!");
        }


        // if ill - no going out

        if (statusResult == false && money > 0) {
            System.out.println("You will not go outside! You will buy meds!");
        } else if (statusResult == false && money <= 0) {
            System.out.println("You will not go outside! You will drink tea at home!");
        } else if (statusResult == true && money >= 10) {
            System.out.println("You will go to the cinema!");
        } else if (statusResult == true && money <= 10) {
            System.out.println("You will go to a cafe!");
        }

    }
}
    //test comment for git
