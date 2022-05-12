package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_Add_Retrive {

	public static void main(String[] args) {

		Map<Integer, String> hashMap = new HashMap();

		hashMap.put(1, "Narendra");
		hashMap.put(2, "vikas");
		hashMap.put(3, "Saket");
		hashMap.put(4, "Vijay");

		Set set = hashMap.entrySet();
		Iterator itr = set.iterator();

		while (itr.hasNext()) {
			Map.Entry pair = (Map.Entry) itr.next();
			System.out.println("Your Keys Are " + pair.getKey() + "  Your values Are " + pair.getValue());
		}

	}
 
}
