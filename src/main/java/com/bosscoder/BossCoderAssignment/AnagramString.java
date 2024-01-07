package com.bosscoder.BossCoderAssignment;

import java.util.Arrays;

public class AnagramString {
	
	public static void main(String[] args) {
		String string1 = "Listen";
		String string2 = "Silent";
		System.out.println(check(string1,string2));
	}
	
	static boolean check(String str1,String str2){
		
		
		char[] c1=str1.toCharArray();
		char[] c2=str2.toCharArray();
		
		if(c1.length!=c2.length) {
			return false;
		}
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		for(int i=0;i<c1.length;i++) {
			if(c1[i]!=c2[i]) {
				return false;
			}
		}
		return true;
    }

}
