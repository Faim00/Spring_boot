package com.strings;

public class StringDuplicate {

	 public static void main(String[] args) {
		
		 String name="narendra";
		 
		 char[] split= name.toCharArray();
		 
		 for(int i=0; i<split.length; i++)
		 {
			 for(int j=i+1; j<split.length; j++)
			 {
				 if(split[i]==split[j])
					 System.out.print(split[j]+" ");
			 }
		 }
	}
}
