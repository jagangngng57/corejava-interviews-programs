package com.selenuim.sorting;

public class SortingWithoutCollection {
	public static void main(String[] args) {
		// creating an instance of an array
		int[] arr = new int[] { 2, 4, 1, 3, 6, 5 };
		System.out.println("Array elements after sorting:");
		// sorting logic
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tmp = 0;
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			// prints the sorted element of the array
			System.out.println(arr[i]);
		}
	}
}
