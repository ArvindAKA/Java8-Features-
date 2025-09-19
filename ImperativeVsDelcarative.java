package com.learn.java;

import java.util.stream.IntStream;

public class ImperativeVsDelcarative {
	public static void main(String[] args) {
		// Imperaitve Style

		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);

		// Delcarative

		int sum1 = IntStream.rangeClosed(0, 100).sum(); 
		System.out.println(" Delcarative Sum :" + sum1);
	}

}
