package com.list;

import java.util.ArrayList;
import java.util.List;

public class Iterate_ArrayList {

	  public static void main(String[] args) {
		
		  List<Integer> list = new ArrayList<Integer>();
		  
		  for(int i=1; i<=10; i++)
		  {
			  list.add(i);
		  }
		  System.out.println("Element Added to Collection!!!");
		  
		  for(int  l: list)
		  {
			  System.out.println(l); 
		  }
	}
}
