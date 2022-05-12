package com.list;

import java.util.ArrayList;
import java.util.List;


public class ArrayList_to_Array {

	  public static void main(String[] args) {
		
		  List<String> list = new ArrayList<String>();
		  for(int i=0; i<10; i++)
		  {
			  list.add(i+"");
		  }
		  
		  String[] listArray= new String[list.size()];
		  
		  // add list element to new String[]
		  for(int j=0; j<list.size(); j++)
		  {
			  listArray[j]= list.get(j);
		  }
		  for(String element: listArray)
		  {
			  System.out.println(element);
		  }
	}
}
