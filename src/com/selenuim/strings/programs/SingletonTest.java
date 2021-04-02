package com.selenuim.strings.programs;

public class SingletonTest {

	public static SingletonTest singletonTest;

	public String st;

	private SingletonTest() {
		st = "Jagan Reddy";

	}

	public static SingletonTest getInstance() {

		if (singletonTest == null)
			singletonTest = new SingletonTest();
		return singletonTest;

	}

	public static void main(String[] args) {

		SingletonTest singleton = SingletonTest.getInstance();
		SingletonTest singleton1 = SingletonTest.getInstance();
		SingletonTest singleton2 = SingletonTest.getInstance();

		singleton.st = (singleton.st).toUpperCase();

		System.out.println(singleton.st);

		System.out.println(singleton1.st);

		System.out.println(singleton2.st);

	}

}
