package com.selenuim.strings.programs;

public class PalindromTest {

	public static void main(String[] args) {
		
		//One Way to do polindrom
		
		String str = "JAGADEESH";
		StringBuilder buider = new StringBuilder(str);
		
		buider.reverse();
		
		System.out.println(buider);
		String s2 = "madam";
		System.out.println(PalindromTest.isPalindromeString(s2));


	}


    private static boolean isPalindromeString(String str) {
        if (str == null)
            return false;
        int length = str.length();
        System.out.println(length / 2);
        for (int i = 0; i < length / 2; i++) {

            if (str.charAt(i) != str.charAt(length - i - 1))
            	
            	System.out.println("false");
                return false;
        }
        return true;
    }
}
