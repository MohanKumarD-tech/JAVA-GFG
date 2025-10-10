// User function Template for Java

class Solution {
    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        String s = Integer.toString(num);
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    static boolean isDigitSumPalindrome(int n) {
        int sum = 0;
        while (n > 0) { sum += n % 10; n /= 10; }
        return isPalindrome(sum);
    }

    public static void main(String[] args) {
        System.out.println(isDigitSumPalindrome(56));  // true
        System.out.println(isDigitSumPalindrome(98));  // false
    }
}
