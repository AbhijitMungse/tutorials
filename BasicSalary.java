package com.abhay.core;

import java.util.Scanner;

public class BasicSalary {
	public static void main(String[] args) {
		float bs, hra, da, gs;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the basic salary: ");
		bs = sc.nextFloat();

		if (bs <= 10000) {
			hra = bs * 20 / 100;
			da = bs * 80 / 100;
		} else if (bs <= 20000) {
			hra = bs * 25 / 100;
			da = bs * 90 / 100;
		}
		else
		{
			hra = bs * 30 / 100;
			da = bs * 95 / 100;
		}
		{
			gs = bs + hra + da;

			System.out.println("gross salary is" + gs);
		}
	}
}
