package com.bosscoder.BossCoderAssignment;

import java.util.Arrays;

public class CheckIsAp {

	public static void main(String[] args) {
		int arr[] = { 20, 15, 5, 0, 10 };
		int n = arr.length;

		if (checkIsAP(arr, n))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

	static boolean checkIsAP(int arr[], int n) {
		if (n == 1)
			return true;

		// Sort array
		Arrays.sort(arr);//[0, 5, 10, 15, 20]

		// After sorting, difference between
		// consecutive elements must be same.
		int d = arr[1] - arr[0];
		for (int i = 2; i < n; i++)
			if (arr[i] - arr[i - 1] != d) //10-5!=5
				return false;

		return true;
	}

}
