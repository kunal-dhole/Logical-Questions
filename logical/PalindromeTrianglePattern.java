package com.logical;
import java.util.*;

public class PalindromeTrianglePattern {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int V=sc.nextInt();
	System.out.print("---->Value of V\n");
	int W=sc.nextInt();
	System.out.print("---->Value of W\n");
	
	int fourwheeler =(W-2*V)/2;
	int twowheeler =V-fourwheeler;
	System.out.println("TW = "+twowheeler);
	System.out.print("FW = "+fourwheeler);

}

}
