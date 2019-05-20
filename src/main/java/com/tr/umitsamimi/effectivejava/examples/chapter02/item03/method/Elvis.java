// Singleton with static factory - Page 17
package com.tr.umitsamimi.effectivejava.examples.chapter02.item03.method;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

public class Elvis{
	private static final Elvis INSTANCE = new Elvis();

	private Elvis() {
	}

	public static Elvis getInstance() {
		return INSTANCE;
	} //multi thread?

	public void leaveTheBuilding() {
		System.out.println("Whoa baby, I'm outta here!");
	}

	// This code would normally appear outside the class!
	public static void main(String[] args) {
		Elvis elvis = Elvis.getInstance();
		elvis.leaveTheBuilding();
	}
}
