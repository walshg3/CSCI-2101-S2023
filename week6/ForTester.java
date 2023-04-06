package week6;
import java.util.Scanner;

public class ForTester {
    /*
     * 
     * For Loops in JAVA
     * 
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
        // for (initialization; condition; update/increment/decrement)
        for (int i = 0; i < 10; i++) {
            // System.out.println("i = " + i);
        }
        System.out.println("===========");
        int students = 22;

        for (int i = 0; i < students; i++) {
            int outStudent = i+1;
            // System.out.println("Hello, Welcome in Student: " + outStudent);
        }

        System.out.println("===========");

        String s = "The quick brown fox jumps over the lazy dogt";

        System.out.println(s.length());
        System.out.println(s.charAt(0));

        // if (s.charAt(43) == 'T') {
        //     System.out.println("Found T");
        // }

        printIfFound(s, 'T');
        // printIfFound(s, 't');
        System.out.println(printIfFound(s, 't'));
        // countIfFound(s, 't');
        System.out.println(countIfFound(s, 't'));
        sumUserInput();

    }
    
    // Create a method that will loop through a string and print if it finds a specific character
    // printIfFound(s, 'T');
    public static String printIfFound(String s, char c) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                System.out.println("Found " + c + " at index " + i);
                break; // this will stop the loop
            }
        }
        return "Done";
    }

    // Create a method that will loop through a string and count how many times a specific character is found
    // countIfFound(s, 'T');
    public static int countIfFound(String s, char c) {
        int count = 0; // this is a local variable outside of the for loop so it will not reset
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    // Create a method that will collect user input and output a running total of the numbers entered
    // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    // 1, 3, 6, 10, 15, 21, 28, 36, 45, 55
    public static void sumUserInput(){
        // Add scanner to collect user input
        Scanner keyboard = new Scanner(System.in);
        // init a counter to 0
        int counter = 0;
        // loop through 10 times
        for (int i = 0; i < 10; i++) {
            // ask the user for a number
            System.out.println("Enter a number: ");
            // collect the number
            int num = keyboard.nextInt();
            // add the number to the counter
            counter += num; // counter = counter + num;
            // print the counter
            System.out.println(counter);
        }
    }
    // Next week we will learn about Nested Loops
    // Nested Loops are loops inside of loops
    // for (int i = 0; i < 10; i++) {
    //     for (int j = 0; j < 10; j++) {
    //         System.out.println("i = " + i + " j = " + j);
    //     }
}
