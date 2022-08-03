package com.selenuim.map.collections;

public class WithoutCollectSort {
	
	public static void main(String[] args) {
		
		
		Integer[] list={3,5,100,8,17,19};

		   for(int i=0;i<list.length;i++){

		       for(int j=i+1;j<list.length;j++){

		           Integer tempI=list[i];
		           Integer tempJ=list[j];

		           if(tempI>tempJ){
		             list[i]=tempJ;
		             list[j]= tempI;

		           }

		           }
		       }

		   for(Integer a:list){
		       System.out.println(""+a);
		   }
	}

}
