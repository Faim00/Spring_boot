package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrList_FindOdd {

	 public static void main(String[] args) {
		
		 List<Integer> list=new ArrayList<Integer>();
		 
		 for(int i=0; i<10;i++)
		 {
			 list.add(i);
		 }
		 
		 Iterator<Integer> itr= list.iterator();
		 
		 while(itr.hasNext())
		 {
			 if(itr.next()%2==0)
				 itr.remove();
				  
		 } 
		
		 System.out.println(" odd  element are "+list);
	}
}
