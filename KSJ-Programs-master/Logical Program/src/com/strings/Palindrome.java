package com.strings;

public class Palindrome {

	  public static void main(String[] args) {
		
		  String name="ccc";
		  String reverse="";
		  char ch ;
		  
		  for(int i=0; i<name.length(); i++)
		  {
			  ch=name.charAt(i);
			  reverse= ch+reverse;
		  }
		  
		  if(name.equalsIgnoreCase(reverse))
		      System.out.println("Given String is Palindrome");
		  else
			  System.out.println("Given String is not Palindrome");
	}
}
