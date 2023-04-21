package week8;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Random;

import week5.BankAccount;


public class ArrayLists {
    public static void main(String[] args) {
        System.out.println("Hello ArrayLists!");
        // ArrayLists are a type of collection
        // ArrayLists are used to store multiple valuies in a signle variable
        // ArrayLists are Dynamic in size, they can grow and shrink as needed
        // Array -> fixed size -> int[] antArray = new intp[10];
        // For Example when we look at a phone number we see 10 digits
        // ArrayList -> dynamic size -> ArrayList<Integer> antArray = new ArrayList<Integer>();
        // Arrays are good for storing data of the same type
        // Arraylists are good for storing data of different types and the same types
        // ArrayLists can be expanded or contracted as needed
        // How to make an ArrayList
        // ArrayList<Type> name = new ArrayList<Type>();

        ArrayList<String> cars = new ArrayList<String>();
        // This will contain a list of cars with an initial size of 10
        // ArrayLists are indexed starting at 0

        // How do we add values to an ArrayList?
        // name.add(value);
        cars.add("Volvo");
        cars.add("Mazda");
        cars.add("Ford");
        cars.add("BMW");
        

        // How do we print an ArrayList?
        System.out.println(cars);

        // How do we get the length of an ArrayList?
        System.out.println("Size of the cars ArrayList: "+cars.size());

        // How do we get a specific index of an ArrayList?
        // get() method
        System.out.println("The first car in the list is: "  + cars.get(0));
        System.out.println("The second car in the list is: " + cars.get(1));
        System.out.println("The third car in the list is: "  + cars.get(2));
        System.out.println("The fourth car in the list is: " + cars.get(3));
        
        // How do we remove a value from an ArrayList?
        // remove() method
        cars.remove(0);
        System.out.println(cars);
        System.out.println("Size of the cars ArrayList: "+cars.size());

        // How do we make ArrayLists of different types?
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers);
        // Notice the ArrayList is of type Integer
        // Notice the <Integer> instad of 'int'
        // This is because ArrayLists can only hold objects
        // int -> Primitive data type
        // Integer -> Object data type
        // Interger is a wrapper class for the primitive data type int
        
        // Examples with other data types
        // int -> Integer
        // double -> Double
        // boolean -> Boolean
        // char -> Character
        // float -> Float
        // long -> Long
        // short -> Short
        // byte -> Byte

        ArrayList<Character> chara = new ArrayList<Character>();
        chara.add('a');
        chara.add('b');
        chara.add('c');
        chara.add('d');
        chara.add('e');
        System.out.println(chara);

        ArrayList<Boolean> bool = new ArrayList<Boolean>();
        bool.add(true);
        bool.add(false);
        bool.add(true);
        bool.add(false);
        bool.add(true);
        System.out.println(bool);

        // Add the Volvo car back to the ArrayList
        cars.add("Volvo");

        // Sort the ArrayList
        System.out.println("Before: "+ cars);
        Collections.sort(cars);
        System.out.println("After: "+ cars);

        // we imported the bank account class and can create a bank account object like we are used to.

        BankAccount test = new BankAccount("Test", 1000);

        System.out.println(test.getssn());

        // We know ArrayLists can only hold objects
        // We can create an ArrayList of objects
        // We know the BankAccount Object was just made above
        // So maybe we can add objects into ArrayLists in the form of Bank Accounts

        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();

        System.out.println(accounts);

        accounts.add(test);

        System.out.println(accounts);

        // notice the output is @1e4e1c which is the memory address of the object

        // We can also create a new object and add it to the ArrayList
        // Lets add more accounts to the ArrayList
        accounts.add(new BankAccount("Josh", 1000, 10000, 867540, "10/25/1996"));
        accounts.add(new BankAccount("John", 1000, 5000, 867540, "10/25/1996"));
        accounts.add(new BankAccount("Jill", 1000, 6000, 867540, "10/25/1996"));
        accounts.add(new BankAccount("Jack", 1000, 7000, 867540, "10/25/1996"));
        accounts.add(new BankAccount("Jane", 1000, 8000, 867540, "10/25/1996"));

        

        System.out.println(accounts);
        
        // Get one specific account from the ArrayList
        System.out.println(accounts.get(0));
        // Print the name of the 2st index of the ArrayList
        // In order to do this we need to use the getName() method from the BankAccount class
        // Notice we use the .get method to get the index of the ArrayList and then we use the .getName() method to get the name of the account
        System.out.println(accounts.get(1).getName());

        // How do we loop through an ArrayList?
        // We can use a for loop
        // We can use a for each loop
        // We can use a while loop

        // For Loop
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println(accounts.get(i).getName());
        }

        // For Each Loop
        for (BankAccount account : accounts) {
            System.out.println(account.getbalance());
        }

        // While Loop
        int i = 0;
        while (i < accounts.size()) {
            accounts.get(i).deposit(100);
            i++;
        }

        System.out.println("After the while loop: ");
        for (BankAccount account : accounts) {
            System.out.println(account.getbalance());
        }

        System.out.println(highestBalance(accounts));
        System.out.println(lowestBalance(accounts));

        System.out.println(generateRandomBinary());

        applyMonthlyFee(accounts);





    }

    // Create a method that will take in an ArrayList of BankAccounts and return the name of the account with the highest balance
    public static String highestBalance(ArrayList<BankAccount> accounts) {
        // We need to create a variable to hold the highest balance
        double highestBalance = 0;
        // We need to create a variable to hold the name of the account with the highest balance
        String highestBalanceName = "";
        // We need to loop through the ArrayList
        for (BankAccount account : accounts) {
            // We need to check if the balance of the current account is greater than the highest balance
            if (account.getbalance() > highestBalance) {
                // If it is we need to update the highest balance
                highestBalance = account.getbalance();
                // We also need to update the name of the account with the highest balance
                highestBalanceName = account.getName();
            }
        }
        // We need to return the name of the account with the highest balance
        return highestBalanceName;
    }

    // Create a method that will take in an ArrayList of BankAccounts and return the name of the account with the lowest balance
    public static String lowestBalance(ArrayList<BankAccount> accounts) {
        // We need to create a variable to hold the lowest balance
        double lowestBalance = 100000000;
        // We need to create a variable to hold the name of the account with the lowest balance
        String lowestBalanceName = "";
        // We need to loop through the ArrayList
        for (BankAccount account : accounts) {
            // We need to check if the balance of the current account is less than the lowest balance
            if (account.getbalance() < lowestBalance) {
                // If it is we need to update the lowest balance
                lowestBalance = account.getbalance();
                // We also need to update the name of the account with the lowest balance
                lowestBalanceName = account.getName();
            }
        }
        // We need to return the name of the account with the lowest balance
        return "Lowest account " + lowestBalanceName;
    }

    // This is really helpful for project 3
    // Create an Array list that generates a 1 or 0 randomly and adds it to an ArrayList
    public static ArrayList<Integer> generateRandomBinary() {
        // Create an ArrayList of type Integer
        ArrayList<Integer> binary = new ArrayList<Integer>();
        // Create a random object
        Random rand = new Random();
        // Loop 10 times
        for (int i = 0; i < 10; i++) {
            // Generate a random number between 0 and 1
            int randomNum = rand.nextInt(2);
            // with the Math.Random Class
            // int randomNum = (int) (Math.random() * 2);
            // Add the random number to the ArrayList
            binary.add(randomNum);
        }
        // Return the ArrayList
        return binary;
    }

    // Create a method that will take in an ArrayList of BankAccounts and apply the monthly fee method and print the name of the account and the new balance
    public static void applyMonthlyFee(ArrayList<BankAccount> accounts) {
        // Loop through the ArrayList
        for (BankAccount account : accounts) {
            System.out.println("Account name: "+ account.getName() + "\nAccount Balance: " + account.getbalance());
            // Apply the monthly fee method
            account.monthlyFee(20);
            // Print the name of the account and the new balance
            System.out.println("Account name: "+ account.getName() + "\nAccount Balance after Monthly Fee: " + account.getbalance());
        }
    }


}
