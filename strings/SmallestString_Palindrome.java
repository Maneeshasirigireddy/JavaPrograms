package com.strings;

public class SmallestString_Palindrome {
	public static void main(String [] args) {
		String s1="malayalam";
		String smallestString="malayalam";
		for(int i=0;i<s1.length();i++) {
			for(int j=i+2;j<s1.length();j++) {
				String s=s1.substring(i,j);
				if(isPalindrome(s)) {
					if(s.length()<smallestString.length()) {
						smallestString=s;
					}
					System.out.println(s);
				}
			}
		}
		System.out.println("______________");
		System.out.println(smallestString);
	}
	public static boolean isPalindrome(String s) {
		int i=0,j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j))return false;
			i++;
			j--;
		}
		return true;
	}
}
