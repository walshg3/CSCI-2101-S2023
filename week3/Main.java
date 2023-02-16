package week3;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Create a new instance of the Person class
        System.out.println("Person 1");
        Person person1 = new Person("Appa Walsh", 10, 5.0, 100.0, 1234567890);
        System.out.println("Person 1's Phone number is " + person1.phoneNumber);
        person1.printPerson();
        System.out.println();
        System.out.println("Person 2");
        Person person2 = new Person("Momo Walsh", 5, 3.0, 50.0, 1234567890);
        person2.printPerson();

        System.out.println("Person 1's name is: " + person1.getName());

        System.out.println();

        Person person3 = new Person("Korra Walsh");
        System.out.println("Person 3's name is: " + person3.getName());

        System.out.println();
        person3.setAge(13);
        System.out.println("Person 3's age is: " + person3.getAge());

        Person person4 = new Person("Bolin Walsh", 15);

        System.out.println("Person 4's name is: " + person4.getName());
        System.out.println("Person 4's age is: " + person4.getAge());

        // Becasue phoneNumber is public, we can access it directly
        System.out.println("Person 4's phone number is: " + person4.phoneNumber);
        // notice how phoneNumber is 0, because we didn't set it in the constructor
        // we have 2 options on how to set the phone number
        // 1. we can set it directly
        person4.phoneNumber = 1234567890;
        System.out.println("Person 4's phone number is: " + person4.phoneNumber);
        // notice we dont need a getter for the public variable phoneNumber
        // 2. we can use the setter method
        person4.setPhoneNumber(8675309);
        System.out.println("Person 4's phone number is now: " + person4.phoneNumber);

        // main difference between public and private
        // public - accessible anywhere
        // private - accessible only in the class
        // public variables can be accessed directly
        // private variables can only be accessed through getter and setter methods


        String threeletter = person1.getFirst3Letters();
        System.out.println("Person 1's first 3 letters are: " + threeletter);

        String person1initals = person1.getInitials();
        System.out.println(person1initals);

        String person2initals = person2.getInitials();
        System.out.println(person2initals);

        String person3initals = person3.getInitials();
        System.out.println(person3initals);

        //Appa Walsh
        //0123456789 -> computer
        //12345678910 -> human

        System.out.println("Person 1's Char at 5 is: " + person1.getCharAtIndex(5));
        System.out.println("Person 1's First and Last letters are: " + person1.getFirstAndLast());



    }
}