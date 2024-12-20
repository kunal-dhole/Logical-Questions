package com.logical;

import java.util.Scanner;

public class VowelAndConsonant {
	static void check(char c) {
	
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			System.out.println("Vowels");
		}else {
			System.out.println("consonant");
		}
		
				
	}
	
public static void main(String[] args) {
check('v');
	
}
}