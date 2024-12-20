package com.logical;

public class StringPalindrome {
public static void main(String[] args) {
	
	String s="MADAM";
	
	char ch[]=s.toCharArray();
	
	char []revch=new char[ch.length];
	
	for(int i=0, k=ch.length-1;i<ch.length;k--,i++) {
		ch[k]=ch[i];
	}
	String s1= new String(ch);
	
	if(s.equals(s1)) {
		System.out.println("palindrome");
	}else {
		System.out.println("not palindrome");
	}
}
}