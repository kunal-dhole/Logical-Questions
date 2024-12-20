package com.logical;

public class StringAnagram {
public static void main(String[] args) {
	
	String s1="SLIENT";
	String s2="LISTEN";
	int count=0;
	if(s1.length()==s2.length()) {
	
		char []ch1 = s1.toCharArray();
		char[]ch2 = s2.toCharArray();
		
		for(int i=0;i<ch1.length;i++) {
			for(int j=0;j<ch2.length;j++) {
				if(ch1[i]==ch2[j]) {
					count++;
				}
					
				}
			}
		
		if(count==s1.length()) {
			System.out.println("Both strings are anagaram");
		}else {
			System.out.println("Both strings are not anagram");
		}
		
		
	}else {
		System.out.println("Both are not anagram strings");
	}
	
	
}
}
