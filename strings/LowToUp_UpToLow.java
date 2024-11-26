package com.strings;

public class LowToUp_UpToLow {
	public static void main(String [] args) {
		String s="aaaaaaBBBBB";
		char[] c=s.toCharArray();
		String s1="";
		for(int i=0;i<c.length;i++) {
			if(c[i]>='a'&&c[i]<='z') {
				s1+=(c[i]+"").toUpperCase();
			}
			else if(c[i]>='A'&&c[i]<='Z') {
				s1+=(c[i]+"").toLowerCase();
			}
		}
		System.out.println(s1);
	}
}
