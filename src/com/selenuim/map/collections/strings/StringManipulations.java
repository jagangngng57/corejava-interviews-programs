package com.selenuim.map.collections.strings;

public class StringManipulations {

	//8. How to remove Whitespaces from String
	String removeWhiteSpaces(String input){
		StringBuilder output = new StringBuilder();
		
		char[] charArray = input.toCharArray();
		
		for(char c : charArray) {
			if (!Character.isWhitespace(c))
				output.append(c);
		}
		
		return output.toString();
	}
	
	//9. How to remove leading and trailing whitespaces from a string?

	
}
