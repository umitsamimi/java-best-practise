package com.tr.umitsamimi.effectivejava.examples.chapter02.item05;

public class Sum {
	private static long sum() {
		/*
			Autoboxing: Converting a primitive value into an object of the corresponding wrapper class
			is called autoboxing

			Best solution is var (JAVA 10)
		 */
		Long sum = 0L; // use long : Autoboxing
		for (long i = 0; i <= Integer.MAX_VALUE; i++)
			sum += i;
		return sum;
	}

	public static void main(String[] args) {
		int numSets = 10;
		long x = 0;

		for (int i = 0; i < numSets; i++) {
			long start = System.nanoTime();
			x += sum();
			long end = System.nanoTime();
			System.out.println((end - start) / 1_000_000. + " ms.");
		}

		// Prevents VM from optimizing away everything.
		if (x == 42)
			System.out.println();
	}
}
