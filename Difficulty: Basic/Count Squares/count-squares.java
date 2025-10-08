// User function Template for Java

class Solution {
    static int countSquares(int n) {
        // code here
    return (int)Math.floor(Math.sqrt(n - 1));
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(countSquares(9));  // Output: 2  (1, 4)
        System.out.println(countSquares(3));  // Output: 1  (1)
        System.out.println(countSquares(1));  // Output: 0
        System.out.println(countSquares(100)); // Output: 9 (1^2 to 9^2)
    }
}
