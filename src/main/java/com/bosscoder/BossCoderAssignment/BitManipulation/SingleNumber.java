package com.bosscoder.BossCoderAssignment.BitManipulation;

public class SingleNumber {

	public static void main(String[] args) {
		int[] input= {2,2,1};
		find(input);

	}
	
	static int find(int[]  input){
        int ans=0;
        for(int i=0;i<input.length;i++){
             ans=ans^input[i];
        }
        System.out.println(ans);
        return ans;
    }

}
