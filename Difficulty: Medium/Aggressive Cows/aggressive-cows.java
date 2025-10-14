class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];
        int result = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canPlaceCows(stalls, k, mid)) {
                result = mid;
                low = mid + 1; // Try for bigger distance
            } else {
                high = mid - 1; // Try for smaller distance
            }
        }

        return result;
    }

    // Check if we can place k cows with at least `distance` apart
    private boolean canPlaceCows(int[] stalls, int k, int distance) {
        int count = 1; // First cow in first stall
        int lastPosition = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPosition >= distance) {
                count++;
                lastPosition = stalls[i];

                if (count == k) {
                    return true;
                }
            }
        }

        return false;
    }
}