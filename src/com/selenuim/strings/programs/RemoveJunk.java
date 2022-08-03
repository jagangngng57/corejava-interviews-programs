package com.selenuim.strings.programs;

public class RemoveJunk {

	public static void main(String[] args) {

		String str = "@@#@#@#@# Jagadndfdssdf ";

		// Regular experession : [^a-zA-Z0-9]

		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
	}

}
