package com.liquidforte.java.labsix;

import java.util.Scanner;

public class LabSix {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer(A): ");
		int a = input.nextInt();
		System.out.print("Enter an integer(B): ");
		int b = input.nextInt();
		System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
		input.close();
	}
	
	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
}
