package com.logical;

public class Factorial {

	public static void main(String[] args) {
		
		int num=3;
		long factorial=1;
		
		for(int i=2; i<=num; i++)
		{
			factorial= factorial*i;
		}
            System.out.println("Factorial is : "+factorial);
	}

}
