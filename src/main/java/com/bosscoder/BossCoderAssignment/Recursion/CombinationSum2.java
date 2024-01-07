package com.bosscoder.BossCoderAssignment.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

	public static void main(String[] args) {
		int[] input = { 1,2,2,2,5 };
		combinationSum2(input, new ArrayList<>(), 0, 5);
	}

	public static void combinationSum2(int[] input, List<Integer> ans, int start, int val) {
		Arrays.sort(input); // [1, 1, 2, 5, 6, 7, 10]
		if (val == 0) {
			System.out.println(ans);
			return;
		}
		if (val < 0)
			return;

		for (int i = start; i < input.length; i++) {

//			if (input[i - 1]>0) {
//				System.out.println("i:" + i + ">" + "start:" + start + " && " + "input[i]:" + input[i] + "=="
//						+ "input[i-1]" + input[i - 1]);
//			}
			if (i > start && input[i] == input[i - 1]) {// 1>1 && 1 == 1 ==>false
				// 2>2 && 2==1 ==>false ==>3>3 && 5==2 ==>false
				// 4>3 && 6==5 ==>false==>5>3 && 7==6==>false
				// 6>3 && 10==7 ==>fa;se
				// 3>2 && 5==2 ==>false
				continue;
			}

			ans.add(input[i]);
			 //System.out.println(ans.toString());
			// [1]=>[1,1]=>[1,1,2]=>[1, 1, 2, 5]=>[1, 1, 2, 6]==>[1, 1, 2, 7]==>[1, 1, 2,
			// 10]==>[1,1,5]
			combinationSum2(input, ans, i + 1, val - input[i]);
			// [1, 1, 2, 5, 6, 7, 10], [1], 0+1, 8-1
			// [1, 1, 2, 5, 6, 7, 10], [1,1], 1+1, 7-1
			// [1, 1, 2, 5, 6, 7, 10], [1,1,2], 2+1, 6-2
			// [1, 1, 2, 5, 6, 7, 10], [1, 1, 2, 5], 3+1, 4-5
			// [1, 1, 2, 5, 6, 7, 10], [1, 1, 2, 6], 4+1, 4-6
			// [1, 1, 2, 5, 6, 7, 10], [1, 1, 2, 7], 5+1, 4-7
			// [1, 1, 2, 5, 6, 7, 10], [1, 1, 2, 10], 6+1, 4-10
			// [1, 1, 2, 5, 6, 7, 10], [1, 1, 5], 3+1, 4-10

			ans.remove(ans.size() - 1);
		}
	}

}
