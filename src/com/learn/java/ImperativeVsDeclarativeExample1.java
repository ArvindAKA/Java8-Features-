package com.learn.java;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {

	public static void main(String[] args) {

		/*
		 * Imperative - how style of Propgramming
		 */

		int sum = 0;

		for (int i = 0; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("Sum using imperative approach : " + sum);

		/*
		 * Declarative approach
		 */

		int sum1 = IntStream.rangeClosed(0, 100).sum();
		System.out.println("Declarative approach: " + sum1);
	}

}
