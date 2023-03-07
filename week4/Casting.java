package week4;

public class Casting {
    /*
     * Java Casting
     * Implicit vs Explicit Casting
     */

     public static void main(String[] args) {
        System.out.println("Start of Casting Playground!");
        // Implicit Casting
        // When you assign a value of a smaller data type to a larger data type
        // byte -> short -> int -> long -> float -> double
        // Java automatically converts the smaller data type to the larger data type
        int myInt= 5;
        System.err.println(myInt);
        double myDouble = myInt; // Implicit Casting: int to double
        System.out.println(myDouble);
        // Explicit Casting
        // When you assign a value of a larger data type to a smaller data type
        // double -> float -> long -> int -> short -> byte
        // Java does not automatically convert the larger data type to the smaller data type
        // You must use a cast operator
        // Explicit casting acts sort of like Math.floor()
        double myDouble2 = 5.9;
        System.out.println(myDouble2);
        int myInt2 = (int) myDouble2; // Explicit Casting: double to int
        System.out.println(myInt2);

        


     }
}
