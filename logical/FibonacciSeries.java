package com.logical;

public class FibonacciSeries {
public static void main(String[] args) {
	
	int a=0;
	int b=1;
	int c=0;
	for(int i=2;i<=10;i++) {
		a=b;
		b=c;
		c=a+b;
		System.out.print(c+" ");
	}
}
}
