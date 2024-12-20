package com.logical;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
	
		String s="SLIENT";
		String s1="LISTEN";
		int count=0;
		if(s.length()==s1.length()) {
		char ch1[]=s.toCharArray();
		char ch2[]=s1.toCharArray();
		  for(int i=0;i<ch1.length;i++) {
			  for(int j=0;j<ch2.length;j++) {
				  if(ch1[i]==ch2[j]) {
					count++;  
				  }
			  }
		  }
		if(count==s1.length()) {
			System.out.println("anagram string");
		}else {
			System.out.println("not anagram string");
		}
	}else {
		System.out.println("Both are not anagram");
		
	}
	
}
}
