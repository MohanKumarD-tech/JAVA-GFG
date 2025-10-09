import java.math.BigInteger;

class Solution {
    public String multiplyStrings(String s1, String s2) {
        // code here
        BigInteger n1 = new BigInteger(s1);
        BigInteger n2 = new BigInteger(s2);

        // Multiply
        BigInteger ans = n1.multiply(n2);

        // Convert back to String
        return ans.toString();
    }
}