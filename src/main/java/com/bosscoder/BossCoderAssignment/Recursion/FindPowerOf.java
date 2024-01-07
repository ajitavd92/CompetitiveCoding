package com.bosscoder.BossCoderAssignment.Recursion;

public class FindPowerOf {

	public static void main(String[] args) {
		System.out.println(pow(2,3));

	}
	
	public static int pow(int a, int b) {
		
		if(b==0)
			return 1;
		
		int hp=pow(a,b/2);
		if(b%2==1) return hp*hp*a;
		else return hp*hp;
		
	}

}
