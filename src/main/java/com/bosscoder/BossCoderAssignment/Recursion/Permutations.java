package com.bosscoder.BossCoderAssignment.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
	
	public static void main(String[] args) {
		int[] input= {4,1,1,0,0};
		System.out.println(permute(input));
	}
	static List<List<Integer>> result;
    public static List<List<Integer>> permute(int[] nums) {
    	
        result = new ArrayList<>();
        helper(new ArrayList<>(), nums);
        return result;
    }
    
    public static void helper(List<Integer> curr, int[] nums) {
        if (curr.size() == nums.length) {
            result.add(new ArrayList<>(curr));
            return;
        }
        
        for (int num: nums) {
            if (!curr.contains(num)) {
                curr.add(num);
                helper(curr, nums);
                curr.remove(curr.size() - 1);
            }
        }
    }
}
