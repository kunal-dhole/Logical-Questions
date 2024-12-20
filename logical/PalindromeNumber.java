package com.logical;

public class PalindromeNumber {
public static void main(String[] args) {
	int n=123,temp,rev=0;
	int digit=1;
	temp=n;
	while(n>0) {
		digit=n%10;
		rev=rev*10+digit;
		n=n/10;	
	}
	if(temp==rev) {
		System.out.println("Palindrome number");
	}else {
		System.out.println("Not palindrome number");
	}
}
}
