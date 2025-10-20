class Solution {
    public int subarraySum(int[] arr) {
        int n = arr.length;
        long totalSum = 0;

        // Iterate through the array and calculate the sum of subarrays
        for (int i = 0; i < n; i++) {
            // Calculate the number of subarrays where arr[i] is included
            long contribution = (long) arr[i] * (i + 1) * (n - i);
            totalSum += contribution;
        }

        // The result will fit within a 32-bit integer, so we cast it to int
        return (int) totalSum;
    }
}
