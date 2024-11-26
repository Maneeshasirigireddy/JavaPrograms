package com.strings;

public class Test {
	public static void main(String [] args) {
		
		String s="jsp#@123OAR";
		String lw="",up="",sp="",nc="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='a'&&c<='z')lw+=c;
			else if(c>='A'&& c<='Z')up+=c;
			else if(c>='0'&&c<='9')nc+=c;
			else sp+=c;
		}
		String s1=lw+up+nc+sp;
		System.out.println(s1);
	}
}
