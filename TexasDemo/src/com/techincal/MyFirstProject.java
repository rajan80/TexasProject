package com.techincal;

import java.util.Scanner;

import org.junit.jupiter.api.Test;


public class MyFirstProject {
	
@Test
	   public void myFirstMethod(){
	Scanner src= new Scanner(System.in);
	System.out.println("Enter Array Size");
	int size = src.nextInt();
	int number[]=new  int [size];
	for (int i=0;i<number.length;i++) {
		System.out.println("enter number");
		number[i]=src.nextInt();}
	System.out.println(" Array Elements  ");
	System.out.println("----------------");
	
	for(int i=0;i<number.length;i++) {
		System.out.print(number[i]+"\t");
		
	
	}}}
	
	



