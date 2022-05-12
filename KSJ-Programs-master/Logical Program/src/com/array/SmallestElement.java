package com.array;

public class SmallestElement {

	public static void main(String[] args) {
		
		int[] arr= new int[] {34,78,34,21,43};
		
		int smallElement=arr[0];
		
		for(int i=1; i<arr.length; i++)
		{
			if(smallElement>arr[i])
				smallElement=arr[i];
		}
		System.out.println("Smallest Element in Array is : "+smallElement);
	}

}
