package com.array;

public class Copy_1Array_to_Another {

	 public static void main(String[] args) {
		
		 int[] first= new int[] {12,13,14,15,16};
		 
		 int[]  second= new int[first.length];
		 System.out.println("First array  element are ");
		 //iterate first array element and copy to second 
		 for(int i=0; i<first.length; i++)
		 {
			 System.out.print(first[i]+"  ");
			 second[i]= first[i];
		}
		 System.out.println("First Array Element copied to Second Array");
		 for(int j=0; j<second.length; j++)
		 {
			 System.out.print(second[j]+"  ");
		 }
	}
}
