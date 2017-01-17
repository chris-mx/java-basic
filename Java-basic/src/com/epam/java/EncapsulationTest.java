// The package is the first non-commented line in a class file
package com.epam.java;

// Imports are used to have access to classes in different packages
import com.epam.java.domain.Cat;

public class EncapsulationTest {

	/**
	 * Every application starts from a main method.
	 * In order to be identified as 'main' it needs one of the following
	 * conventions:
	 * public static void main(String[] args)
	 * public static void main(String... args)
	 */
	public static void main(String... args){
		// This is the way we create an instance of a class, the constructor is called
		Cat cat = new Cat();
		// We change the values of the class through the mutators
		cat.setAge(5);
		cat.setName("Pelusa");
		// We get the values from the class through the accessors
		System.out.println("My cat is "+cat.getAge()+" years old");
		// We call methods from that particular object (instance of a class)
		cat.pet();
		cat.breathe();
		cat.growHair();
		// This is internally calling toString() implementation
		System.out.println("Name: "+cat);
	}
	
}
