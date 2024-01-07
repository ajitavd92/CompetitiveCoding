package com.bosscoder.BossCoderAssignment.Recursion;

public class PermutationString {

	public static void main(String[] args) {
		String q="123";
		String ans="";
		permutations(q,ans);
			

	}
	
	public static void permutations(String q, String ans){
		if(q.length()==0) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<q.length();i++) {
			char ch =q.charAt(i);
			String one=q.substring(0,i);
			String two=q.substring(i+1);
			System.out.println("One:"+one+"   "+ "Two:"+two);
			String nq =q.substring(0,i)+q.substring(i+1);
			permutations(nq, ans+ch);
		}
		
	}

}
