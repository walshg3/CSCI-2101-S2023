package week2;

public class Playground {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Recap on making variables
        // DATA-TYPE VARIABLE-NAME = VALUE/EXPRESSION;
        // String Concatenation
        String s = "Hello";
        String exlam = "!";
        System.out.println(s);
        System.out.println("Hello" + "!");
        System.out.println(s + "!");
        System.out.println(s + exlam);
        String y = "world";
        System.out.println(y + exlam);
        System.out.println(s + " " + y + exlam);
        String name = "Greg";
        String name2 = "Tom";
        String name3 = "Jake";
        String name4 = "Bob";
        String name5 = "Sally";
        name2 = name2 + "!";

        addExclamationPoint(name2);
        System.out.println(addQuestionMark(name2));
        // Call the addExclamationPoint method
        addExclamationPoint(name);
        System.out.println(addQuestionMark(name));

        String answer = addQuestionMark(name3);
        System.out.println(answer);
        String questionexlam = addDollarSign(answer);
        System.out.println(questionexlam);

    }

    // Create a method to add an exclamation point to a string
    // SCOPE, static/non-static, return type, method name, parameters
    public static void addExclamationPoint(String x) {
        // System.out.println(x + "!");
        x = x + "!";
        System.out.println(x);
        // return s + "!";
    }

    // Create a method that adds a question mark to a string
    // SCOPE, static/non-static, return type, method name, parameters
    // This time show with a return type
    public static String addQuestionMark(String x) {
        x = x + "?";
        return x;
        // return x + "?";
    }


    // Create a method that adds a $ to a string
    // SCOPE, static/non-static, return type, method name, parameters
    // This time show with a return type
    public static String addDollarSign(String x) {
        x = x + "$";
        return x;
        // return x + "?";
    }


}
