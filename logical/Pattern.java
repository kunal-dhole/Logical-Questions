package com.logical;

public class Pattern {
public static void main(String[] args) {
	
	int n=7;
	int i,j,k;
	
	for(i=n;i>=0;i--) {
		for(j=n-i;j>=1;j--) {
			System.out.print(" ");
		}
		for(k=0;k<=i;k++) {
			System.out.print("* ");
		}System.out.println();
	}
}
}
