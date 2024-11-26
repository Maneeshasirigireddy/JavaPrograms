package com.strings;

public class Consecutive_RepeatedCharacters {
	public static void main(String [] args) {
		String s="success";
		char[] a=s.toCharArray();
		int i=0;
		String s1="";
		while(i<a.length) {
			char c=a[i];
			s1+=c;
			i++;
			while(i<a.length&&c==a[i]) {
				s1+=a[i];
				i++;
				
			}
			if(s1.length()>1) {
				System.out.println(s1);
				
			}
			s1="";
		}
	}

}
