package week8;

public class TwoDArray {
    public static void main(String[] args) {
        System.out.println("Hello TwoDArray!");
        // 2D array is an array of arrays
        // {1, 2, 3} is an array
        // {{1, 2, 3}, {4, 5, 6}} is a 2D array

        // q: What is a two dimensional array?
        // a: An array of arrays

        // q: How do you create a two dimensional array?
        int[][] twoD = new int[3][3];
        // [0, 0, 0]
        // [0, 0, 0]
        // [0, 0, 0]
        // [[0, 0, 0], [0, 0, 0], [0, 0, 0]]

        // The first set of brackets is the row
        // The second set of brackets is the column
        
        // q: How do you access an element in a two dimensional array?
        // a: twoD[row][column]
        twoD[0][0] = 1;
        // [1, 0, 0]
        // [0, 0, 0]
        // [0, 0, 0]
        twoD[0][1] = 2;
        // [1, 2, 0]
        // [0, 0, 0]
        // [0, 0, 0]
        twoD[2][2] = 9;
        // [1, 2, 0]
        // [0, 0, 0]
        // [0, 0, 9]
        System.out.println(twoD.length); // this will get the number of rows
        System.out.println(twoD[0].length); // this will get the number of columns

        // q: How do you loop through a two dimensional array?
        // a: nested for loops
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.println("row: " + i + " column: " + j + " value: " + twoD[i][j]);
            }
        }

        // q: How do we print the elemts in a two dimensional array using a for each loop?
        // a: nested for each loops
        for (int[] row : twoD) {
            for (int number : row) {
                System.out.println("number: " + number);
            }
        }

        // Lets show an example with Clothing and get the total counts of the clothes for each brand
        // Arrays can have 2 dimensions
        int BRANDS = 7;
        int TYPES = 3;
        // ROW X COLUMN
        // All values are init with 0 by default
        // If the Array is a String array, all values are init with null
        int[][] sales = new int[BRANDS][TYPES];
        // [0, 0, 0]
        // [0, 0, 0]
        // [0, 0, 0]
        // [0, 0, 0]
        // [0, 0, 0]
        // [0, 0, 0]
        // [0, 0, 0]

        // Lets add some brands in an array
        String[] brands = {"Nike", "Adidas", "Puma", "Under Armour", "Reebok", "New Balance", "Asics"};

        // we can create 2D arrays using the row column format
        int[][] counts = {
        // Shirt Pants Jackets
            { 2, 4, 3 },
            { 3, 2, 1 },
            { 1, 2, 3 },
            { 2, 3, 1 },
            { 3, 1, 2 },
            { 1, 3, 2 },
            { 2, 1, 3 } 
        };

        // to access all the elements of the 2D array you use a nested for loop
        for (int i = 0; i < counts.length; i++) {
            for (int j = 0; j < counts[i].length; j++) {
                // process the jth element in the ith row
                // System.out.println("row: " + i + " column: " + j + " value: " + counts[i][j]);
                System.out.printf("%8d", counts[i][j]);
                // System.out.println("Brand: " + brands[i] + " Type: " + counts[i][j]);
            }
            System.out.println();
        }
        // notice the printf method
        // %8d means print an integer with 8 spaces
        // %8s means print a string with 8 spaces
        System.out.println("------------------------------------------");
        
        // Lets try to print the brands and the number of shirts they have 
        // Nike 2
        // Adidas 3
        // Puma 1
        // Under Armour 2
        // Reebok 3
        // New Balance 1
        // Asics 2
        for (int i = 0; i < counts.length; i++) {
            System.out.printf("%-15s", brands[i]);
            System.out.printf("%8d", counts[i][0]);
            System.out.println();
        }

        // Lets print a pretty grid output
        System.out.println("               Brand         Shirt    Pant    Jacket     Total");
        System.out.println("-----------------------------------------------------------------");
        // Create a nested for loop to print the brands and the number of shirts they have 
        // This is adding the totals of each row
        for(int i = 0; i < BRANDS; i++){
            // q: what does the s do in printf
            // a: %s is a placeholder for a string
            // q: what does the d do in printf
            // a: %d is a placeholder for a decimal
            System.out.printf("%20s", brands[i]);
            int total = 0;
            
            for(int j = 0; j < TYPES; j++){        // ROW X COLUMN
                System.out.printf("%10d", counts[i][j]);
                total += counts[i][j];
            }
            System.out.printf("%10d", total);
            System.out.println();
        }

        


    }
}
