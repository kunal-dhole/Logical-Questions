package com.logical;

import java.util.Scanner;

public class ConvertOctalNumbertoBinaryNumber {

	public static void main(String[] args) {
		
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Enter a octal number");
			 String octal1= sc.nextLine();
			  int decimal1 =Integer.parseInt(octal1,8);
			 String binary=Integer.toBinaryString(decimal1);
			 System.out.println(binary);

		
		
	}

}
