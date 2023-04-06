package week6;

import java.util.Scanner;

public class WhileLoop {


    // create a method that will average a user input of numbers
    // this should use a for loop
    public static void sumUserInput() {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            int userInput = sc.nextInt();
            sum += userInput;
        }
        System.out.println("The sum is: " + sum);
    }

    // method that will average a user input of numbers using a while loop
    public static void sumUserInputWhile() {
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        // while (condition)
        System.out.println("Enter a numner, q to quit: ");
        while (sc.hasNextDouble()) {
            System.out.println("Enter a number: ");
            int userInput = sc.nextInt();
            sum += userInput;
        }
        System.out.println("The sum is: " + sum);
    }

    public static void checkDup(){
        // check if a duplicate number has been entered. If so, break out of the loop and display the number
        // no negative numbers
        double previous; 
        double current = -1; // this is a sentinel value
        // q: what is a sentinel value?
        // a: a value that is used to indicate the end of a loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number, q to quit: ");
        while (sc.hasNextDouble()) {
            previous = current;
            System.out.println("Enter a number, q to quit: ");
            current = sc.nextDouble();
            if (previous == current) {
                System.out.println("Duplicate number found: " + current);
                break;
            }
        }
    }

    // make a method that will collect a String input from the user and check if the pill is blue or red.
    // If the pill is red the program will say "Welcome to the Matrix"
    // If the pill is blue the program will prompt the user again for their choice

    public static void redPillBluePill(){
        Scanner scan = new Scanner(System.in);
        System.out.println("You have two pills in front of you. One is red, the other is blue. Which do you take?");
        String pill = scan.nextLine();
        // while (pill.equals("red") || pill.equals("blue")) {
        //     if (pill.equals("red")) {
        //         System.out.println("Welcome to the Matrix");
        //         break;
        //     } else if (pill.equals("blue")) {
        //         System.out.println("You have two pills in front of you. One is red, the other is blue. Which do you take?");
        //         pill = scan.nextLine();
        //     }
        // }
        while (!pill.equalsIgnoreCase("red")){
            System.out.println("You have two pills in front of you. One is red, the other is blue. Which do you take?");
            pill = scan.nextLine();
        }
        System.out.println("Welcome to the Matrix");
    }



    public static void main(String[] args) {
        System.out.println("Hello World");
        // sumUserInput();
        // sumUserInputWhile();
        // checkDup();
        redPillBluePill();
    }
    
}
