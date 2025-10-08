import java.util.ArrayList;

public class Solution {

    // This method generates the multiplication table for a given number
    public ArrayList<Integer> getTable(int n) {
        ArrayList<Integer> table = new ArrayList<>();  // ArrayList to hold the multiplication table
        for (int i = 1; i <= 10; i++) {
            table.add(n * i);  // Multiply n by i and add to the ArrayList
        }
        return table;
    }

    public static void main(String[] args) {
        Solution ob = new Solution();  // Create an instance of Solution class
        int n = 9;  // You can change this number to test with others
        ArrayList<Integer> ans = ob.getTable(n);  // Calling the method getTable to generate the table
        
        // Print the multiplication table
        System.out.println(ans);
    }
}
