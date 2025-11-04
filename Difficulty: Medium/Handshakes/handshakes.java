// User function Template for Java

class Solution {
    static int count(int N) {
        return catalanNumber(N / 2);
    }
    
    // Function to calculate the nth Catalan number using Dynamic Programming
    public static int catalanNumber(int n) {
        // Array to store the catalan numbers
        int[] dp = new int[n + 1];
        
        // Base case: C0 is 1
        dp[0] = 1;
        
        // Fill the dp array using the recurrence relation
        for (int i = 1; i <= n; i++) {
            dp[i] = 0;
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - 1 - j];
            }
        }
        return dp[n];
    }
};