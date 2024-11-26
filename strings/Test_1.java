package com.strings;

public class Test_1 {
	public static void main(String [] args) {
		String s="jsp#@123OAR";
		int lw=0,up=0,sp=0,nc=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='a'&&c<='z')lw++;
			else if(c>='A'&& c<='Z')up++;
			else if(c>='0'&&c<='9')nc++;
			else sp++;
		}
		System.out.println("lower case leters="+lw);
		System.out.println("upper case leters="+up);
		System.out.println("special characters="+sp);
		System.out.println("numbers="+nc);
	}
}
