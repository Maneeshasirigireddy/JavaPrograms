package com.strings;

public class VowelCount {
	public static void main(String [] args) {
		String s="javaou";
		int count=0;
		for(int i=0;i<s.length();i++) {
			char c=s.toLowerCase().charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				count++;
			}
		}
		System.out.println(count);
	}
}
