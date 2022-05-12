package com.map;

import java.util.HashMap;

public class Checkmap_is_Empty {

	  public static void main(String[] args) {
		
		  HashMap<Integer, String> map = new HashMap<Integer, String>();
		  System.out.println("Is Map is Empty ? \n==========");
		  if(map.isEmpty())
			   System.out.println("Map is empty ");
		  else
			  System.out.println("Map is not empty ");
		  
		  // add element to map 
		  map.put(1, "Narendra");
		  map.put(2, "vikass");
		  System.out.println("Is Map is Empty ?\n=========== ");
		  if(map.isEmpty())
			   System.out.println("Map is empty ");
		  else
			  System.out.println("Map is not empty ");

		  
		  
	}
}
