class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        
        prefixSum[0] = arr[0];
        
        for(int i = 1; i < n; i++){
            prefixSum[i] = prefixSum[i-1]+arr[i];
        }
        
        for(int i = 1; i < n-1; i++){
            if(prefixSum[i-1] == (prefixSum[n-1]-prefixSum[i])) return i;
        }
        
        return -1;
    }
}