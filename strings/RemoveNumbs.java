package com.strings;

public class RemoveNumbs {
	public static void main(String [] args) {
		String s="ja34v8a38";
		String s1="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='0'&&c<='9')continue;
			s1+=c;
		}
		System.out.println(s1);
	}
}
