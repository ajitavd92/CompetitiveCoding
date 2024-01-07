package com.bosscoder.BossCoderAssignment;

import java.util.Arrays;

public class MinDifferencePair {

	public static void main(String[] args) {
		int[] a1= {2, 4, 5, 9, 7};
		System.out.println(solve(a1));

	}

	public static int solve(int[]  nums){
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++)
            min=Math.min((nums[i]-nums[i-1]),min);
        return min;
    }
}
