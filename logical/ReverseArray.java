package com.logical;

import java.util.Iterator;

public class ReverseArray {
	public static void main(String[] args) {
		
	int a[]= {10,20,30,40,50};
	int b[]= new int[a.length];
	
	for(int i=0, k=a.length-1; i<a.length;k--,i++) {
		b[k]=a[i];
	}
	for(int i=0;i<b.length;i++) {
		System.out.print(b[i]);
	}
		
	}

}
