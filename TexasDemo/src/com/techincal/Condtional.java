package com.techincal;

import java.util.Scanner;


public class Condtional {
     
	public static void main(String[] args) {
	Scanner scr= new Scanner(System.in);
	System.out.println("Enter number");
	int a= scr.nextInt();
	if(a>10) {
		System.out.println(" a is greather than 10");
	}else if (a< 70) {
		System.out.println(" a is less than 70");
	}
    scr.close();
	}

}
