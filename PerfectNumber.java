package com.abhay.core;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range:");
		int n=sc.nextInt();
		int num, sum = 0;
		for (num=1;num<n;num++) 
		{
			for(int j=1; j<=num-1;j++) 
			{
				if (num%j==0) 
				{
					sum=sum+j;
				}
			}
			if(sum==num) 
			{
				System.out.println(sum);
			}
			sum=0;
		}

	}
}


