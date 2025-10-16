class Solution {
    public int findPages(int[] arr, int m) {
        int n=arr.length;
        if(m>n){ //Book vanda students dehrai
            return -1;
        }
        int sum = 0;
        for(int i=0; i<n;i++){
            sum+=arr[i];
        }
        int ans=-1;
        int st =0;
        int end = sum;
        
        while(st<=end){
            int mid=st+(end-st)/2;
            if(isValid(arr, n, m, mid)){ // left
                ans = mid;
                end = mid-1;
            }else{ // right
                st = mid+1;
            }
        }
        return ans;
    }
    
    public boolean isValid(int[] arr, int n, int m, int maxAllowedPages){
        int stu = 1;
        int pages =0;
        for(int i =0; i<n; i++){
            if(arr[i]>maxAllowedPages){
                return false;
            }
            if(pages + arr[i] <= maxAllowedPages){
                pages += arr[i];
            }else{
                stu++;
                pages = arr[i];
            }
            
        }
        return stu>m? false: true;
    }
}