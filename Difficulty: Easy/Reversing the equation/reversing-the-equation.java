// User function Template for Java
class Solution {

    String reverseEqn(String S) {
        // your code here
        // Lists to store numbers and operators
        StringBuilder numbers = new StringBuilder();
        StringBuilder operators = new StringBuilder();
        
        // Parse the input equation
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (Character.isDigit(ch)) {
                numbers.append(ch);  // Collect digits for numbers
            } else {
                // Add the number (after collecting digits) and operator
                numbers.append(' ');
                operators.append(ch);
            }
        }

        // Handle the case where the input is just a single number
        if (operators.length() == 0) return S;

        // Split numbers and operators
        String[] numArr = numbers.toString().split(" ");
        String[] opArr = operators.toString().split("");

        // Reverse the numbers and operators
        StringBuilder result = new StringBuilder(numArr[numArr.length - 1]);
        for (int i = opArr.length - 1; i >= 0; i--) {
            result.append(opArr[i]).append(numArr[i]);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        System.out.println(solution.reverseEqn("20-3+5*2"));  // Expected: "2*5+3-20"
        System.out.println(solution.reverseEqn("5+2*56-2/4"));  // Expected: "4/2-56*2+5"
        System.out.println(solution.reverseEqn("2"));  // Expected: "2"
    }
}