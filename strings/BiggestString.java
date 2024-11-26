package com.strings;

public class BiggestString {
	public static void main(String [] args) {
		String s="malayalam";
		String bigPalindrome="";
		for(int i=0;i<s.length();i++) {
			for(int j=i+2;j<s.length();j++) {
				String str=s.substring(i, j);
				if(isPalindrome(str)) {
					if(str.length()>bigPalindrome.length()){
						bigPalindrome=str;
					}
					System.out.println(str);
				}
			}
		}
		System.out.println("________________");
		System.out.println(bigPalindrome);
		}
	public static boolean isPalindrome(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j))return false;
			i++;
			j--;
		}
		return true;
	}
}
