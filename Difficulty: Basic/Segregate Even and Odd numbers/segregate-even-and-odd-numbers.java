class Solution {
    void segregateEvenOdd(int arr[]) {
        Arrays.sort(arr);
        int temp[] = new int[arr.length];
        int index = 0;
        
        for(int x: arr){
            if(x%2==0) temp[index++] = x;
        }
        
        for(int x: arr){
            if(x%2==1) temp[index++] = x;
        }
        
        System.arraycopy(temp, 0, arr, 0, arr.length);
    }
}