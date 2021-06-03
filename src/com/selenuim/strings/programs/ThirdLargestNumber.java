package com.selenuim.strings.programs;

public class ThirdLargestNumber {
	
	public static int getThirdLargest(int[] a) {
	      int temp;
	      //sort the array
	      for (int i = 0; i < a.length; i++) {
	         for (int j = i + 1; j < a.length; j++) {
	            if (a[i] > a[j]) {
	               temp = a[i];
	               a[i] = a[j];
	               a[j] = temp;
	            }
	         }
	      }
	      //return third largest element
	      return a[a.length - 3];
	   }
	   public static void main(String args[]) {
	      int a[] = { 11,10,4, 15, 16, 13, 2 };
	      System.out.println("Third Largest: " +getThirdLargest(a));
	   }

}
