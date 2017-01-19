package com.epam.java.domain;

import com.epam.java.EncapsulationTest;

/**
 * This is a concrete (non-abstract class) that extends from an
 * abstract class and implements two interfaces.
 * Because of this, this class needs to provide implementation
 * for all the abstract methods declared on its super classes or
 * in the interfaces it's implementing (unless it already inherits such
 * implementation from any super class).
 * A class can extend only from one class but can implement N
 * interfaces.
 * An interface can extend from N interfaces.
 * @author Christian_Velazquez
 *
 */
public class Cat extends Mammal implements Pettable, Walkable{

	/**
	 * This class is encapsulated. As general rules, we provide encapsulation by:
	 * 1. Making fields private
	 * 2. Providing accessor (getters) and mutator (setters) methods
	 * This methods as well as classes and variables follow naming conventions. 
	 */
	private String name;
	private String colour;
	private int age;
	
	/**
	 * If we don't provide a constructor, the compiler will add a default one
	 * such as this.
	 * Before anything else, the constructor call its super class constructor
	 * using super() (this changes a bit when constructor has parameters).
	 * The parent class calls its super class' constructor as well and so on
	 * until Object class constructor is executed and then all classes down the 
	 * inheritance three are executed. 
	 */
	public Cat(){
		super();
	}
	
	public boolean checkIfAnimal() {
		return true;
	}
	
	public void breathe(){
		super.breathe();
		System.out.println("Heavy breathing...");
	}
	
	public void move(){
		System.out.println("Moving like a cool cat...");
	}
	
	public void takeForAWalk(){
		System.out.println("Walkable...");
	}
	
	public void pet(){
		System.out.println("Petting...");
	}
	
	public void eat(){
		System.out.println("Eating...");
	}
	
	public void meow(){
		System.out.println("Meow!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getAge() {
		return age;
	}

	/**
	 * Providing getters and setters we hide data and are able to control the
	 * access to the internal state of the class. This is helpful for instance
	 * to enforce validations.
	 */
	public void setAge(int age) {
		if(age<1 || age>15)
			throw new IllegalArgumentException("The age must be between 1 and 15");
		this.age = age;
	}
	
	/**
	 * All classes in Java extend from class Object (except Object itself)
	 * Thus, all classes inherit methods from it such as toString()
	 */
	public String toString(){
		return "My name is "+name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Cat){
			Cat cat = (Cat)obj;
	        return this.name.equals(cat.getName());
		}
		return false;
    }
	
}
