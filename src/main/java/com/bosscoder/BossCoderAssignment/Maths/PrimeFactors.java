package com.bosscoder.BossCoderAssignment.Maths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeFactors {

	public static void main(String[] args) {
		solve(315);
	}

	static int[] solve(int n) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 2; n > 1; i++) {
			if (n % i == 0) {
				while (n % i == 0) {
					list.add(i);
					n = n / i;
				}
			}
		}
		int[] array = new int[list.size()];
		for(int i = 0; i < list.size(); i++) 
			array[i] = list.get(i);
		
		System.out.println("prime factors::"+Arrays.toString(array));
		return array;
	}

}
