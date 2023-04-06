package week6;

import java.util.Scanner;

public class ForNested {
    // Nested For Loops
    // create a method that will print a triangle of stars
    // *
    // **
    // ***
    // ****
    // *****
    // ****
    // ***
    // **
    // *
    // this should use a for loop
    public static void printTriangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Create a method that will use a nested for loop to make a output in a matrix
    // This would something similar to this:
    // *****
    // *****
    // *****
    // *****
    // *****
    // We will want to collect the rows and columns from the user
    // We will also want to collect the Symbol to use from the user
    // Outer for loop is for the rows
    // Inner for loop is for the columns
    public static void printMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = sc.nextInt();
        System.out.println("Enter the symbol to use: ");
        String symbol = sc.next();
        System.out.println("The matrix is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        System.out.println("Hello World");
        // printTriangle();
        printMatrix();
    }
}
