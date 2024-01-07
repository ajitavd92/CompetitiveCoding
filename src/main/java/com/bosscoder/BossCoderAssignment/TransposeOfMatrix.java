package com.bosscoder.BossCoderAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		List<List<Integer>> input = new ArrayList<List<Integer>>();
		input.add(Arrays.asList(1, 2, 3));
		input.add(Arrays.asList(4, 5, 6));
		input.add(Arrays.asList(7, 8, 9));
		System.out.println("Transpose Matrix=" + solve(input));
	}

	static List<List<Integer>> solve(List<List<Integer>> input) {
		int row=input.size();
		int col= input.get(0).size();
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for (int i = 0; i < col; i++) {
			list.add(new ArrayList<Integer>());
			for(int j=0;j<row;j++) {
				list.get(i).add(j,input.get(i).get(i));
			}
		}
		return list;

	}

}
