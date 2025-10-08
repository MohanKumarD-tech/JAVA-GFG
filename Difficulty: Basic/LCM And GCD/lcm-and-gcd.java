class Solution {
    
    // Method to compute GCD using Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to compute LCM using the relationship with GCD
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    
    public static int[] lcmAndGcd(int a, int b) {
        int gcdValue = gcd(a, b);
        int lcmValue = lcm(a, b);
        return new int[]{lcmValue, gcdValue};
    }

    public static void main(String[] args) {
        // Test cases
        int[] result1 = lcmAndGcd(5, 10);
        System.out.println("[" + result1[0] + ", " + result1[1] + "]");  // Output: [10, 5]

        int[] result2 = lcmAndGcd(14, 8);
        System.out.println("[" + result2[0] + ", " + result2[1] + "]");  // Output: [56, 2]

        int[] result3 = lcmAndGcd(1, 1);
        System.out.println("[" + result3[0] + ", " + result3[1] + "]");  // Output: [1, 1]
    }
}