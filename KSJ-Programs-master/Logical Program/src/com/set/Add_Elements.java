package com.set;

import java.util.HashSet;

public class Add_Elements {

	 public static void main(String[] args) {
		
		 HashSet<String> state= new HashSet<String>();
		 // add element to set 
		 state.add("MH");
		 state.add("ts");
		 state.add("mp");
		 state.add("up");
		 // display element 
		 System.out.println(state);
		 // iterate it by using for loop
		 for(String states: state)
		 {
			 System.out.print(states+"   ");
		 }
	}
}
