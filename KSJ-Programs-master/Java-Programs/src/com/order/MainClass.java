package com.order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {

	   public static void main(String[] args) {
		
		   List<Order>list = new ArrayList<Order>();
		   
		   list.add(new Order("p1", "c1", "12-01-2022") );
		   list.add(new Order("p2", "c1", "14-03-2022") );
		   list.add(new Order("p3", "c3", "20-02-2021") );
		   list.add(new Order("p2", "c2", "01-03-2020") );
		   list.add(new Order("p1", "c3", "29-04-2022") );
	
		   Collections.sort(list, Collections.reverseOrder());
			   
		   for(Order o: list)
		   {
			   System.out.println(o);
		   }
	}
}
