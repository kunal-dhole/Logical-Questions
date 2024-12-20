package com.logical;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupliocatesCharcter {

	public static void main(String[] args) {
		
		String s="programming";
		
		StringBuilder sb= new StringBuilder();
		
		Set<Character> set= new LinkedHashSet();
		
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		for(Character c:set) {
		
			sb.append(c);
			
		}
		
		System.out.println(sb);
	}
}
