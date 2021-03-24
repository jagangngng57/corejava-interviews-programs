package com.selenuim.map.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		

		
		Map<String,Integer> map = new HashMap<String,Integer>();
	           
		map.put("JAGADEES", 1);
		map.put("Reddy", 2);
		map.put("JAGADEES", 3);
		map.put("dfd", 4);
		map.put(null, null);
		
			
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			
			System.out.println(entry.getKey()+ "" + entry.getValue());
		}
	}
          
	
           
           
}
