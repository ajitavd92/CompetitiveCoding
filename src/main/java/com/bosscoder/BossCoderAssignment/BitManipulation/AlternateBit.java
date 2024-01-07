package com.bosscoder.BossCoderAssignment.BitManipulation;

public class AlternateBit {
	public static void main(String[] args) {
		check(10);
	}
	
	static boolean check(int n){
		int prev = n % 2;//0
        n = n / 2;//5
        // Traverse through remaining bits
        while (n > 0) {
            int curr = n % 2;//101
            // If current bit is same as previous
            if (curr == prev)
                return false;
            prev = curr;//101
            n = n / 2;
        }
        return true;
    }
}
