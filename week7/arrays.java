package week7;

import java.util.Scanner;

public class arrays {
    // Arrays are a data structure that can hold multiple values of the same type
    // Arrays are indexed starting at 0
    // Arrays are fixed in size, once created they cannot be resized
    // Arrays are created using the new keyword
    // Arrays are created with a length
    // Arrays are created with a type
    // Arrays are created with a name
    public static void main(String[] args) {
        System.out.println("Hello arrays!");

        // How to create an array
        // Type[] name = new Type[length];
        int[] numbers = new int[5];
        // an array called numbers that holds 5 integers
        // [0, 0, 0, 0, 0]
        // view the first element in the array
        System.out.println(numbers[0]);
        // change the first element in the array
        numbers[0] = 1;
        System.out.println(numbers[0]);
        // [1, 0, 0, 0, 0]
        // change the second element in the array
        numbers[1] = 2;
        System.out.println(numbers[1]);
        // [1, 2, 0, 0, 0]
        numbers[4] = 6;
        System.out.println(numbers[4]);
        // [1, 2, 0, 0, 6]

        // Get the length of the array
        System.out.println(numbers.length);

        // Loop through the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("index: "+ i+ " value: " + numbers[i]);
        }

        // for each loop
        // for (type name : array) 
        for (int number : numbers) {
            System.out.println("number: " + number);
        }

        // Create an array of strings
        String[] names = new String[20];
        names[0] = "Bob";
        names[1] = "Sally";
        names[2] = "Joe";
        // [Bob, Sally, Joe]
        // initialize an array with values
        // Type[] name = {value1, value2, value3};
        String[] names2 = {"Bob", "Sally", "Joe"};
        System.out.println(names2.length);

        // for each loop iterating over names array
        // for (String name : names) {
        //     System.out.println("name: " + name);
        // }

        // create an array given a scanner input of size
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many names would you like to enter?");
        int size = scanner.nextInt();
        String[] names3 = new String[size];
        for (int i = 0; i < names3.length; i++) {
            System.out.println("Enter a name:");
            names3[i] = scanner.next();
        }
        for (String name : names3) {
            System.out.println("name: " + name);
        }

        System.out.println("look here:" + names[5-3]);

        System.out.println("Enter a name to search for:");
        String searchName = scanner.next();
        boolean found = false;
        for (String name : names3) {
            if (name.equals(searchName)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Found " + searchName);
        } else {
            System.out.println("Did not find " + searchName);
        }

        // print the names3 array in a format that looks like this [Bob, Sally, Joe]
        // Notice how ugly this is
        System.out.print("[");
        for (int i = 0; i < names3.length; i++) {
            System.out.print(names3[i]);
            if (i < names3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Char arrays
        char[] letters = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(letters[0]);

        String str = "Hello";
        char[] letters2 = str.toCharArray();
        // "Hello" -> [H, e, l, l, o]
        System.out.println(letters2[0]);
        letters2[0] = 'J';
        for (char letter : letters2) {
            System.out.println(letter);
        }



    }
}
