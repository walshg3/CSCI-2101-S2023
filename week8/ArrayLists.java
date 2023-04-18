package week8;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;


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





    }
}
