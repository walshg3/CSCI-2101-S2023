package week4;

import java.util.Scanner;

/* Basics of IF Statements */

        // if (condition) {
        //     // code to run if the condition is true
        // }

        // if (condition) {
        //     // code to run if the condition is true
        // } else {
        //     // code to run if the condition is false
        // }

        // if (condition) {
        //     // code to run if the condition is true
        // } else if (condition) {
        //     // code to run if the condition is true
        // } else {
        //     // code to run if the condition is false
        // }

        // if (condition) {
        //     // code to run if the condition is true
        // } else if (condition) {
        //     // code to run if the condition is true
        // } else if (condition) {
        //     // code to run if the condition is true
        // } else {
        //     // code to run if the condition is false
        // }

public class Logic {
    public static void main(String[] args) {
        System.out.println("Start of Logic Playground!");


        // Call in a scanner and collect user input for their name
        // Create a Scanner Object (an instance of the Scanner Class called keyboard)
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        // Collect the user input and save it to the variable called nam
        // netxLine() is a method of the Scanner class
        String name = keyboard.nextLine();

        // Check if the name is equal to "Tom" and print a message to the console
        // if (name.equalsIgnoreCase("Tom")) {
        //     System.out.println("Hello Tom! Welcome in!");
        // } else if (name.equalsIgnoreCase("Bob")) {
        //     System.out.println("Hello Bob! Welcome in!");
        // } else if (name.equalsIgnoreCase("Sally")) {
        //     System.out.println("Hello Sally! Welcome in!");
        // } else {
        //     System.out.println("Hello " + name + "! Nice to meet you.");
        // }

        // Logical Operators
        // && - and
        // || - or
        // ! - not

        // && - both conditions must be true
        // || - either condition must be true
        // ! - the condition must be false

        // if (condition && condition) {
        //     // code to run if the condition is true
        // }


        // if (condition || condition) {
        //     // code to run if the condition is true
        // }

        // if (!condition) {
        //     // code to run if the condition is true
        // }

        // Run the code above but use logical operators to check if the name is Tom or Bob
        // if (name.equalsIgnoreCase("Tom") || name.equalsIgnoreCase("Bob")) { // IF NAME IS TOM OR BOB
        //     System.out.println("Hello " + name + "! Welcome in!");
        // } else {
        //     System.out.println("Hello " + name + "! Nice to meet you.");
        // }


        // This doesn't check for sally though - how can we fix this?
        // if (name.equalsIgnoreCase("Tom") || name.equalsIgnoreCase("Bob") || name.equalsIgnoreCase("Sally")) { // IF NAME IS TOM OR BOB OR SALLY
        //     System.out.println("Hello " + name + "! Welcome in!");
        // } else {
        //     System.out.println("Hello " + name + "! Nice to meet you.");
        // }


        // Call in a scanner and collect user input for their age
        // Check if age is 21 and do not let the person in if they are not 21
        System.out.println("What is your age?");
        int age = keyboard.nextInt();

        // if (age >= 21) { // IF AGE IS GREATER THAN OR EQUAL TO 21
        //     System.out.println("You are old enough to enter!");
        // } else {
        //     System.out.println("You are not old enough to enter!");
        // }

        // This is good but ideally id like to add it to the previous if statement

        // A good example of a nested if statement

        if (name.equalsIgnoreCase("Tom") || name.equalsIgnoreCase("Bob") || name.equalsIgnoreCase("Sally")) { // IF NAME IS TOM OR BOB OR SALLY
            if (age >= 21) { // IF AGE IS GREATER THAN OR EQUAL TO 21
                System.out.println("Hey "+ name +", You are old enough to enter!");
            } else {
                System.out.println("Hey "+ name +",You are not old enough to enter!");
            }
        } else {
            System.out.println("Hello " + name + "! Nice to meet you. You got ratio bro?");
        }

        // if we wanted to check their name and age we could do this
        if (name.equalsIgnoreCase("Tom") || name.equalsIgnoreCase("Bob") || name.equalsIgnoreCase("Sally") && age >= 21) { // IF NAME IS TOM OR BOB OR SALLY
            System.out.println("You are old enough to enter!");
        } else {
            System.out.println("You are not old enough to enter!");
        }


    }
}
