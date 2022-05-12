package com.array;

public class LargestElement {

	  public static void main(String[] args) {
		
		  int[] arr= new int[] {10,34,45,23,89};
		  int maxElement=arr[0];
		  
		  for(int i=1; i<arr.length; i++)
		  {
			  if(maxElement<arr[i])
				  maxElement=arr[i];
		  }
		  System.out.println("Largest Element in array is : " +maxElement);
	}
}
