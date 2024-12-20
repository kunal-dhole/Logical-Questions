package com.logical;

public class MergeArray {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	int b[] = {6,7,8,9,10};
	int c[]= new int[a.length+b.length];
	
	for(int i=0;i<a.length;i++) {
		c[i]=a[i];
		
	}
	for(int i1=0;i1<b.length;i1++) {
		c[a.length+i1]=b[i1];
		
	}	
	for(int i11=0;i11<c.length;i11++) {
		System.out.print(c[i11]);
	}
		
	}
	
}


