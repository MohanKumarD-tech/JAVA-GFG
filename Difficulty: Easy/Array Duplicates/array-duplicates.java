class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]) - 1;

            if (arr[index] < 0) {
                // Duplicate found
                duplicates.add(Math.abs(arr[i]));
            } else {
                // Mark as visited
                arr[index] = -arr[index];
            }
        }
        return duplicates;
    }
}