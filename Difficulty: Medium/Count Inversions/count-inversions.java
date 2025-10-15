class Solution {
    static int inversionCount(int arr[]) {
        // Code Here
        return mergeSort(arr, new int[arr.length], 0, arr.length - 1);
    }

    // Merge Sort function that counts inversions during merge
    private static int mergeSort(int[] arr, int[] temp, int left, int right) {
        int invCount = 0;
        if (left < right) {
            int mid = (left + right) / 2;

            invCount += mergeSort(arr, temp, left, mid);       // Left half inversions
            invCount += mergeSort(arr, temp, mid + 1, right);  // Right half inversions
            invCount += merge(arr, temp, left, mid, right);    // Merging and counting inversions
        }
        return invCount;
    }

    // Merge function that merges two sorted halves and counts inversions
    private static int merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left, j = mid + 1, k = left, invCount = 0;

        // Merge two halves while counting inversions
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += (mid - i + 1);  // Count how many elements are greater in the left half
            }
        }

        // Copy remaining elements from left half, if any
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from right half, if any
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy sorted elements back to the original array
        System.arraycopy(temp, left, arr, left, right - left + 1);

        return invCount;
    }
}