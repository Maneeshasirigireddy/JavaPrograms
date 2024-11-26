package com.strings;

public class Missing_Vowels {
	public static void main(String [] args) {
		String s="jspiders";
		String s1="aeiou";
		for(int i=0;i<s1.length();i++) {
			char c=s1.charAt(i);
			if(!s.contains(c+"")) {
				System.out.println(c);
			}
		}
	}
}
