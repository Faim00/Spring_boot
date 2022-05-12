package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_Iterate {

	public static void main(String[] args) {
		
      Set<Integer> set= new HashSet();
      
      for(int i=1; i<=10; i++)
      {
    	  set.add(i);
      }
      System.out.println("Element Added to Set ");
      // iterate hasset eleemnt 
      Iterator<Integer> itr= set.iterator();
      while(itr.hasNext())
      {
    	  System.out.println(itr.next());
      }
      // using for loop 
      for(Integer values: set)
      {
    	  System.out.println(values);
      }
	}

}
