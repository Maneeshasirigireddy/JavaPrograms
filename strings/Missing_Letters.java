package com.strings;

public class Missing_Letters {

	public static void main(String[] args) {
		String s="abcdfghij";
		String s1="";
		s=s.toLowerCase();
		for(char c='a';c<='z';c++) {
			if(s.indexOf(c)==-1) {
				s1+=c;
			}
		}
		System.out.println(s1);

	}

}
