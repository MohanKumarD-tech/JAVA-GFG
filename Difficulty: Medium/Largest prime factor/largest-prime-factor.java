// User function Template for Java

class Solution {
    static int largestPrimeFactor(int n) {
        // code here
        int maxi=-1;
        
        for(int i=2;i<=n;i++){
            if(n%i==0){
                maxi=Math.max(maxi,i);
                while(n%i==0){
                    n/=i;
                }
            }
        }
        
        if(n!=1)maxi=Math.max(maxi,n);
        
        return maxi;
    }
}