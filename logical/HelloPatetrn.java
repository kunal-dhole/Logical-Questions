package com.logical;
import java.util.*;

public class HelloPatetrn {
	public static void main(String[] args) {

		String s="Hello";
		for(int i=1;i<s.length();i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}System.out.println();
		}

		}
}
