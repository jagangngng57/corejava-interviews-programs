package com.selenuim.strings.programs;

public class ReverseInteger {

	public static void main(String[] args) {
		
		long num = 123444;//444321
		
		long rev= 0;
		
		while(num !=0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		System.out.println("Reverse number is "+rev);
		
		//Solution 2:
		
		long num1 = 12345;
		
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());

	}

}
