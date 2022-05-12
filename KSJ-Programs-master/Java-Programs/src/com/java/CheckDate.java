package com.java;

import java.util.*;
class CheckDate 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		int[] calander= new int[]{31 ,59,90,120,151,181,212,243,273,304,334,365};
		String month=null;
		int date=0;
		System.out.println("Enter Your Days ");
		int days= sc.nextInt();
		System.out.println("Enter Your Year");
		int year=sc.nextInt();


		for(int i=0;i<calander.length; i++)
		{
		if(days<=calander[0])
			{
			  month="Janavary" ;
               date=days;
			   break;
			}
			else if(days>calander[0] && days<=calander[1])
			{
				 month="February ";
               date=days-calander[0];
			   break;
			}

			else if(days>calander[1]&&days<=calander[2])
			{
				month="March";
				date= days-calander[1];
				break;
			}
			else if(days>calander[2]&&days<=calander[3])
			{
				month="April";
				date= days-calander[2];
				break;
			}
			else if(days>calander[3]&&days<=calander[4])
			{
				month="May";
				date= days-calander[3];
				break;
			}
			else if(days>calander[4]&&days<=calander[5])
			{
				month="June";
				date= days-calander[4];
				break;
			}
			else if(days>calander[5]&&days<=calander[6])
			{
				month="July";
				date= days-calander[5];
				break;
			}
			else if(days>calander[6]&&days<=calander[7])
			{
				month="August";
				date= days-calander[6];
				break;
			}
			else if(days>calander[7]&&days<=calander[8])
			{
				month="September";
				date= days-calander[7];
				break;
			}
			else if(days>calander[8]&&days<=calander[9])
			{
				month="Octomber";
				date= days-calander[8];
				break;
			}
			else if(days>calander[9]&&days<=calander[10])
			{
				month="November";
				date= days-calander[9];
				break;
			}
			else if(days>calander[10]&&days<=calander[11])
			{
				month="December";
				date= days-calander[10];
				break;
			}
		 	
		}

		System.out.println("\nMonth is :  " +month+"\nThe date is :    " +date+ " \nYear is :   "+year);

		
	}
}
