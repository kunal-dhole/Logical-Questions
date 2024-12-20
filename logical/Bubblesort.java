package com.logical;

import java.util.Arrays;

public class Bubblesort {
public static void main(String[] args) {
	
	int a[]= {50,20,30,40,52};
	int size=a.length;
	Bubblesort.sort(a,size);
	System.out.println(Arrays.toString(a));
}

private static void sort(int[] a, int size) {
	
	for(int i=0;i<=size-1;i++) {
		for(int j=i+1;j<size;j++) {
			if(a[i]>a[j]) {
				int temp;
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
}	
}
