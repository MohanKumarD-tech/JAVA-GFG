/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int n=sc.nextInt();
            int arr1[]=new int[n];
            for(int i=0;i<n;i++){
                arr1[i]=sc.nextInt();
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int val:arr1){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int size=map.size();
        int arr[][]=new int[size][2];
        int idx=0;
        for(Map.Entry<Integer,Integer>e:map.entrySet()){
            arr[idx][0]=e.getKey();
            arr[idx][1]=e.getValue();
            idx++;
        }
        Arrays.sort(arr,(a,b)->{
            int val=Integer.compare(b[1],a[1]);
            if(val==0){
                 return Integer.compare(a[0],b[0]);
             }else{
            return val;
            }
        });
        
        for(int i=0;i<size;i++){
            int freq=arr[i][1];
            for(int j=0;j<freq;j++)
              System.out.print(arr[i][0]+" ");
        }
        System.out.println();
        
        }
    }
}