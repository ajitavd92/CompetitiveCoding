package com.bosscoder.BossCoderAssignment;

public class ReverseString {
	public static void main(String[] args) {
		String string = "Fix problem quickly with galvanized jets";
		System.out.println(reverseWord(string));
		//System.out.println(reverseStringCharacter(string));
	}

	static String reverseWord(String s) {
		String str1= "";
        String a[] = s.trim().split(" ");
        for(int i=a.length-1;i>0;i--){
            str1=str1+a[i]+" ";
        }
        return str1+a[0];

	}
	
	static String reverseStringCharacter(String s) {
		String str1 = "";
		String a[] = s.split("\\s");
		for (int i = a.length - 1; i >= 0; i--) {
			str1 = str1 + a[i] + " ";
		}
		return str1;

	}

}
