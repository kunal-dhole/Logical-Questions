package com.logical;

public class ArrayMissingNumber {
public static void main(String[] args) {
	
	int a[]= {11,22,44,55};
	int sum1=0;
	for(int i=0;i<a.length;i++) {
		sum1=sum1+a[i];
	}
	
	int sum2=0;
	for(int i=1;i<=5;i++) {
		sum2=sum2+i;
	
	}
	System.out.println("missing number is"+" "+(sum2-sum1));
}
}
