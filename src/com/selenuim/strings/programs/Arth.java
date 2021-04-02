package com.selenuim.strings.programs;

import java.util.ArrayList;

public class Arth {

	
	public static void main(String[] args) {
		
		
		ArrayList s1 = new ArrayList();
		
		s1.add("JAGDA");
		s1.add("TSTE");
		s1.add("1212");
		
		
		s1.remove(0);
		
		ArrayList s2 = new ArrayList<>();
		
		s2.add(20);
		s2.add(30);
		s2.add(40);
		s2.add(1);
		s2.add(2);
		
		
		s2.remove(1);
		s2.remove(2);
		
		System.out.println(s2);
		System.out.println(s1);
		
		int num ;
		
		
		
		
		try {
			
			num = 18/0;
			
			System.out.println(num);
			
		}catch(Exception e) {
			
			System.out.println(-1);
			
		}finally {
			System.out.println(0);
		}
	}
}
