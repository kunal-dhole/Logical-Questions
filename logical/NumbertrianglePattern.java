package com.logical;

public class NumbertrianglePattern {

	public static void main(String[] args) {
		
		int i,j;
		for(i=1;i<=6;i++) {
			for(j=1;j<=6-i;j++) {
				System.out.print(" ");
			}
			 for(int k=1;k<=i;k++) {
				System.out.print("*"+" ");
			} System.out.println();
		}
		
	} 
	
		
	}	
	

