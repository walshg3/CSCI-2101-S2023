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
        // wait 5 seconds before printing the name

        System.out.println("Hello " + name);

        // int age = keyboard.nextInt();



        
    
    }
}
