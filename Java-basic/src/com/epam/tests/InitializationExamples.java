package com.epam.tests;

public class InitializationExamples {

	private static String nullName;
	private static int n;
	private static char c;
	private static boolean b;
	private static double d;
	private final int n1;
	
	/*
	 * A final instance variable must be initialized before the constructor is completed.
	 * This means it could be given a literal value in the declaration or could be set
	 * during instance initialization blocks or constructors
	 */
	{
		n1 = 10;
	}
	
	public static void main(String[] args) {
		printDefaultValues();
	}
	
	/**
	 * Variables have default values, which are the values they have whenever we don't specify any other.
	 * Numeric variables have a default value of 0 or 0.0 for decimals.
	 * boolean variables are false by default.
	 * char is an empty character ' ' by default
	 * All objects are null by default
	 */
	private static void printDefaultValues(){
		System.out.println(String.format("String is %s, int is %d, char is %c, boolean is %b, double is %f", nullName, n, c, b, d));
	}
	
}


