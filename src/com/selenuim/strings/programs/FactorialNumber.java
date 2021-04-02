package com.selenuim.strings.programs;

public class FactorialNumber {

	
	//4! = 4*3*2*1 ---> logic here we are starting with 1 till 4
	
	public static int factorialNum(int num) {
		
		int fact=1;
		for (int i = 1; i <=num; i++) {
			fact = fact*i;//1
			
		}
		
		return fact;
	}
	
	//Recursive function : a funtion is calling itself called recursive.
	
	public static int factRecursive(int num) {
		
		if(num==0) {
			return 1;
		}else {
		
		    return num * factRecursive(num-1);
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(factorialNum(1));
		System.out.println(factorialNum(0));
		System.out.println(factorialNum(4));
		System.out.println(factorialNum(3));
		
		System.out.println("======================================");

		
		System.out.println(factRecursive(2));
		System.out.println(factRecursive(1));
		System.out.println(factRecursive(0));

	}

}
