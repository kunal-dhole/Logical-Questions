package com.logical;

public class ArrayStringPalindrome {
public static void main(String[] args) {
	String s[]= {"dadar","madam","kunal","nitin","nayan"};
	
	for(int i=0;i<s.length;i++) {
		
		String original=s[i];
		System.out.println(original);
		StringBuilder builder= new StringBuilder();
		builder=builder.append(original);
		String reverse=builder.reverse().toString();
		
		if(original.equals(reverse)) {
			System.out.println("Given String is palaindrome"+" "  +reverse);
		}else {
			System.out.println("Givin string is not palindrome"+" "  +reverse);
		}
		
	}
}
}
