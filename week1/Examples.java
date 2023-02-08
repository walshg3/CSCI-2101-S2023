package week1; // This is a package declaration
public class Examples { // This is a class declaration
    // In Java '//' is a comment
    // This is a comment

    public static void main(String[] args) { // This is the main method
        System.out.println("Hello World!"); // This is a statement
        // inside the statement is an expression (System.out.println)
        // "Hello World!" is a string literal -> Java Data Types
        System.out.println("This is our first Java program!");
        System.out.println(5); // This is an integer literal -> Java Data Types
        System.out.println(10 / 5); 

        // JAVA DATA TYPES
        // int, double, boolean, char, String
        // int -> integer | 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        // double -> decimal | 1.0, 2.0, 3.2, 4.1, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0
        // boolean -> true or false | think of this as yes or no / "THE FORK IN THE ROAD" (if statements)
        // char -> single character | 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' (think of this as a single letter) | note: char is in single quotes
        // String -> a sequence of characters | "a", "cat", "dog", "farm", "e", "f", "g", "h", "i", "j" (think of this as a word) | note: String is in double quotes

        // JAVA PRIMITIVE DATA TYPES
        // PRIMITIVE DATA TYPES ARE BUILT INTO JAVA
        // int, double, boolean, char
        // JAVA NON-PRIMITIVE DATA TYPES
        // NON-PRIMITIVE DATA TYPES ARE NOT BUILT INTO JAVA
        // String

        // JAVA OPERATORS
        // +, -, *, /, %, ++, --, +=, -=, *=, /=, %=, ==, !=, >, <, >=, <=, &&, ||, !  note: ! is the same as 'not'
        // JAVA KEYWORDS (P&PS1)
        // public, static, void, class, main, String, args, int, double, boolean, char, String, if, else, else if, 
        // switch, case, for, while, do, break, continue, return, package, import, new, this, try, 
        // catch, finally, throw, throws, extends, final, null, true, false
        // JAVA STATEMENTS
        // A statement is a complete line of code
        // A statement can be a declaration, an expression, or a block
        // A statement can be a single line or multiple lines
        // A statement can be a single statement or multiple statements

        // Examples of statements:
        // System.out.println("Hello World!");
        // System.out.println("This is our first Java program!");
        // Below are some examples of Variables (We will see this later)
        // int x = 5; 
        // int y = 10;
        // int z = x + y;
        // int a = 5, b = 10, c = a + b;
        // int x = 5; int y = 10; int z = x + y;
        // int x = 5; int y = 10; int z = x + y; int a = 5, b = 10, c = a + b;
        // int x = 5; int y = 10; int z = x + y; int a = 5, b = 10, c = a + b; 
        // int x = 5; int y = 10; int z = x + y; int a = 5, b = 10, c = a + b;  




        // JAVA EXPRESSIONS
        // An expression is a combination of variables, operators, and method invocations
        // Examples of expressions:
        // x = 5;
        // x + y;
        // x = y + 5;
        // x = y + 5 * 10;
        // x = (y + 5) * 10;
        // x = (y + 5) * 10 / 2;


        // JAVA VARIABLES
        // A variable is a named memory location
        // Examples of variables:
        System.out.println("Variables");
        // DATA-TYPE VARIABLE-NAME = VALUE/EXPRESSION;
        int x = 5; // x is a variable
        System.out.println(x);
        String Hello = "Hello World!"; // Saving a string to a variable called Hello | Saving to the filing cabinet
        System.out.println(Hello); // Retrieving the string from the variable called Hello | Retrieving from the filing cabinet (Morgan Freeman)
        double y = 10.5;
        System.out.println(y);
        System.out.println(x + y);



        // JAVA MATH EXAMPLES
        int a = 5;
        int b = 10;
        int c = a + b; // addition | declare c here because we are using it for the first time
        c = a - b; // subtraction  | Notice when we call c we don't have to re-declare it
        c = a * b; // multiplication
        c = a / b; // division
        c = a % b; // modulus
        c = a++; // increment
        c = a--; // decrement
        c = a += b; // addition assignment
        c = a -= b; // subtraction assignment
        c = a *= b; // multiplication assignment
        c = a /= b; // division assignment
        c = a %= b; // modulus assignment
        boolean d = a == b; // equal to
        d = a != b; // not equal to
        d = a > b; // greater than
        d = a < b; // less than
        d = a >= b; // greater than or equal to
        d = a <= b; // less than or equal to

        // JAVA SCOPE TYPES
        // Public -> Accessible from anywhere
        // Private -> Accessible only within the declared class
        // Protected -> Accessible within the declared class and subclasses (we won't be using this)


        // STRING CONCATENATION
        // String concatenation is the process of appending one string to the end of another string
        // Examples of string concatenation
        System.out.println("String Concatenation");
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(firstName + " " + lastName);

        String test1 = "3";
        System.out.println(test1);
        String test2 = "5";
        System.out.println(test2);
        System.out.println(test1 + test2); // String concatenation
        int test3 = 3;
        int test4 = 5;
        System.out.println(test3 + test4); // Addition
        System.out.println(test1 + test3); // String + int = String Concatenation

        // Example of String Concatenation with variables

        // Define my variables (Declare and Initialize)
        String name = "Greg"; // String
        int age = 26; // int
        String favcolor = "Black"; // String

        String testa = "Greg";
        String testb = "Jake";

        // testa = "null";

        // Print the variables with String Concatenation

        System.out.println("My name is " + name + " and I am " + age + " years old. My favorite color is " + favcolor + ".");

        name = "Tom";

        System.out.println("Second run:");
        System.out.println("My name is " + name + " and I am " + age + " years old. My favorite color is " + favcolor + ".");

        // Jordan Example
        System.out.println(test1 + test3 + test4 + test2);
        System.out.println((test1 + test2) + (test3 + test4)); //PEMDAS | (STRING + STRING) + (INT + INT)
        // when this gets printed it will print 35 because it will print the first two strings together and then the last two ints together
        // The entire thing will be printed as a string





















        // JAVA IDENTIFIERS
        // An identifier is a name used to identify a class, method, variable, or package
        // Examples of identifiers:




    }
}