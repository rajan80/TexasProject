package com.techincal;

import java.util.Scanner;

public class wordCount {

	// String String ="Nepal Is a My  Country";  
	static int wordcount (String String) {
		int count=0;		
		char ch[]= new char[String.length()];
		for(int i=0; i<String.length();i++){
		
			ch[i]=String.charAt(i);
			count++;}
		
		return count;}
		
		
		public static void main(String[] args) {
        String String ="I am Rajan";
         System.out.println(wordcount(String) + " words.");  

	}}


