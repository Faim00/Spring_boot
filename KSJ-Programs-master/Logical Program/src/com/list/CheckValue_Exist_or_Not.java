package com.list;

import java.util.ArrayList;

public class CheckValue_Exist_or_Not {

	  public static void main(String[] args) {
		
		  ArrayList<Integer> list = new ArrayList<Integer>();
		  list.add(1);
		  list.add(3);
		  list.add(6);
		  list.add(8);
		  
		  System.out.println(list);
		  // check value contained or not
		  if(list.contains(0))
			  System.out.println("Element is Already Avaliable");
		  else
			  System.out.println("Element is Not There ");
  	}
}
