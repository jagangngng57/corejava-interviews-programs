package com.selenuim.strings.programs;

public class PrimeTest {

	
	public static boolean isPrimeNumber(int num) {
		
		if(num<=1) {
			return false;
		}
		
		for(int i=2;i<num;i++) {
			if(num %i ==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void getPrimeNumbers(int num) {
		
		for(int i=2;i<=num;i++) {
			if(isPrimeNumber(i)) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void main(String[] args) {
	
		System.out.println("2 is the lowest Prime number :"+isPrimeNumber(2));
		
		System.out.println("6 is the lowest Prime number :"+isPrimeNumber(6));
		
		System.out.println("7 is the lowest Prime number :"+isPrimeNumber(7));
		
		System.out.println("0 is the lowest Prime number :"+isPrimeNumber(0));
		getPrimeNumbers(20);
		
		
	}
}
