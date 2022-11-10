package com.abhay.core;

import java.util.Scanner;

public class NumberDivision {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = sc.nextInt();

		if (num % 5 == 0 && num % 11 == 0) {
			System.out.println("number is divisible by 5 and 11");
		} else {
			System.out.println("number is not divisible");
		}
	}

}
