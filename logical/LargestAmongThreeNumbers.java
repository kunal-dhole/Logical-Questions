package com.logical;

public class LargestAmongThreeNumbers {
public static void main(String[] args) {
	int a=10, b=20,c=5000;
	
	
	if(a>b && a>c) {
		System.out.println(a+" is largest");
	}else if( b>a && b>c) {
		System.out.println(b+" is largest");
	}else {
		System.out.println(c+" is largest");
	}
}
}
