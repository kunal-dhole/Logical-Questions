package com.logical;
import java.util.*;
public class RemoveDuplicatesFromArray
{
public static void main(String[] args) {
	int a[]= {1,2,3,4,4,4,5};
	
	Set<Integer> set= new HashSet();
	Set <Integer> duplicates= new HashSet();
	for(int x:a) {
	  if(!set.add(x)) {
		  duplicates.add(x);  
	  }
	}
	System.out.println(duplicates);
	
}
}
