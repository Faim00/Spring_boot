package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort_Element {

	public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	 list.add(12);
	 list.add(21);
	 list.add(9);
	 list.add(3);
	 System.out.println("Before Sorting  : "+list);
	 //  
	 System.out.println("Sorting by Ascendind order");
	 Collections.sort(list);
	 System.out.println(list);
	 
	 System.out.println("After Sorting By Descending order ");
	 Collections.sort(list, Collections.reverseOrder());
	 System.out.println(list);
	
	
	}

}
