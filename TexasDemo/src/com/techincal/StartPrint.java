package com.techincal;

import java.util.Scanner;

public class StartPrint {

	public static void main(String[] args) {
	
	Scanner src= new Scanner(System.in);
	System.out.println("Enter Size");
	
	int size= src.nextInt();
	for(int i=1; i<=size; i++) {
		for (int j=1; j<=i; j++) {
			
			System.out.print("*");}
			System.out.println();
}}}
