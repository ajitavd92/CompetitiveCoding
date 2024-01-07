package com.bosscoder.BossCoderAssignment.BitManipulation;

public class SumOfXOR {
	public static void main(String[] args) {
		int[] arr= {1,5,6};
		sum(arr);
	}
	
	static int sum(int[]  input){
        int bits = 0;
     
        // Finding bitwise OR of all elements
        for (int i = 0; i < input.length; ++i) {
        	bits |= input[i];
		}
     
        int ans = bits * (int)Math.pow(2, input.length-1);
        System.out.println(ans);
        return ans;
    }
}
