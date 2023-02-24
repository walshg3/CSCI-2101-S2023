package week4;

public class MathPlayground {
    /*
     * Java has a Math class that has many useful methods
     * 
     */

     public static void main(String[] args) {
        System.out.println("Start of Math Playground!");
        int x = 5;
        int y = 10;
        int z = x + y; // 5 + 10
        System.out.println(z);
        z = x - y; // 5 - 10    
        System.out.println(z);
        double a = 5.1;
        // Math round function
        System.out.println(Math.round(a)); // 5.1 -> 5
        System.out.println(Math.ceil(a)); // 5.1 -> 6.0
        System.out.println(Math.floor(a));
        System.out.println(Math.max(x, y));
        System.out.println(Math.min(x, y));
        // Math random function
        System.out.println(Math.random()); // 0.0 -> 1.0
        // Math random function with a range
        int randomNumber = (int) (Math.random() * 10) + 1;
        System.out.println(randomNumber);
        // q: what is (int) in the example above?
        // a: (int) is a cast operator
        // q: what does the cast operator do?
        // a: it converts the data type of the value on the right to the data type on the left
     }
}
