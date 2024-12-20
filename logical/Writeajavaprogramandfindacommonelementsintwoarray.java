package com.logical;

import java.util.HashSet;

public class Writeajavaprogramandfindacommonelementsintwoarray {
	
  public static void function(int []array , int[] array2) {
		
		HashSet<Integer> set= new HashSet();
		for (Integer num : array) {
	    set.add(num);
	    }
		
		for(Integer num2:array2) {
			if(set.contains(num2)) {
				System.out.println(num2);
				
			}
			
		}
  }
	
     public static void main(String[] args) {

     int array[]={2,3,4,5};
     int[] array2={7,8,4,5};
	
     function(array,array2);
	
	
}
}
