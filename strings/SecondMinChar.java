package com.strings;

public class SecondMinChar {
	public static void main(String [] args) {
		String s="eejjavvvvaap";
		char minChar=' ',minChar2=' ';
		int minCount=9,min2=9;
		
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
				min2=minCount;
				minCount=count;
				minChar2=minChar;
				minChar=c[i];
			}
			else if(count<min2 || min2==minCount) {
				min2=count;
				minChar2=c[i];
			}
			System.out.println(c[i]+"="+count);
		}
		System.out.println("Second minimum occured charecter is:"+minChar2+"="+min2);
}
}
