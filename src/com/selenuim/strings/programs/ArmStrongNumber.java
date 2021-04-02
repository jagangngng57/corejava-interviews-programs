package com.selenuim.strings.programs;

public class ArmStrongNumber {

	//153 ----> 1*1*1 5*5*5 3*3*3 ----> o/p 153
	
	//407 ---> 4*4*4  0*0*0 7*7*7  --->o/p should be 407
	//0 also
	//1 also
	
	public static void isArmStrongNumber(int num) {
		
		int cube =0 ;
		int reminder;
		int original;
		original = num;
		while(num>0) {			
			reminder = num%10;//Getting the number reminder			
			cube = cube+(reminder*reminder*reminder);
			num = num/10;
		}
		
		if(original ==cube) {
			System.out.println("Given Number is Armstrong");
			
		}else {
			System.out.println("Given number is Not armstrong");
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		isArmStrongNumber(153);
		
		isArmStrongNumber(154);
		
		isArmStrongNumber(0);
		
		isArmStrongNumber(1);

	}

}
