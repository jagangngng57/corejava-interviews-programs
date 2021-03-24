package com.selenuim.strings.programs;

public class StringSwap {

	public static void main(String[] args) {
		
		String a="JK";
		String b="Reddy";
		
		//Initial step append to a
		
		a=a+b;
		
		//store the a in b
		b = a.substring(0,a.length()-b.length());
		
		a = a.substring(b.length());
		
		System.out.println("After Swaping A is :"+a);
		
		System.out.println("After Swaping B is : "+b);
		

	}

}
