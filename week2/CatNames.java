package week2;
public class CatNames {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        // How do I access the cat names from the Access class?
        // Create an object of the Access class
        //CLASS NAME OBJECT NAME = new CLASS NAME();
        Access a = new Access();
        // Here we made an object of the Access class
        // We can now call the variables and methods from the Access class
        // we call it by using the object name and the dot operator
        // Call the cat names from the Access class
        // We can call cat3 because it is a public variable
        System.out.println(a.cat3);
        // Notice how we can't access the private variables
        // System.out.println(a.cat1);

        // Call the getter methods
        String out = a.getCat1();
        System.out.println(out);
        System.out.println(a.getCat1());

        // Call the setter methods
        System.out.println("Before: " + a.getCat1());
        a.setCat1("Alice");
        System.out.println("After: " + a.getCat1());


        Playground b = new Playground();
        System.out.println(b.addQuestionMark(out));
    }
}
