package com.logical;

public class Swap {
public static void main(String[] args) {
	int a=10;
	int b=20;
	
	System.out.println("Before Swapping "+a);
	System.out.println("After Swapping "+b);
	
	a=a+b; //10+20=30
	b=a-b; //30-20=10
	a=a-b; // 30-10=20
	
	System.out.println("After Swapping "+a);
	System.out.println("After Swapping "+b);
}
}
