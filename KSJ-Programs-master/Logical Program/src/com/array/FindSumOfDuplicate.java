package com.array;

public class FindSumOfDuplicate {

	public static void main(String[] args) {
		
		int[] a= new int[] {10,20,30,50,60};
		int[] b= new int[] {10,30,40,20,90};
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				if(a[i]==a[j])
				  sum= sum+a[j];	
			}
		}
	System.out.println("Addition Of Duplicate Element is: "+sum);	

	}

}
