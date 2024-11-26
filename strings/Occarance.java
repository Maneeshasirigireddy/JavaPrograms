package com.strings;

public class Occarance {

	public static void main(String[] args) {
		String s="Hello World";
		char [] c=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			char count='2';
			if(c[i]>='0'&&c[i]<='9')continue;
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					c[j]=count;
					count++;
				}
			}
			if(count!='2') {
				c[i]='1';
			}
		}
		System.out.println(c);

	}

}
