package com.techincal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTest1 {

	@Test
	public void test() {
		int a= 5;
		int b= 6;
		int c= a+b;
		System.out.println( c);
		assertEquals(11, c);
		
	}

}
