// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        // Extract digits
        int hundreds = n / 100;
        int tens = (n / 10) % 10;
        int ones = n % 10;
        
        // Calculate the sum of cubes of digits
        int armstrongSum = (int) (Math.pow(hundreds, 3) + Math.pow(tens, 3) + Math.pow(ones, 3));
        
        // Check if the sum is equal to the original number
        return armstrongSum == n;
    }

    public static void main(String[] args) {
        int[] testCases = {153, 372, 100};
        
        // Check for each test case
        for (int n : testCases) {
            System.out.println("Is " + n + " an Armstrong number? " + armstrongNumber(n));
        }
    }
}