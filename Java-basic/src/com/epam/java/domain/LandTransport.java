package com.epam.java.domain;

public class LandTransport extends TransportMode {

	/*
	 * This is an instance initialization block. We can have several and they
	 * are executed when we create new instances of this class (in the order
	 * they are declared)
	 */
	{
		System.out.println("In 2");
	}

	public LandTransport(String name) {
		super();
		System.out.println("My new name is memo");
	}

	/*
	 * This is a static initialization block. It's executed only once when the
	 * Class 'is loaded' by the JVM
	 */
	static {
		System.out.println("This is a static initialization block");
	}

	/**
	 * The first line in a constructor is always either a call to this() or
	 * super() (with or without parameters depending on our constructors). If we
	 * don't add any of those lines the compiler will add a super() call.
	 * Instance initialization blocks are called after the call to super has
	 * completed, after all initialization blocks have finished, the constructor
	 * will complete its execution.
	 * 
	 * this() is used to call other constructor of this class, determine from the
	 * given parameters.
	 * super() calls the constructor of the parent class. Constructors of the parent
	 * class must finish before this constructor can continue.
	 */
	LandTransport() {
		this("Memo");
	}

	{
		System.out.println("In 3");
	}

	public static void main(String[] args) {
		LandTransport landTransport = new LandTransport();
		landTransport.passengers = 100;
		landTransport.printTotalInstances();
		System.out.println(landTransport.passengers);

		LandTransport newLandTransport = new LandTransport();
		newLandTransport.passengers = 200;
		newLandTransport.printTotalInstances();
		System.out.println(newLandTransport.passengers);

		// This is a call to an static method, we don't need any instance to call it
		TransportMode.printPassengers();
		
		// However, if we use an instance it will compile, but the compiler
		// will replace the reference variable by the class name 
		newLandTransport.printPassengers();
	}

	public Integer move() {
		final int n = 10;
		// box is final, this means we can't use a different box
		// but we can change the state of that object
		box.setSize(350);
		System.out.println("Cargo size " + box.getSize());
		System.out.println("Total passengers = " + passengers);
		return new Integer(0);
	}

	public void printCargo(final CargoBox box) {
		System.out.println(box.getSize());
	}

	public void printTotalInstances() {
		System.out.println(counter);
	}

}
