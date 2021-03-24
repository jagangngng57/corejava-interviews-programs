package com.selenuim.strings.programs;

public class StringManipulations {

	
	public static void main(String[] args) {
		
		
		String str = "This is an amazing in amzons forest and it can";
		
		//postion find
		
		System.out.println(str.charAt(6));
		
		//indexOf it is for occurence first Occurance
		
		System.out.println(str.indexOf('a'));
		
		//Index of 2nd Occurence 
		
		System.out.println(str.indexOf('a', str.indexOf('a')+1));
		
		//IndexOf 3rd Occurence
		
		System.out.println(str.indexOf('a', 3));  //TODO
		
		String spaces = "   jagad Reddy ";
		
		//trim
		System.out.println(spaces.trim());
		
		//remove the spaces between strings
		System.out.println(spaces.replace(" ", ""));
		
		
		String split = "JAGAN_REDDY_CM";
		
		String s[] = split.split("_");
		
		for(String values:s) {
			
			System.out.println(values);
			
		}
		
		
		String x ="Jagan";
		
		String y ="Reddy";
		
		int a = 10;
		
		int b=800;
		
		System.out.println(x+y);
		
		System.out.println("==================================1");
		
		System.out.println(a+b);
		System.out.println("==================================2");
		
		System.out.println(x+y+a+b);
		
		System.out.println("==================================3");

		System.out.println(a+b+x+y);
		
		
		System.out.println(x+y+(a+b));

		
		
		
		
	}
}
