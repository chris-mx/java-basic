package com.epam.java;

public class ClassVisibility {

	/**
	 * This is a private method, so it can only be accessed
	 * within the same class that defines it
	 */
	private void useEncapsulationTest(){
		EncapsulationTest encapsulationTest = new EncapsulationTest();
		encapsulationTest.printHello();
	}
	
}
