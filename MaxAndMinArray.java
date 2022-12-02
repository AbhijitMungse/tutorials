package com.abhay.core;

public class MaxAndMinArray {
	public static void main(String[] args) {
		int[] a = { 4, 3, 5, 2, 1, 6 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}

		}
		System.out.println("max no is: " + max);
		// for min value of array

		int min = a[0];
		for (int j = 0; j < a.length; j++) {
			if (a[j] < min) {
				min = a[j];
			}
		}
		System.out.println("min no is: " + min);
	}
}
