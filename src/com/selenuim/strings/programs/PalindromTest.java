package com.selenuim.strings.programs;

public class PalindromTest {


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
		
		//One Way to do polindrom
		
		String str = "malayalam";
		StringBuilder buider = new StringBuilder(str);
		
		buider.reverse();
		
		isPolindromTest(str);



	}


}
