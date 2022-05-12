package com.strings;

public class StringReverse {

	public static void main(String[] args) {
		
		String name="narendra", reverse="";
		char ch;
		
		for(int i=0; i<name.length(); i++)
		{
			ch= name.charAt(i);
			reverse= ch+reverse;
		}
		System.err.println("String Reverse is : "+reverse);
	}
	
}
