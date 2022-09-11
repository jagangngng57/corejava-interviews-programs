package com.selenuim.map.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class ElminateDuplicateWithoutLoop {

	public static void main(String[] args) {
		// ArrayList with duplicate elements
		ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
		System.out.println(numbersList);

		ArrayList list = new ArrayList();
		list.add("jagadeesh");
		list.add("Gyangi");
		list.add("jagadeesh");

		System.out.println("Before Duplicate elimintaes   " + list);

		/**
		 * Else you can add elements like below ArrayList list = new ArrayList();
		 * list.add("jagadeesh"); list.add("Gyangi"); list.add("jagadeesh");
		 */

		// ArrayList without duplicate elements
		LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(list);
		ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(hashSet);
		System.out.println(listWithoutDuplicates);

	}
}
