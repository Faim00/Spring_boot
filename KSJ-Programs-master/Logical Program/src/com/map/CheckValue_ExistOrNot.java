package com.map;

import java.util.HashSet;

public class CheckValue_ExistOrNot {

	public static void main(String[] args) {

		// create HashSet
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(7);
		set.add(9);
		// check element is avaliable or not 
		if(set.contains(3))
			System.out.println("Given Element Is Avaliable ....");
		else
			System.out.println("Given Element Is Not Avaliable ");
	}

}
