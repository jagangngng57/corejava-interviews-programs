package com.selenuim.strings.programs;

public class SwapWithWithoutThirdVariable {
	
	public static void main(String[] args) {
		
		
		int x= 10;
		int y =5;
		
		int t;
		t=x;
		x=y;
		y=t;
		
		
		System.out.println(x);
		
		System.out.println(y);
		
		//without using third
		
		int a=2;
		int b= 3;
		
		a =a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		
		System.out.println(b);
		
		
		//solution 3:
		
		
		int n =3;
		int s =4;
		
		n =s*n;
		s= n/s;
		n=n/s;
		
		System.out.println(n);
		System.out.println(s);
			
		
	}

}
