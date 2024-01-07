package com.bosscoder.BossCoderAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalSum {

	public static void main(String[] args) {
		List<List<Integer>> input = new ArrayList<List<Integer>>();
		input.add(Arrays.asList(1, 2, 3));
		input.add(Arrays.asList(4, 5, 6));
		input.add(Arrays.asList(7, 8, 9));
		System.out.println("Diagonal sum=" + solve(input));
	}

	static int solve(List<List<Integer>> input) {
		int rows=input.size();
		int sum=0;
		for (int i = 0; i < rows; i++) {
			sum=sum+input.get(i).get(i)+input.get(i).get(rows-1-i);//0+get(0).get(0)+get(0).get(2)=4
			//4+get(1).get(1)+get(1).get(1)=4+5+5=9
		}
		return rows%2==0? sum:sum-input.get(rows/2).get(rows/2);

	}
}
