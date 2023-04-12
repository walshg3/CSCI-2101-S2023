package week6;

public class hardLoops {


    // Given a non-empty String and an int N, return the string made starting with char 0, and then every Nth char of the String. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
    // everyNth("Miracle", 2) → "Mrce"  
    // everyNth("abcdefg", 2) → "aceg"
    // everyNth("abcdefg", 3) → "adg"
    public static String everyNth(String str, int n) {
        String result = "";
        for (int i = 0; i < str.length(); i += n) { // can also be written as i = i + n
            // 0 = 0 + 2 i = 2
            // 2 = 2 + 2 i = 4
            // 4 = 4 + 2 i = 6
            result += str.charAt(i);
        }
        return result;
    }

    // Given a string create a new string that will move the first char to the end of the following 2 chars.
    // EX. 
    // oneTwo("abc") → "bca"
    // oneTwo("tca") → "cat"
    // oneTwo("tcagdo") → "catdog"
    // oneTwo("chocolat") → "hocolatc"
    public static String oneTwo(String str) {
        String result = ""; // temp variable to hold the result
        for (int i = 0; i < str.length() - 2; i += 3) {
            result += str.substring(i + 1, i + 3) + str.charAt(i);
        }
        return result;
    }

    // Create a method that will check if a string is a palindrome
    // A palindrome is a word that is spelled the same forwards and backwards
    // Ex.
    // isPalindrome("racecar") → true
    // isPalindrome("hello") → false
    // isPalindrome("level") → true
    public static boolean isPalindrome(String str) {
        boolean result = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) { // this is an example of using a pointer both forward and backwards
                result = false;
            }
        }
        return result;
    }


    // Create the palindrome method using a while loop
    public static boolean isPalindromeWhile(String str) {
        boolean result = true;
        int i = 0; // pointer that will start at the beginning of the string
        int j = str.length() - 1; // pointer that will start at the end of the string
        while (i < j / 2) {
            if (str.charAt(i) != str.charAt(j - i)) {
                result = false;
            }
            i++;
            j--;
        }
        return result;
    }

    // Create a method that will count the number of times 'xx' appears in a string then return the number of times it appears
    // Ex.
    // countXX("abcxx") → 1
    // countXX("xxx") → 2
    // countXX("xxxx") → 3
    public static int countXX(String str) {
        int result = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') { // there is 2 points the pointer is at so we need to check both
                // i = 0, i + 1 = 1
                result++;
            }
        }
        return result;
    }

    // Create the same method but use substring and equalsignorecase
    public static int countXX2(String str) {
        int result = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equalsIgnoreCase("xx")) { // this is an example of overloaded methods
                result++;
            }
        }
        return result;
    }






    public static void main(String[] args) {
        // System.out.println("Hello World");
        // System.out.println(everyNth("Miracle", 2));
        // System.out.println(oneTwo("tcagdo"));
        // System.out.println(isPalindrome("racecar"));
        // System.out.println(isPalindromeWhile("racecar"));

        System.out.println(countXX("axxbxxcxx"));



    }
}
