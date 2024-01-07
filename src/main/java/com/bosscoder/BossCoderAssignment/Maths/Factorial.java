package com.bosscoder.BossCoderAssignment.Maths;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 16;
		// solve(n);
		System.out.println(solve(n));
	}

	static int solve(int n) {
		int fact = 0;

		for (int i = 5; i <= n; i *= 5)
			fact += n / i;
		return fact;
	}
}
