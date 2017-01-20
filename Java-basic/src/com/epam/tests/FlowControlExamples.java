package com.epam.tests;

public class FlowControlExamples {

	private static String name;
	/*
	 * Arrays are structures that hold N elements.
	 * Arrays itself are objects on the heap
	 * The following is an example of an array declaration and initialization, size is not required because it's 
	 * inflicted from the number of specified elements
	 */
	private static String[] names = new String[]{"Charles", "Maria", "Louis"};
	
	public static void main(String[] args) {
		printNameWithIf();
		printNameWithSwitch();
		testWhileLoop(-1);
		testDoWhileLoop(-1);
		testForLoop();
		testNewForLoop();
		
	}
	
	/**
	 * Flow control. if-else example
	 */
	private static void printNameWithIf(){
		if(name==null){
			System.out.println("name has not been initialized");
		}else if(name.equals("Luis")){
			System.out.println("name is Luis");
		}else if(name.equals("Maria")){
			System.out.println("name is Maria");
		}else{
			System.out.println("Name is "+name);
		}
		// We can also use a ternary operator, such as the following
		boolean condition = 1<3;
		String message = condition ? "This is executed if condition is true" : "This is executed if condition is false";
		System.out.println(message);
	}
	
	/**
	 * Flow control. switch example.
	 * Remember that the 'case' is only an entry point, this means that once a case is successful
	 * code will continue the execution of the following cases until it founds a 'break' instruction
	 * or the switch statement is completed
	 */
	private static void printNameWithSwitch(){
		if(name==null){
			return;
		}
		// char, byte, short, int, enum and String are valid in switch checking
		switch(name){
			case "Luis":{
				System.out.println("name is Luis");
			}
			case "Maria":{
				System.out.println("name is Maria");
				// switch execution will stop here
				break;
			}
			default:{
				System.out.println("The name is "+name);
			}
		}
	}

	/**
	 * Flow control. while example.
	 * It executes the code while a condition is true.
	 */
	private static void testWhileLoop(int number){
		while(number>0){
			System.out.println(number);
			number--;
		}
	}
	
	/**
	 * Flow control. do-while example.
	 * Similar to while but this will execute the code at least once and will start checking
	 * the condition after the first execution
	 */
	private static void testDoWhileLoop(int number){
		do{
			System.out.println(number);
			number--;
		}while(number>0);
	}
	
	/**
	 * Flow control. for example.
	 * We use a for mostly when we know how many times the code will be executed.
	 * The for has three parts. Initialization, condition checking and iteration
	 */
	private static void testForLoop(){
		for(int i = 20; i<=30 ; i++){
			System.out.println(i);
		}
	}
	
	/**
	 * Flow control. 'New' for example.
	 * We use a for mostly when we know how many times the code will be executed.
	 * The for has three parts. Initialization, condition checking and iteration
	 */
	private static void testNewForLoop(){
		for(String currentName : names){
			System.out.println(currentName);
		}
	}
	
}


