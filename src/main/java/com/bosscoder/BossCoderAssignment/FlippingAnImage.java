package com.bosscoder.BossCoderAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlippingAnImage {
	public static void main(String[] args) {
		List<List<Integer>> input = new ArrayList<List<Integer>>();
		input.add(Arrays.asList(1, 1, 0));
		input.add(Arrays.asList(1, 0, 1));
		input.add(Arrays.asList(0, 0, 0));
		System.out.println("Before flip image using arraylist=" + input);
		solve(input);
		
		int a[][]={{1,1,0},{1,0,1},{0,0,0}};  
		//System.out.println("Before flip image using array=" + Arrays.toString(a));
		//solve(a);

	}

	static List<List<Integer>> solve(List<List<Integer>> input) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		int rows = input.size();
		for (int i = 0; i < rows; i++) {
			ans.add(new ArrayList<Integer>());
			for (int j = 0; j < rows; j++) {
				ans.get(i).add(input.get(i).get(rows - 1 - j)); // Reverse number
				ans.get(i).set(j, 1 - ans.get(i).get(j)); // Invert number
			}
		}
		System.out.println("flip image using arraylist=" + ans);
		return ans;
	}

	static int[][] solve(int[][] input) {
		int rows = input.length;
		int ans[][] = new int[rows][rows];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				ans[i][j] = input[i][rows - 1 - j];
				ans[i][j] = 1 - ans[i][j];
			}
		}
		System.out.println("flip image using array=" + Arrays.toString(ans));
		return ans;
	}
}
