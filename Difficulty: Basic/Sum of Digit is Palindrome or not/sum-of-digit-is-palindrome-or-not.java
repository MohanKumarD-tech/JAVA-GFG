// User function Template for Java

class Solution {
    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        // Convert the number to a string and compare with its reverse
        String numStr = Integer.toString(num);
        String reversedStr = new StringBuilder(numStr).reverse().toString();
        return numStr.equals(reversedStr);
    }

    // Function to check if the sum of digits of n is a palindrome
    public static boolean isDigitSumPalindrome(int n) {
        // Calculate the sum of digits
        int digitSum = 0;
        while (n > 0) {
            digitSum += n % 10;
            n /= 10;
        }

        // Check if the sum of digits is a palindrome
        return isPalindrome(digitSum);
    }

    public static void main(String[] args) {
        // Test cases
        int n1 = 56; // Expected: true (5 + 6 = 11, and 11 is a palindrome)
        int n2 = 98; // Expected: false (9 + 8 = 17, and 17 is not a palindrome)

        // Output the results
        System.out.println(isDigitSumPalindrome(n1));  // true
        System.out.println(isDigitSumPalindrome(n2));  // false
    }
}
