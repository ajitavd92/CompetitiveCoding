package com.bosscoder.BossCoderAssignment;

public class PangramString {

	public static void main(String[] args) {
		String string = "Fix problem quickly with galvanized jets";
		if (isPangram(string) == true)
			System.out.print(string + " is a pangram string.");
		else
			System.out.print(string + " is not a pangram string.");
	}

	public static boolean isPangram(String string) {
		// creating a boolean array to mark the character presented in the string
		// by default all chracters are set to false
		boolean[] mark = new boolean[26];
		// for indexing in mark[]
		int index = 0;
		// loop iterate over all the characters
		for (int i = 0; i < string.length(); i++) {
			// in case of uppercase letter subtract 'A' to find the index
			if ('A' <= string.charAt(i) && string.charAt(i) <= 'Z')
				index = string.charAt(i) - 'A';
			// in case of lowercase letter subtract 'a' to find the index
			else if ('a' <= string.charAt(i) && string.charAt(i) <= 'z')
				index = string.charAt(i) - 'a';
			// if character is other than alphabet
			else
				continue;
			mark[index] = true;
		}
		// return false if any character is unmarked
		for (int i = 0; i <= 25; i++)
			if (mark[i] == false)
				return (false);
		// if all characters were present
		return (true);
	}

}
