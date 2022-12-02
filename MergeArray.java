package com.abhay.core;

import java.util.Scanner;

public class MergeArray {
	public static void main(String[] args) {
		int first[], sec[], third[], i, k, size1, size2;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of elements to print array:");
		size1 = sc.nextInt();
		first = new int[size1];
		System.out.println("enter " + size1 + " elements in the first array ");
		for (i = 0; i < size1; i++) {
			first[i] = sc.nextInt();
		}
		// initialize the second array
		System.out.println("enter the number of elements to print array:");
		size2 = sc.nextInt();
		sec = new int[size2];
		System.out.println("enter " + size2 + " elements in the second array: ");
		for (i = 0; i < size2; i++) {
			sec[i] = sc.nextInt();
		}

		// initialize the third array
		third = new int[size1 + size2];
		// assign first array element into third array
		for (i = 0; i < size1; i++) {
			third[i] = first[i];
		}
		// assigning i value to k
		k = i;
		// assign second array element into third array

		for (i = 0; i < size2; i++) {
			third[k++] = sec[i];
		}
		// print the third array after merging
		System.out.println("And the result is after merging: ");
		for (i = 0; i < third.length; i++) {
			System.out.print(third[i] + " ");
		}
	}

}
