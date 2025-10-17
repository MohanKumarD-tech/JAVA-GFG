// User function Template for Java

class Solution {
    // Function for finding maximum and value pair
    int minSwap(int[] arr, int k) {
        int n = arr.length;
        
        // Step 1: Count how many elements are less than or equal to k
        int countLessEqualK = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= k) {
                countLessEqualK++;
            }
        }
        
        // If no elements are <= k, or the entire array is <= k, no swaps are needed
        if (countLessEqualK == 0 || countLessEqualK == n) {
            return 0;
        }
        
        // Step 2: Count how many elements <= k are in the first window of size countLessEqualK
        int currentWindowCount = 0;
        for (int i = 0; i < countLessEqualK; i++) {
            if (arr[i] <= k) {
                currentWindowCount++;
            }
        }
        
        // Step 3: Apply sliding window technique
        int maxCount = currentWindowCount;
        
        for (int i = countLessEqualK; i < n; i++) {
            // Slide the window to the right: remove the leftmost element and add the rightmost one
            if (arr[i - countLessEqualK] <= k) {
                currentWindowCount--;
            }
            if (arr[i] <= k) {
                currentWindowCount++;
            }
            
            // Update maxCount if we found a better window
            maxCount = Math.max(maxCount, currentWindowCount);
        }
        
        // The number of swaps required is the number of elements in the window
        // that are greater than k, which is equal to the window size - maxCount
        return countLessEqualK - maxCount;
    }
}
