class Solution {
    public int prime_Sum(int n) {
        if (n < 2) return 0;
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) isPrime[i] = true;

        for (int i = 2; i * i <= n; i++)
            if (isPrime[i])
                for (int j = i * i; j <= n; j += i)
                    isPrime[j] = false;

        int sum = 0;
        for (int i = 2; i <= n; i++)
            if (isPrime[i]) sum += i;

        return sum;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.prime_Sum(5));   // Output: 10
        System.out.println(s.prime_Sum(10));  // Output: 17
    }
}
