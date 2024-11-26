package com.strings;

public class ReplaceConsicutiveCharecters {
	
	 public static void main(String[] args) {
		 String s = "bossss";
	       char [] c=s.toCharArray();

	        for (int i = 0; i <c.length; i++) {
	            for(int j=i+1;j<c.length;j++) {
	            	if(c[i]==c[j]) {
	            		c[j]='$';
	            		break;
	            	}
	            }
	        }
	        System.out.println(c);
	       
	    }
	    
	}
