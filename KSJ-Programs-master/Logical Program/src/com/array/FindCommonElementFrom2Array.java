package com.array;

public class FindCommonElementFrom2Array {

	  public static void main(String[] args) {
		
		  int[] arr1= new int[] {10,20,30,50,60};
		  int[] arr2= new int[] {20,30,10,50,40};
		  
		  for(int i=0; i<arr1.length; i++)
		  {
			  for(int j=0; j<arr2.length; j++)
			  {
				  if(arr1[i]== arr2[j])
					  System.out.print("  "+arr1[i]);
			  }
		  }
	}
}
