package com.strings;

public class AllPalindromes {
	public static void main(String [] args) {
		String s="banana";
		for(int i=0;i<s.length()-1;i++) {
			for(int j=i+1;j<s.length();j++) {
				if(isPalindrome(s,i,j)) {
					System.out.println(s.substring(i,j+1));
				}
			}
		}
	}
	static boolean isPalindrome(String s,int i,int j) {
		char[] a=s.toCharArray();
		int start=i,end=j;
		while(start<end) {
			if(a[start]!=a[end])return false;
			start++;
			end--;
		}
		return true;
	}
	
}
