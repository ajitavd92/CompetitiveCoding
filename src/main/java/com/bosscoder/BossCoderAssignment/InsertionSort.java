package com.bosscoder.BossCoderAssignment;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] a1= {7,8,3,1,2};
		System.out.println(Arrays.toString(sorting(a1)));

	}
	static int[] sorting(int[] arr) {
		 //insertion sort
	       for(int i=1; i<arr.length; i++) {  //1 to 5
	           int current = arr[i];  //8-->3-->1
	           int j = i - 1; //0-->1
	               while(j >= 0 && arr[j] > current) { //0>=0 & 7>8 -->1>=0 & 8>3-->0>=0 & 7>3
	            	   //2>=0 && 8>1 --> 1>=0 && 7>1-->0>=0 && 3>1
	                   //Keep swapping
	                   arr[j+1] = arr[j];//8-->7-->8 -->7-->3
	                   j--;
	               }
	           arr[j+1] = current; //a[0]=3-->3,7,8,1,2
	           					         //1,3,7,8,2
	       }
	       return arr;
	}


}
