package com.techincal;

import java.util.Scanner;

public class SingleDimensionArray {

	public static void main(String[] args) {
	Scanner src=new Scanner(System.in);
	System.out.println("Enter the Array Size");
	int size= src.nextInt();
	int number[]= new int[size];
	for(int i=0;i<number.length; i++) {
		System.out.println("Enter the number");
		number[i]=src.nextInt();}
		System.out.println(" Array Elements  ");
		
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]);}}}
		
		
		
	


