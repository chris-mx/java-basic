package com.epam.tests;

public class ExceptionExamples {

	public static void main(String[] args) {
		testExceptionHandling();
		// The exception was propagated so we have to deal with it or the program will fail at runtime because this is the first method in the stack
		try{
			testExceptionPropagation();
		}catch(Exception e){
			// We print a message here that includes the message from the exception object
			System.out.println("An exception occured when calling testExceptionPropagation method: "+e.getMessage());
		}
	}
	
	/**
	 * This method is calling an 'unsafe' method (sum).
	 * sum method declares in its signature that it MAY throw an Exception thus
	 * any code that attempts to call it has to options:
	 * 1. Handling the exception (using a try-catch block)
	 * 2. Propagate the exception (declaring throws Exception on its signature)
	 * This is an example of option 1.
	 */
	private static void testExceptionHandling(){
		/*
		 * 'Unsafe' code needs to be put within a try block.
		 * In the catch block we specify the Exceptions we want to handle, this can be ANY subclass
		 * of Throwable, such as an Error, Exception, RuntimeException or any of their subclasses.
		 * We can catch and treat more than one exception but they must be declared in order, from
		 * more specific to more general. In this example, NullPointerException is more specific than
		 * just Exception, so it's declared first. Even when sum is not declaring that it may throw
		 * a NullPointerException, this is an 'unchecked' Exception (a subclass of RuntimeException)
		 * so the compiler will not enforce the declaration of it in the method signature and we may attempt
		 * to catch a RuntimeExcepton anytime. 
		 */
		try{
			// 'Unsafe' code is within this block
			sum(1, 7);
		}catch(NullPointerException n){
			// Here is the code to be executed whenever a NullPointerExcepton occurs in the try block 
			System.out.println("A NullPointerException occured");
		}catch(Exception e){
			// Here is the code to be executed whenever an Exception or any of its subclasses occurs in the try block
			System.out.println("An Exception occured");
		}finally{
			// Finally block is ALWAYS executed (except in special circumstances such as the JVM is shutdown)
			// This code will be executed whether an exception occurs or not.
			System.out.println("This is always printed");
		}
	}
	
	/**
	 * This is an example of exception propagation.
	 * In this case we call the same 'unsafe' sum method, but we're not required to
	 * catch it because we're throwing it so the previous method on the stack (the one
	 * that called this one) deals with the problem
	 */
	private static void testExceptionPropagation() throws Exception{
		sum(-1, 7);
	}
	
	/**
	 * This code is throwing a 'checked' exception, that is Exception or any of its subclasses.
	 * Checked exceptions are required to be handle or throw.
	 * We can create custom checked exceptions by extending from Exception or any of its subclasses (except RuntimeException)
	 * We can create custom unchecked exceptions by extending from RuntimeException or any of its subclasses.
	 */
	private static Integer sum(Integer num1, Integer num2) throws Exception{
		if(num1==null || num2==null || num1<0 || num2<0)
			throw new Exception("Both numbers must be not null and positive");
		return num1 + num2;
	}
	
	
	
}


