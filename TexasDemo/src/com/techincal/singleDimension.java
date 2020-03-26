package com.techincal;

import java.util.Scanner;

public class singleDimension {
	
		 static int wordcount(String string)  
	        {  
	          int count=0;  
	      
	            char ch[]= new char[string.length()];     
	            for(int i=0;i<string.length();i++)  
	            {  
	                ch[i]= string.charAt(i);  
	               // if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
	                    count++;  
	            }  
	            return count;  
	        }  
	      public static void main(String[] args) {  
	          String string ="India Is a My  Country";  
	         System.out.println(wordcount(string) + " words.");   
	    }  
	     
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	
		/*Scanner scr= new Scanner(System.in);
		System.out.println("Enter Number Size");
		int size= scr.nextInt();
		int number[]=new int [size];
		for(int i=0;i<number.length;i++) {
			System.out.println("Enter Array Number");
			number[i]=scr.nextInt();}
		System.out.println("Array Elements are");
		for(int i=0; i<number.length;i++) {
			System.out.println(number[i]+  "\t");
			
			
			
		}
		
		
	}**/


