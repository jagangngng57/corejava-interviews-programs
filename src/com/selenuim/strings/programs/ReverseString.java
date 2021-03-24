package com.selenuim.strings.programs;

public class ReverseString {

	public static void main(String[] args) {
		
		
		//Polindrom as well
		
		//using for loop
		String s = "malayalam";
		
		int len = s.length();
		
		String rev="";
		
		
		for(int i =len-1;i>=0;i--) {
			rev= rev + s.charAt(i);
		}
		
		System.out.println(rev);
		
		
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());
		
	}

}
