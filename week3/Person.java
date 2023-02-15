package week3;

public class Person {
    /*
     * Create a class called Person with the following private fields:
     * name, age, height, weight
     * 
     * Create a constructor that takes in all of the fields as parameters
     *  and sets them to the private fields.
     * 
     * Create a method called printPerson that prints out the person's
     * name, age, height, and weight.
     * 
     * this file is called the Person.java file
     * it represents the blueprint for the Person class
     * 
     * the Main.java file is the file that will be used to test the Person class
     * 
     */

    private String name; // private means that the field can only be accessed in this class
    // when you see the word 'this' it refers to the current instance of the class
    private int age;
    private double height;
    private double weight;
    public int phoneNumber;

    public Person(String name, int age, double height, double weight, int phoneNumber)  {
    // parameters go inside the parentheses of the constructor
        /* 
         * this is the constructor
         * it is used to create a new instance of the Person class
         * it is called when you use the 'new' keyword
         */
        // this.name refers to the name field in the Person class
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.phoneNumber = phoneNumber;

    }
    // Create another constructor that takes in only the name
    public Person(String name) {
        this.name = name;
    }

    // Create another constructor that takes in only the name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printPerson() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Height: " + this.height);
        System.out.println("Weight: " + this.weight);
        System.out.println("Phone Number: " + this.phoneNumber);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    // Create a method that get the first 3 letters of the name
    // and returns it as a String
    // Hello
    // 12345 -> human
    // 01234 -> computer
    // ie computer starts counting at 0
    public String getFirst3Letters() {
        return this.name.substring(0, 3);
    }

    
}
