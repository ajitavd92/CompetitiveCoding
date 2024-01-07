package com.bosscoder.BossCoderAssignment.Recursion;

public class Palindrome {

	public static void main(String[] args) {
		String s="abcba";
		int l=0;
		int r=s.length()-1;
		System.out.println(isPalindrome(s, l, r));

	}
	
	public static boolean isPalindrome(String s, int l, int r) {
		
		if(l>=r) {
			return true;
		}
		
		return s.charAt(l)==s.charAt(r) && isPalindrome(s, l+1, r-1);
		
	}

}
