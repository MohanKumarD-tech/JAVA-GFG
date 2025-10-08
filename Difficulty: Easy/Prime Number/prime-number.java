class Solution {
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        // Check for factors from 2 to sqrt(n)
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // Found a factor
            }
        }

        return true; // No factors found
    }

    public static void main(String[] args) {
        System.out.println(isPrime(7));   // true
        System.out.println(isPrime(25));  // false
        System.out.println(isPrime(1));   // false
        System.out.println(isPrime(2));   // true
    }
}