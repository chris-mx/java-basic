package com.epam.java.domain;

/**
 * Abstract classes can't be directly instantiated.
 * They are created to be extended. Unlike interfaces, abstract
 * classes can hold state (variables) and can have both abstract
 * and non-abstract methods, but even if one method in a class
 * is abstract, the whole class needs to be marked as abstract.
 * @author Christian_Velazquez
 *
 */
public abstract class Animal {

	private int age;
	
	public void breathe(){
		System.out.println("Breathing...");
	}
	
	/**
	 * Abstract methods have no implementation.
	 * The signature ends up with a semicolon instead of curly braces.
	 * The first concrete (non-abstract) class that inherits from this
	 * class will have to provide or inherit from an intermediate class
	 * in the inheritance tree, the implementation for this method.
	 */
	public abstract void move();

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
