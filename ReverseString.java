package com.abhay.core;

public class ReverseString {
public static void main(String[] args) {
	String name="Abhijit";
	int leng=name.length();
	String rev="";
	for(int i=leng-1;i>=0;i--)
	{
		rev=rev+name.charAt(i);
	}
	System.out.println("reverse of "+ name + " is :" +rev);
}
}
