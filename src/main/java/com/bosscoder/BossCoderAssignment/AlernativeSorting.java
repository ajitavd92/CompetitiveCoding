package com.bosscoder.BossCoderAssignment;

import java.util.Arrays;

public class AlernativeSorting {

	public static void main(String[] args) {
		int[] a1= {7, 1, 2, 3, 4, 5, 6};
		sort(a1);
	}

	static int[] sort(int[]  input){
//        Arrays.sort(input);//[1, 2, 3, 4, 5, 6, 7]
//        for(int i=0;i<input.length;i++){//0 to 6
//            for(int j=input.length-1;j>=0;j--){ //6 to 0
//                int temp=input[i];
//                input[i]=input[j];
//                input[i+1]=temp;
//                i+=2;
//            }
//            
//        }
		
		Arrays.sort(input);
        int n=input.length;
        int ans[] = new int[n];
        int i=0,j=n-1;
        int k=0;
        while(i<j){
            ans[k++]=input[j--];
            ans[k++]=input[i++];
        }

        if(n%2!=0){
            ans[k]=input[i];
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
