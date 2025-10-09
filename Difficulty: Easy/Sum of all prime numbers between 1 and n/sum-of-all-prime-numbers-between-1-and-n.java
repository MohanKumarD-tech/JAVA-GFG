class Solution {
    public int prime_Sum(int n) {
        // code here
        if (n < 2) return 0;  // No prime numbers less than 2
        
        // Step 1: Create a boolean array "isPrime" to mark primes
        boolean[] isPrime = new boolean[n + 1];
        
        // Step 2: Initialize all numbers as prime (true)
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        
        // Step 3: Use Sieve of Eratosthenes to mark non-primes
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        // Step 4: Sum the primes
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                sum += i;
            }
        }
        
        return sum;
    }

    public static void main(String[] args) {
        // Create an instance of Solution class
        Solution solution = new Solution();
        
        // Test cases
        int n1 = 5;  // Expected: 10
        int n2 = 10; // Expected: 17
        
        // Output the results using the non-static method
        System.out.println(solution.prime_Sum(n1));  // Output: 10
        System.out.println(solution.prime_Sum(n2));  // Output: 17
    }
}