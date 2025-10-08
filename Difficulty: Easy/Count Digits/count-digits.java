// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int original = n;
        int count = 0;

        while (n > 0) {
            int digit = n % 10;  // Get the last digit
            if (digit != 0 && original % digit == 0) {
                count++;
            }
            n = n / 10;  // Remove the last digit
        }

        return count;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(evenlyDivides(12));   // Output: 2
        System.out.println(evenlyDivides(2446)); // Output: 1
        System.out.println(evenlyDivides(23));   // Output: 0
        System.out.println(evenlyDivides(101));  // Output: 2 (1 and 1 divide 101, 0 is ignored)
    }
}