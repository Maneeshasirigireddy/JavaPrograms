package com.strings;

public class Demo1 {
	public static void main(String [] args) {
		String s="Maneesha";
		int count=s.length()-s.replace("a", "").length();
		System.out.println(count);
	}
}
