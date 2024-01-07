package com.bosscoder.BossCoderAssignment.Maths;

public class TotalNoOfDivisor {

	public static void main(String[] args) {
		System.out.println(divCount(25));

	}
	
	static int divCount(int n) {
		int count=0;
		for(int i=1;i*i<=n;i++) { //i*i=1,4,9,16
			if (n % i == 0) { 
                // If divisors are equal, 
                // count only one 
                if (n / i == i) 
                    count++; 
  
                else // Otherwise count both 
                	count = count + 2; 
            } 
		}
		return count;
	}

}
