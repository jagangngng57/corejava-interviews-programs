package com.selenuim.strings.programs;

public class ImmutableTest {

	public static void main(String[] args) {

		String s = "Jagadeesh";
		s.concat("Gyangi");

		System.out.println(s);

		s = s.concat(" Gyangi");

		System.out.println(s);

	}

}
