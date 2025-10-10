class Solution {
    static boolean armstrongNumber(int n) {
        int sum = 0, temp = n, digits = String.valueOf(n).length();
        while (temp > 0) {
            sum += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int[] testCases = {153, 372, 100, 9474};  // 9474 is a 4-digit Armstrong number
        for (int n : testCases)
            System.out.println(n + ": " + armstrongNumber(n));
    }
}