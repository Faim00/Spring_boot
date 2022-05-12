package com.list;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_to_ArrayList {

	  public static void main(String[] args) {
		String[] cityName= new String[] {"Beed","Latur","Parli","Majalagon"};
		// create Array List 
		ArrayList<String> list= new ArrayList<String>(Arrays.asList(cityName));
		list.add("Nilanga");
		list.add("patoda");
		list.add("ashti");
		
		// display list 
		for(String elements: list)
		{
			System.out.print(elements+"  ");
		}
		
	}
}
