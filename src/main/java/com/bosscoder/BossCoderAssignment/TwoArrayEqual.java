package com.bosscoder.BossCoderAssignment;

import java.util.Arrays;

public class TwoArrayEqual {

	public static void main(String[] args) {
		int[] a1= {1,2,5};
		int[] a2= {2,4,15};
		System.out.println(check(a1, a2));
	}
	
	static boolean check(int[]  input1,int[] input2){
		 Arrays.sort(input1);
	        Arrays.sort(input2);
	        return Arrays.equals(input1,input2);
    }

}
