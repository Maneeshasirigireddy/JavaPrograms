package com.strings;

public class AddNumbs {
	public static void main(String [] args) {
		String s="a1bc12d34";
		char [] c=s.toCharArray();
		int sum=0;
		int n=0;
		int i=0;
		while(i<c.length) {
			while(i<c.length&&(c[i]>='0'&& c[i]<='9')) {
				n=(n*10)+(c[i]-'0');
				i++;
			}
			sum+=n;
			n=0;
			i++;
				
		}
		System.out.println(sum);
	}
}
