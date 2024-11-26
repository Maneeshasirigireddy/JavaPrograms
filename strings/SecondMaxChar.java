package com.strings;

public class SecondMaxChar {

		public static void main(String [] args) {
			String s="jjavvvvajap";
			char maxChar=' ',maxChar2=' ';
			int maxCount=0,max2=0;
			
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
				if(count>maxCount) {
					max2=maxCount;
					maxCount=count;
					maxChar2=maxChar;
					maxChar=c[i];
				}
				else if(count>max2 || max2==maxCount) {
					max2=count;
					maxChar2=c[i];
				}
				System.out.println(c[i]+"="+count);
			}
			System.out.println("Second Maximum occured charecter is:"+maxChar2+"="+max2);
	}
}

