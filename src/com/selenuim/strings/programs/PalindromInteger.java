package com.selenuim.strings.programs;

public class PalindromInteger {
	
	public static void isPalindromNumber(int num) {
		
		int reminder = 0;		
		int sum = 0;
		int originalValue;
		
		originalValue = num;
		while(num>0) {
			reminder = num%10;//Getting the reminder of number
			sum = (sum*10) + reminder;
			num = num/10;			
		}
		if(originalValue == sum) {
			System.out.println("Its Polindrom");
		}else {
			System.out.println("Its not polindrom");
		}
	}
	
	public static void isPolindromTest(String str) {
		
		int lenth = str.length();
		
		String reverse ="";
		for(int i=lenth-1;i>=0;i--) {
			reverse = reverse + str.charAt(i); //place the reverse order character one by one until string length zero
		}
		if(reverse.contains(str)) {
			System.out.println("Polindrom String");
			
		}else {
			System.out.println("Not polindrom String ");
		}
		
		
	}

	public static void main(String[] args) {
		
		isPalindromNumber(151);
		isPalindromNumber(100);
		isPalindromNumber(0);
		isPalindromNumber(101);
		
		isPolindromTest("malayalam");
		
		isPolindromTest("UST");
	}
	

}
