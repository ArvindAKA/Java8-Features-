package com.learn.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {

	public static int findMaxValue(List<Integer> integerList) {
		return integerList.stream().reduce(0, (x, y) -> x > y ? x : y);
		// .reduce(0, Integer::max);
	}

	public static Optional<Integer> findMaxValueOptional(List<Integer> integerList) {
		return integerList.stream().reduce((x, y) -> x > y ? x : y);
	}

	public static Optional<Integer> findMinValue(List<Integer> integerList) {
		return integerList.stream().reduce((x, y) -> x < y ? x : y);
	}

	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(5, 15, 79, 99, 999, 1235, 1236);

		List<Integer> integerList1 = new ArrayList<Integer>();

		System.out.println(findMaxValue(integerList1));

		Optional<Integer> maxvalueOptional = findMaxValueOptional(integerList);

		if (maxvalueOptional.isPresent()) {
			System.out.println("Max Value is " + maxvalueOptional.get());
		} else {
			System.out.println("Input List is empty");

		}

		Optional<Integer> minValue = findMinValue(integerList1);
		if (minValue.isPresent()) {
			System.out.println("Min Valus is : " + minValue.get());
		} else {
			System.out.println("Input List is Empty");
		}

	}

}
