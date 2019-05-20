// Noninstantiable utility class
package com.tr.umitsamimi.effectivejava.examples.chapter02.item04;

public class UtilityClass { //add Final for utility
	// Suppress default constructor for noninstantiability
	private UtilityClass() {
		throw new AssertionError();
	} // run time reflection
}
