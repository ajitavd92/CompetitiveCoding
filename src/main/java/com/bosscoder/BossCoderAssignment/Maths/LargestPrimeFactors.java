package com.bosscoder.BossCoderAssignment.Maths;

public class LargestPrimeFactors {

	public static void main(String[] args) {
		solve(6);

	}

	static int solve(int n) {
		int largest_prime = -1;
        int i = 2;
        while (i * i <= n) { //4<=6-->9<=3
            while (n % i == 0) { //6%2=0 --> 3%2=1
                largest_prime = i; //2
                n = n / i; //6/2 = 3
            }
            i = i + 1;
        }
        if (n > 1) {
            largest_prime = n;
        }
        System.out.println(largest_prime);
        return largest_prime;

	}

}
