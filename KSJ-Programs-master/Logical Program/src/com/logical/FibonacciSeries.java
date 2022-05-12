package com.logical;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
	 	
	   Scanner sc= new Scanner(System.in);
	   
	   System.out.println("Which Number's Fabinisio Serirs You Want to Calculate");
	   int fab= sc.nextInt();
	   
	   // hold number into array 
	   int[] arrfab= new int[fab];
	   
	   arrfab[0]=0;
	   arrfab[1]=1;
	   
	   for(int i=2; i<arrfab.length; i++)
	   {
		   arrfab[i]= arrfab[i-1]+ arrfab[i-2];
	   }
	   
	   for(int i: arrfab)
	   {
		   System.out.print(i+" ");
	   }
	}

}
