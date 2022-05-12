package com.list;

import java.util.ArrayList;

public class ArrayList_Size_Find {

	  public static void main(String[] args) {
		
		  ArrayList<Integer> al= new ArrayList<Integer>();
		  al.add(12);
		  al.add(20);
		  // check sizze of array list 
		  int listSize= al.size();
		  System.out.println("Size of array list is : "+listSize);
		  // clearing the all element from list 
		  al.clear();
		  System.out.println("After Removing all element From list "+al.size());
	}
}
