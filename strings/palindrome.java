package com.strings;

public class palindrome {
	public static void main(String [] args) {
		System.out.println(ispalindrome("Madam"));
	}
	static boolean ispalindrome(String s) {
		char [] c=s.toLowerCase().toCharArray();
		int i=0;
		int j=c.length-1;
		while(i<j) {
			if(c[i++]!=c[j--])return false;	
		}
		return true;
		
	}
	
}
