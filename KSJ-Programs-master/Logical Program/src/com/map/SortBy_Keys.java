package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortBy_Keys {

	public static void main(String[] args) {
		// create Hash-map Object
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Narendra");
		map.put(21, "Vikas");
		map.put(3, "Mukesh");
		map.put(4, "lokesh");
		System.out.println("Before Sorting the HashMap");
		// Iterate the map object
		for (Map.Entry<Integer, String> mapEle : map.entrySet()) {
			System.out.println("The Key Are  " + mapEle.getKey() + " The Value Are " + mapEle.getValue());
		}
		System.out.println("After Sorting the HashMap By ID  ");
		Map<Integer, String> newMap = new HashMap<Integer, String>();
		Set set = newMap.entrySet();
		Iterator itr = set.iterator();

		while (itr.hasNext()) {
			Map.Entry pair = (Map.Entry) itr.next();
			System.out.println("Your Keys Are " + pair.getKey() + "  Your values Are " + pair.getValue());
		}

	}

}
