package com.logical;
import java.util.*;

public class Occurance {
	
	public static void getData(String name) {

		//test---> t=2,e=1,s=1
		Map<Character,Integer> charmap= new HashMap();
		char []ch =name.toCharArray();
		for(char c:ch) {
			if( charmap.containsKey(c)) {
				charmap.put(c, charmap.get(c)+1);
			}else {
				charmap.put(c, 1);
			}
		}
		System.out.println(name+":"+ charmap);

	}
	public static void main(String[] args) {
		getData("sopannnnn");
		getData("aaaaaaaaa");
	}
}