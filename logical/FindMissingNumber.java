package com.logical;

public class FindMissingNumber {
	
public static int findMissingNumber(int []array, int n) {
	
	int totalSum=n*(n+1)/2;	
	
	int arraySum=0;
	
	for(int sum:array) {
		arraySum=arraySum+sum;
	}
	
	return totalSum-arraySum;	
}
		
public static void main(String[] args) {
	
	int[] array= {1,2,3,5,6,7,8,9};
	int n=9;
	
	int missingNumber=findMissingNumber(array,n);
	System.out.println(missingNumber);
	
}
}
