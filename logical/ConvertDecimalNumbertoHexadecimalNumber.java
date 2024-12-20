package com.logical;
import java.util.*;

public class ConvertDecimalNumbertoHexadecimalNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal");
		int decimal=sc.nextInt();
		String s =Integer.toHexString(decimal).toUpperCase();
		System.out.println(s);
	}

}
