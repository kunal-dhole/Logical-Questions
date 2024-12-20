package com.logical;

import java.util.Scanner;

public class ConvertDecimalNumbertoBinaryNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal Number");
         int decimal=sc.nextInt();
      String ss  = Integer.toBinaryString(decimal);
      System.out.println(ss);
	}

}
