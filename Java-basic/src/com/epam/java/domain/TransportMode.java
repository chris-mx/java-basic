package com.epam.java.domain;

public class TransportMode {

	/**
	 * An static variable belongs to a Class, not to any
	 * particular instance. This means that all instances (objects)
	 * of that type that we create will use the exact same
	 * copy of that variable, any change make to that variable
	 * will be reflected in all instances
	 */
	protected static int counter = 7;
	
	/**
	 * This is an instance variable, that means every object of
	 * this type that is created will have its own box variable.
	 * Since this variable is marked final, this means that
	 * we can't change that box once it has its initial value.
	 * For reference variables this means that the object's state
	 * can change, but we can't make that variable 'reference'
	 * a different object. In simple words, we can change our current 
	 * box state, but we can't use an entire new box.
	 */
	protected final CargoBox box = new CargoBox(); 
	protected static int passengers = 10;
	
	public TransportMode(){
		box.setSize(20);
	}
	
	public Object move(){
		return "Moving...";
	}
	
	/**
	 * This static method can be used outside the class
	 * without having any instance of this class, we use
	 * the name of the class to access it, in this
	 * case as 'TransportMode.printPassengers()'
	 * 
	 * You can only access directly static members from 
	 * within this method, in this case we have access
	 * to passengers static member.
	 */
	public static void printPassengers(){
		System.out.println("Original passengers = "+passengers);
	}
	
}
