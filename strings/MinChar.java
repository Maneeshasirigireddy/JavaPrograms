package com.strings;

public class MinChar {
	public static void main(String [] args) {
		String s="jjavyvvvaap";
		char minChar=' ';
		int minCount=9;
		char [] c=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			int count=1;
			if(c[i]=='\u0000')continue;
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					count++;
					c[j]='\u0000';
				}
			}
			if(count<minCount) {
				minCount=count;
				minChar=c[i];
			}
			System.out.println(c[i]+"="+count);
		}
		System.out.println("Minimum occured charecter is:"+minChar+"="+minCount);
	}

}
