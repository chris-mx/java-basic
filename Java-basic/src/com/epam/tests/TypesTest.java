package com.epam.tests;

public class TypesTest {
	
	public static void main(String[] args){
		/*
		 * Numeric literales are by default int.
		 * Numeric literals can be represented as
		 */
		// decimal
		int numDecimal = 10;
		// hexadecimal
		int numHexa = 0X10;
		// octal
		int numOcta = 010;
		// binary
		int numBinario = 0b10;
		
		// For readability, we can use underscores to separate big numbers
		int milliseconds = 36_789_232;
		
		/*
		 * This 'cast' is necessary since 1000 is by default int and a byte type
		 * is too small to hold an int.
		 * We lose data with this kind of casting so we need to be carefull.
		 */
		byte b = (byte)1000;

		double myDouble = 10.5;
		//
		int doubleTest = (int)myDouble;
		
		// Decimal literals are double by default, we use an 'f' so the compiler is happy :) 
		float f = 13.98f;
		
		// boolean can be only true or false
		boolean isAlive = true;
		
		if(isAlive)
			System.out.println("Hello\nWorld");
		
		// char works in practice as a short, literals can be shorts, single chars,
		// escaped chars or unicode codes as the following
		char ch = '\u0031';
		
		System.out.println(ch);
		
		String greeting = "My name is...";
		float d = 8.3f;
		int n1 = (int)d;
		System.out.println(n1);
		
		byte b1 = (byte)9867;
		System.out.println(b1);
		
	}
	
}
