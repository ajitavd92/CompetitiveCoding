package com.bosscoder.BossCoderAssignment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LengthOfLargestSubArray {

	public static void main(String[] args) {
		int[] a1 = { 15, -2, 2, -8, 1, 7, 10, 23 };
		System.out.println(maxLen(a1));
	}

	static int maxLen(int[] input) {
		Map<Integer,Integer>map=new HashMap<Integer,Integer>();
		   int maxi = 0;
		   int sum =0;

		   for (int i = 0; i<input.length; i++){
		       sum+=input[i];
		       if (sum==0){
		           maxi= i+1;

		       }
		       else {
		           if (map.containsKey(sum)){
		               maxi= Math.max(maxi, i- map.get(sum));

		           }
		           else {
		               map.put(sum,i);
		           }
		       }

		   }

		   return maxi;
	}

}
