package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Iterate_HashMap {

	 public static void main(String[] args) {
		
		 HashMap<Integer, String> map = new HashMap<Integer, String>();
		 // put element to hash map
		 map.put(1, "Narendra");
		 map.put(2, "Vikas");
		 map.put(3, "Lokesh");
		 map.put(4, "Manish");
		 // iterate the map
		 for(Map.Entry<Integer, String> entry: map.entrySet())
		 {
			// System.out.println("The Keys Are : "+key+"The Values Are "+map.get(key));
			 System.out.println("The Key is "+entry.getKey()+"  The Values is : "+entry.getValue());
		 }
		 
	}
}
