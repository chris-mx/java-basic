package com.epam.java.domain;

/**
 * Interfaces are contracts that our classes make with the outside world, any
 * concrete (non-abstract) class that implements the interface must have an
 * implementation for every method defined in the interface(s) it implements.
 * 
 * @author Christian_Velazquez
 *
 */
public interface Pettable {

	/**
	 * Interfaces can't have variables, only constants and all constants in java
	 * are declared as static and final. By default, all constants in an
	 * interface are marked as public, static and final, even if we don't type
	 * such modifiers (compiler will add the missing modifiers if necessary).
	 * 
	 * For this reason, the following declarations are equivalent.
	 */
	public static final boolean SOFT = true;
	boolean IS_ALIVE = true;

	/**
	 * All methods in an interface are public and abstract even if we don't type
	 * such modifiers (compiler will add the missing modifiers if necessary).
	 * This is a full typed signature
	 */
	public abstract void pet();

	/**
	 * This is a declaration with no modifiers. After compilation, both
	 * declarations have the same modifiers
	 */
	boolean checkIfAnimal();

	/**
	 * As of Java 8 we can add default implementation for methods using the
	 * default keyword
	 */
	default String getType() {
		return "This is a test string";
	}

}
