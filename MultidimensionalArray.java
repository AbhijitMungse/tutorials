package com.abhay.core;
import java.util.Scanner;

public class MultidimensionalArray {
public static void main(String[] args) {
	int arr[][],row,col,i,j;
	System.out.println("enter the row: ");
	Scanner sc=new Scanner(System.in);
	row=sc.nextInt();
	
	System.out.println("enter the col: ");
	col=sc.nextInt();
	
	arr=new int[row][col];
	System.out.println("enter elements in"+row+"x"+col+" form: ");
	
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		{
			arr[i][j]=sc.nextInt();
		}
	}
	System.out.println("elements are: ");
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	
}
}
