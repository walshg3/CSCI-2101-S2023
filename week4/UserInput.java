package week4;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        String name = "Tom";
        System.out.println("Hello World");

        /*
         * Collecting user input from the console
         * 
         */
        // Create a Scanner Object (an instance of the Scanner Class called keyboard)
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        // Collect the user input and save it to the variable called nam
        // netxLine() is a method of the Scanner class
        name = keyboard.nextLine();


        System.out.println("Hello " + name);

        System.out.println("How old are you?");

        int age = keyboard.nextInt();

        System.out.println("You are " + age + " years old");

        System.out.println("How tall are you? (feet)");

        double height = keyboard.nextDouble();

        System.out.println("You are " + height + " feet tall");

        keyboard.close();

    }
}
