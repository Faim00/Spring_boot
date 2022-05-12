package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HM_SortBy_Key {

	 public static void main(String[] args) {
		
		 HashMap<Integer, String> map= new HashMap<Integer, String>();
		 // add elements into map
		 map.put(323, "Lokesh");
		 map.put(1, "vikas");
		 map.put(21,"kwran");
		 map.put(61,"karan");
		 map.put(24,"kunal");
		 map.put(2, "Jayesh");
		 // iterate loop
		 Iterator<Integer> itr= map.keySet().iterator();
		 System.out.println("Before Sorting");
		 while(itr.hasNext())
		 {
			 Integer key= itr.next();
			 System.out.println("The Keys Are :"+key+
					            "  The Values Are :"+map.get(key));  
		 }
		 //Map<Integer, String> mp1= new HashMap<Integer, String>();
		 
		 //use TreeMap to sort Elements
		 TreeMap<Integer, String> tm= new TreeMap<Integer, String>(map);
		 // Iterate loop for TM
		 Iterator<Integer> it= tm.keySet().iterator();
		 System.out.println("After Sorting");
		 while(it.hasNext())
		 {
			 Integer key=it.next();
			 System.out.println("The Keys Are: "+key+
					             "The Values Are: "+tm.get(key)); 
		 }
		 
	}
}
