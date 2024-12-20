package com.logical;

import java.util.Arrays;

public class ArrayDeleteElement {
public static void main(String[] args) {
	
	int a[]= {10,20,30,40,50};
	
	int pos=1;
	
	for(int i=pos-1;i<a.length-1;i++) {
		a[i]=a[i+1];
		
	}
	System.out.println(Arrays.toString(a));
	
	for(int i=0;i<a.length-1;i++) {
		System.out.println(a[i]);
	}
}
}
