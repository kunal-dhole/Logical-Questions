package com.logical;

public class RotateArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8};
		for(int x:a) {
			System.out.print(x);
		}
		int temp=a[0];
		for(int i=1;i<a.length;i++) {
			a[i-1]=a[i];

		}
		a[a.length-1]=temp;

		for(int x:a) {
			System.out.print(x);
		}
	}
}