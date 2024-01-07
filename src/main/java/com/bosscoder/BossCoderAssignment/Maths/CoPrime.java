package com.bosscoder.BossCoderAssignment.Maths;

public class CoPrime {

	public static void main(String[] args) {
		System.out.println(maxCoPrime(14,28));
		
		//15 ->1 3 5 15   3=> 1 3
		//45 ->1 3 5 9 15 45   27 -> 1 3 9 27
		
		//gcd(45,27)=9
		//x=45/9=5
		//gcd(5,27)=1

	}
	
	public static int gcd(int a, int b) {
		if(a==0) return b;
		return gcd(b%a,a);
	}
	
	public static int maxCoPrime(int x, int y) {
		int factor = gcd(x,y);   //gcd(28%14,14)=14
		while(factor!=1) {
			x=x/factor;          //14/14=1
			factor=gcd(x,y);     //gcd(1,28)==gcd(28%1,1)=1
		}
		return x;
	}

}
