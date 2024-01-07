package com.bosscoder.BossCoderAssignment;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a1= {7,8,3,1,2};
		System.out.println(Arrays.toString(sorting(a1)));

	}
	
	static int[] sorting(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {//0 to 4
			int smallest=i; //0
			for(int j=i+1;j<arr.length;j++) { //1 to 5
				if(arr[smallest]>arr[j]) {//7>8-->7>3(Y)-->3>1(Y)-->1>2
					smallest=j;//2[3]-->3[1]
				}
			}
			int temp=arr[smallest];//1
			arr[smallest]=arr[i];//7
			arr[i]=temp;//1
			//1,,8,3,7,2
			
		}
		return arr;
		
	}

}
