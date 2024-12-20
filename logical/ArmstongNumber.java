package com.logical;

public class ArmstongNumber {
public static void main(String[] args) {
	int n=151;
	int digit=1;
	int sum=0;
	int temp=n;
	
	while(n>0) {
		digit=n%10;
		sum=sum+(digit*digit*digit);
		n=n/10;
		}
	if(temp==sum)
	{
		System.out.println("The Givien number is armstrong");
	}else {
		System.out.println("The givin number is not armstrong");
	}
}
}
