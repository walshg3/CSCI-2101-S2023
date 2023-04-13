package week7;

import java.util.Scanner;

public class AdvancedArrays {

    //Given an Array of integers return true if 9 appears as first or last element of the array
    //firstLast9([1, 2, 9]) → true
    //firstLast9([1, 9, 9]) → true
    //firstLast9([1, 9, 9, 3, 8]) → false
    public static boolean firstLast9(int[] nums) {
        // this is the first way to do it
        // if(nums[0] == 9  || nums[nums.length-1] == 9) {
        //     return true;
        // }
        // return false;
        // if you have a return statement in an if statement you can just return the condition
        // assumes true otherwise false
        return nums[0] == 9 || nums[nums.length - 1] == 9;
    }

    // Given an int array if there is a 9 followed by a 1 and then another 1 return "The Police are on the way" otherwise return "All is good"
    // EX. [1, 9, 1, 1] → "The Police are on the way"
    // EX. [1, 9, 1, 1, 1] → "The Police are on the way"
    // EX. [1, 9, 1] → "All is good"
    public static String police(int[] nums) {
        // loop through the array
        // if you find a 9 check the next element
        // if the next element is a 1 check the next element
        // if the next element is a 1 return "The Police are on the way"
        // if you get to the end of the array and you haven't found a 9, 1, 1 return "All is good"
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                if (i + 1 < nums.length && nums[i + 1] == 1) {
                    if (i + 2 < nums.length && nums[i + 2] == 1) {
                        return "The Police are on the way";
                    }
                }
            }
        }
        return "All is good";
    }

    // Make a method to collect 10 numbers from the user
    // then return and array of those numbers
    public static int[] collect10() {
        // create an array of size 10
        // loop through the array
        // ask the user for a number
        // store the number in the array
        // return the array
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number:");
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        return numbers;

    }




    public static void main(String[] args) {
        System.out.println("Hello AdvancedArrays!");
        // if you initialize an array in methods parameters you have to create it as such
        // new int[]{1, 2, 9}

        System.out.println(firstLast9(new int[]{1, 2, 9}));

        // second way is to create the array first and then pass the array into the method as a parameter
        int[] nums = {1, 2, 8};
        System.out.println(firstLast9(nums));

        System.out.println(police(new int[]{1, 9, 1}));
        int[] out = collect10();
        for (int i = 0; i < out.length; i++) {
            System.out.println(out[i]);
        }

    }
}
