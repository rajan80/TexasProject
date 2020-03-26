package com.techincal;

import java.util.Scanner;

public class BiggestNumber {

	public static void main(String[] args) {
	Scanner src= new Scanner(System.in);
	System.out.println("Enter the first number");
	int first= src.nextInt();
	System.out.println("Enter the second number");
	int second= src.nextInt();
	System.out.println("Enter the third number");
	int third= src.nextInt();
	if (first>second && second>third);{
		System.out.println(first +"is the biggest number");
	}
	if (second> third && second>first) {
		System.out.println(second + "is the biggest number");
	}
	else  {
		System.out.println(third + "is the biggest number");
	}

}}
