package com.strings;

public class Panagram {
	public static void main(String [] args) {
		String s="a quick brown fox jumps over the lazy dog";
		if(isPanagram(s)) {
			System.out.println("Given string is panagram String");
		}
		else {
			System.out.println("Given string is not a panagram String");
		}
	}
	public static boolean isPanagram(String s) {
		s=s.toLowerCase();
		if(s.length()<26) return false;
		for(char c='a';c<='z';c++) {
			if(s.indexOf(c)==-1) {
				return false;
			}
		}
		return true;
		
	}
}
