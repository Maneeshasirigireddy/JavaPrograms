package com.strings;

public class Index {
	public static void main(String [] args) {
		String s="Maneesha Reddy";
		char find='R';
		char [] c=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			
			if(c[i]==find) {
				System.out.println(i);
				return;
			}
			
		}System.out.println(-1);
		
		
	}
}
