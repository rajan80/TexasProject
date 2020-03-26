package com.techincal;

import java.util.Scanner;

public class TwoDimensonArray {

	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);
		System.out.println("Enter Row");
		int rowsize=src.nextInt();
		System.out.println("Enter Column");
		int colsize=src.nextInt();
		int matrix[][]= new int [rowsize][colsize];
		for (int i=0; i<rowsize;i++) {
			for(int j=0;j<colsize;j++) {
				System.out.println("Enter Matrix");
				matrix[i][j]=src.nextInt();
		}}
		
		
         System.out.println(" Matrix Elements are");
         System.out.println("********************");
         for (int i=0;i<rowsize;i++) {
        	 for (int j=0; j<colsize;j++) {
        		 System.out.print(matrix [i][j]+"\t");
        		
        		 		
         }
        	 System.out.println();
	}

}}
