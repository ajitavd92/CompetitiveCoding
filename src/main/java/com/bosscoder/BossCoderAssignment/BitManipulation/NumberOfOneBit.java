package com.bosscoder.BossCoderAssignment.BitManipulation;

public class NumberOfOneBit {

	public static void main(String[] args) {
		System.out.println(solve("1011"));
	}

	static int solve(String s){
		int n=Integer.parseInt(s); 
        int bitCount = 0;
        while(n != 0){
            bitCount++;
            n &= (n-1);
        }
        return bitCount;
    }
}
