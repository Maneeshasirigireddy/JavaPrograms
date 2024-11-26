package com.strings;

public class AddNumb {
	public static void main(String [] args) {
		String s="ab12cd34";
		int sum=0;
		char[] c=s.toCharArray();
		for(char a:c) {
			if(a>='0'&&a<='9') {
				sum+=(a-'0');
				
			}
		}
		System.out.println(sum);
	}
}
