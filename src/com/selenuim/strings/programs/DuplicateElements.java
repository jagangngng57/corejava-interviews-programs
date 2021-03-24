package com.selenuim.strings.programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {

		// Solution: 1
		String names[] = { "Java", "Ruby", "Java", "Jquery", "Python" };

		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					System.out.println("Duplicate element is ::" + names[i]);
				}
			}
		}

		// Solution 2:

		
		System.out.println("Solution 2====================================");
		Set<String> store = new HashSet<String>();

		for (String name : names) {
			if (store.add(name) == false) {
				System.out.println("Duplicate elementis from HashSEt  : " + name);
			}
		}

		// Solution : 3

		System.out.println("Solution 3====================================");
		
		Map<String, Integer> storeMap = new HashMap<String, Integer>();

		for (String name : names) {
			Integer count = storeMap.get(name);
			if (count == null) {
				storeMap.put(name, 1);
			} else {
				storeMap.put(name, ++count);
			}

			// Iterate the HashMap

			for (Entry<String, Integer> entrySet : storeMap.entrySet()) {
				if (entrySet.getValue() > 1) {
					System.out.println("Duplicate values from MAP :" + entrySet.getKey());
				}
			}
		}

	}

}
