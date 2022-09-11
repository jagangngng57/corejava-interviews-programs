package com.selenuim.strings.programs;

class DemoImmutableTest {

	public static void main(String[] args) {

		EmployeeCustomImmutableTest test = new EmployeeCustomImmutableTest("AQCPG5907C");

		test.getPanCard();

		System.out.println(test.getPanCard());
	}
}
