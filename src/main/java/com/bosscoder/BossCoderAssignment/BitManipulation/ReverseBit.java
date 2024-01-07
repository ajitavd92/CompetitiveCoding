package com.bosscoder.BossCoderAssignment.BitManipulation;

public class ReverseBit {

	public static void main(String[] args) {
		System.out.println(solve("1011"));
	}

	static long solve(String s) {
		int n=Integer.parseInt(s);
		long ans=0;
		for(int cur=1;cur<=32;cur++) {
			int bit = (n>>(cur-1))&1;
			int newPos=32-cur+1;
			int mask= bit << (newPos -1);
			ans = ans | mask;
		
		}
		return ans;

	}
}
