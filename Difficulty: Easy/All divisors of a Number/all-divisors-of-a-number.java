class Solution {
    public static void print_divisors(int n) {
        // code here
        // List to store divisors
        List<Integer> divisors = new ArrayList<>();
        
        // Loop from 1 to sqrt(n)
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {  // i is a divisor
                divisors.add(i);  // Add i
                if (i != n / i) {
                    divisors.add(n / i);  // Add n / i if it's different
                }
            }
        }
        
        // Sort divisors in ascending order
        Collections.sort(divisors);
        
        // Print the divisors
        for (int divisor : divisors) {
            System.out.print(divisor + " ");
        }
    }
    
    public static void main(String[] args) {
        // Test the function with input
        int n1 = 20;
        int n2 = 21191;
        
        // Output for n = 20
        print_divisors(n1);  // Expected Output: 1 2 4 5 10 20
        System.out.println();
        
        // Output for n = 21191
        print_divisors(n2);  // Expected Output: 1 21191
    }
}