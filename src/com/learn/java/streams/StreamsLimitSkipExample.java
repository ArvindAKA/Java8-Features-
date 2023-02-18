package com.learn.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

	public static Optional<Integer> limit(List<Integer> integersList) {
		return integersList.stream().limit(3).reduce((x, y) -> x + y);
		// first 3 elements 1, 7, 9
	}

	public static Optional<Integer> skip(List<Integer> integersList) {
		return integersList.stream().skip(2).reduce((x, y) -> x + y);
		//will skip first 2 elements 1, 7
	}

	public static void main(String[] args) {

		List<Integer> integersList = Arrays.asList(1, 7, 9, 11, 17, 24, 55, 79, 85, 93, 125);

		Optional<Integer> limitOptionalResult = limit(integersList);

		if (limitOptionalResult.isPresent()) {
			System.out.println("Limit Result is :" + limitOptionalResult.get());
		} else {
			System.out.println("No input in passed");
		}

		Optional<Integer> skipOptionalResult = skip(integersList);

		if (skipOptionalResult.isPresent()) {
			System.out.println("SKip Result is : " + skipOptionalResult.get());
		} else {
			System.out.println(" No input is passed");
		}

	}

}
