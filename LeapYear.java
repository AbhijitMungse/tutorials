package com.abhay.core;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year=s.nextInt();
		if((year%400==0) || (year%4==0 && year%100!=0))
		{
			System.out.println("year is leap");
		}
		else
		{
			System.out.println("year is not leap"); 
		}
	}
}



