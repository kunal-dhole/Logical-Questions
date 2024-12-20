package com.logical;

public class ArrayRotatedRight {

	public static void main(String[] args) {
	
		int a[]= {1,2,3,4,5,6,7};
		for(int x:a) {
			System.out.println(x);
			
		}
		int temp=a.length-1;
		for(int i=a.length-1;i>=1;i--) {
			a[i-1]=a[i];
		}
		a[a.length-1]=temp;
		for(int x:a) {
			System.out.print(x);
		}
	}

}
