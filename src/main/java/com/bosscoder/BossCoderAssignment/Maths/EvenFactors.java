package com.bosscoder.BossCoderAssignment.Maths;

public class EvenFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve(30);
	}

	static int solve(int n) {
		
		if(n%2!=0)
			return 0;
		int temp=0;
		for(int i=2;i<=n;i++) {
			if(n%i==0 && i%2==0) {
				System.out.println("Even Factors-->"+i);
				temp=temp+i;
				
			}
		}
		
		System.out.println("Even Factors sum-->"+temp);
		return temp;

	}

}
