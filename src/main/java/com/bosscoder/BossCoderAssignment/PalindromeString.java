package com.bosscoder.BossCoderAssignment;

public class PalindromeString {

	public static void main(String[] args) {
		String string = "abca";
		System.out.println(validPalindrome(string));

	}
	
	public static boolean validPalindrome(String s) {
        String str2="";
        char c[]=s.toCharArray();
        for(int i=c.length-1;i>=0;i--){
            str2=str2+c[i];
        }
        System.out.println(str2);
        System.out.println(s);
        if(str2.equals(s)){
            return true;
        }
        return false;
    }

}
