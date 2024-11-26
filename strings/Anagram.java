package com.strings;

public class Anagram {
	public static void main(String [] args) {
		String s1="care";
		String s2="race";
		if(isAnagram(s1,s2)) {
			System.out.println("Given string is anagram string");
		}
		else {
			System.out.println("Given string is not an anagram string");
		}
	}
	public static boolean isAnagram(String s1,String s2) {
		while(true) {
			if(s1.length()!=s2.length())return false;
			if(s1.length()==0&&s2.length()==0)return true;
			char c=s2.charAt(0);
			s2=s2.replace(c+"", "");
			s1=s1.replace(c+"", "");
		}
	}
}
