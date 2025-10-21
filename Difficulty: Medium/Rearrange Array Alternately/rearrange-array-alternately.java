class Solution {
    public void rearrange(int arr[]) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                int tem=arr[arr.length-1];
                for(int j=arr.length-1;j>i;j--){
                    arr[j]=arr[j-1];
                }
                arr[i]=tem;
            }
        }
    }
}