package com.selenuim.strings.programs;

public class SmallestAndLargst {

	public static void main(String[] args) {

		int numbers[] = { 10, -10, 30, 89, 9000, 22, -1000 };

		int largest = numbers[0];
		int smallest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {

			if (numbers[i] > largest) {
				largest = numbers[i];
			} else if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}

		System.out.println("Smallest number is ::: " + smallest);
		System.out.println("Largest number is ::: " + largest);
	}
}
