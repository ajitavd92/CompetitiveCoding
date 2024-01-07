package com.bosscoder.BossCoderAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RichestCustomerWealth {

	public static void main(String[] args) {
		int[][] original = { { 1, 2, 3 }, { 3, 2, 1 } };
		//System.out.println(solve(original));

		List<List<Integer>> input = new ArrayList<List<Integer>>();
		input.add(Arrays.asList(2,2,0));
		input.add(Arrays.asList(1,1,1));
		System.out.println(solve(input));
	}

	static int solve(int[][] input) {
		int max_wealth = 0;
		for (int i = 0; i < input.length; i++) {
			int sum = 0;
			for (int j = 0; j < input[i].length; j++) {
				sum += input[i][j];
			}
			max_wealth = Math.max(max_wealth, sum);
		}

		return max_wealth;

	}

	static int solve(List<List<Integer>> input) {
		int max_wealth = 0;
		for (int i = 0; i < input.size(); i++) {
			int sum = 0;
			for (int j = 0; j < input.get(i).size(); j++) {
				sum += input.get(i).get(j);
			}
			max_wealth = Math.max(max_wealth, sum);
		}

		return max_wealth;

	}

}
