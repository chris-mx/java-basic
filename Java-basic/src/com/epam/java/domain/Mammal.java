package com.epam.java.domain;

/**
 * This abstract class inherits from another abstract class,
 * thus it's not required to implement the abstract methods from
 * its parent class
 * @author Christian_Velazquez
 *
 */
public abstract class Mammal extends Animal{

	public void growHair(){
		System.out.println("I'm hairy...");
	}
	
}
