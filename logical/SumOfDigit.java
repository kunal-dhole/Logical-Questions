package com.logical;

public class SumOfDigit {
public static void main(String[] args) {
	
	int n=123;
	int digit=1;
	int sum=0;
	while(n>0) {
		digit=n%10;
		sum=sum+digit;
		n=n/10;
		}
	System.out.println(sum);
}
}
