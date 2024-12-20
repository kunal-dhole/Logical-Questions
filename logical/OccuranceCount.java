package com.logical;

public class OccuranceCount

{
public static void main(String[] args) {
	
	String s="Programming";
	char c[]=s.toCharArray();
	int targetchar='m';
	int count=0;
	for(char ch:c) {
		if(ch==targetchar) {
		count++;		
	}
		
}
	System.out.println(count);
}
}