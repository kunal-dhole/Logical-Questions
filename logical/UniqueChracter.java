package com.logical;

public class UniqueChracter {
public static void main(String[] args) {
	
	String s= "abbb";
	int check=0;
	for(int i=0;i<s.length();i++) {
		for(int j=0;j<s.length();j++) {
			if(s.charAt(i)==s.charAt(j) && i!=j ) {
				check=1;
				break;
				
			}
			
		}
		
		if(check==1) {
			System.out.println("unique");
		}else {
			System.out.println("not unique");
		}
	}
	
}
}
