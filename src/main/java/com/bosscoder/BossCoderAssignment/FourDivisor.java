package com.bosscoder.BossCoderAssignment;

public class FourDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={21,4,7};
		System.out.println(solve(a));
	}
	
	static int solve(int[]  input){
		int sum = 0;
        for(int i = 0; i < input.length; i++) {
            int num = input[i];
            int count = 0;
            int sumOfDivisors = 0;
            for(int j = 1; j <= Math.sqrt(num); j++) {
                if(num % j == 0) {
                    if(j * j == num) {
                        count++;
                        sumOfDivisors += j;
                    } else {
                        count += 2;
                        sumOfDivisors += (j + (num / j));
                    }
                }
            }
            if(count == 4) {
                sum += sumOfDivisors;
            }
        }
        return sum;
    }

}
