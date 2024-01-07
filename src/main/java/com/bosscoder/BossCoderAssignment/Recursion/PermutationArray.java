package com.bosscoder.BossCoderAssignment.Recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationArray {

	public static void main(String[] args) {
		int[] input= {4,1,1,0,0};
		permute(input);

	}
	
	static List<List<Integer>> result;
    public static List<List<Integer>> permute(int[] nums) {
    	
        result = new ArrayList<>();
        helper(new ArrayList<>(), nums);
        return result;
    }
	
	
	public static void helper(List<Integer> ans, int[] arr) {
		if(ans.size()==arr.length) {
			result.add(new ArrayList<>(ans));
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(ans.contains(arr[i])) continue;
			ans.add(arr[i]);
			helper(ans, arr);
			ans.remove(ans.size() - 1);
			
		}
	}

}
