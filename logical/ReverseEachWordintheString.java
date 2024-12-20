package com.logical;

public class ReverseEachWordintheString {
	

	public static void main(String[] args) {
		
	String s="Hello World";
	
	String [] words=s.split(" ");
	
	StringBuilder reverse= new StringBuilder();
	
	for (String word : words) {
		
		for(int i=word.length()-1;i>=0;i--) {
			
		   reverse.append(word.charAt(i));
			
		} 
		reverse.append(" ");
		
	
		
	}
	System.out.println(reverse.toString().trim());
	}
		
		
	}
	
