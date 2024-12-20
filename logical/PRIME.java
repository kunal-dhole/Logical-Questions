package com.logical;

public class PRIME {
	public static void main(String[] args) {
		
	 int n=1000;
		int count=2;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;	
				break;
			}
		}
		if(count==2) {
			System.out.println(n+ " Prime number");
		}else {
			System.out.println(n+" Non Prime number");
		}
			
	}
}
