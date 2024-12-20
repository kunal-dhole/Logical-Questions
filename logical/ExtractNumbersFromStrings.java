package com.logical;

public class ExtractNumbersFromStrings {

	public static void main(String[] args) {
	
	String s="Kunal2334dhole11";
//		
		char [] c=s.toCharArray();
		for(int i=0;i<c.length;i++) {
//			if(c[i]>=48 && c[i]<=57) {
//				System.out.print(c[i]);
//			}
			
			if(c[i]>=65 && c[i]<=105) {
				System.out.println(c[i]);
			}
	}

		
	}

	}

