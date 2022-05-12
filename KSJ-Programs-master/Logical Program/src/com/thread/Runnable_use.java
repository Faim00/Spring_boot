package com.thread;

class MyThread implements Runnable
{
	 public void run()
	  {
		 System.out.println("run ");
		 for(int i=0; i<10; i++)
		  System.out.println("run() of MtThread class");
	  }
}

public class Runnable_use  {

	  public static void main(String[] args) {
		
		 MyThread mth= new MyThread();
		  Thread th= new Thread(mth);
		  th.start();
		  System.out.println("hello ");
		  System.out.println("hello ");
		  System.out.println("hello ");
		  System.out.println("hello ");
		  
	}
	  
	 
}
