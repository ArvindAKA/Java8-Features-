package com.learn.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeExample2 {

	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(1, 1, 3, 3, 2, 4, 5, 5, 6, 7, 8, 8, 9, 9, 10, 10);
		/*
		 * Imperative approach
		 */

		List<Integer> uniqueList = new ArrayList<>();
		for (Integer integer : integerList) {
			if (!uniqueList.contains(integer)) {
				uniqueList.add(integer);
			}

		}

		System.out.println("Imperative uniqueList : " + uniqueList);

		List<Integer> uniqueList1 = integerList.stream().distinct().collect(Collectors.toList());
		System.out.println("Declarative : " + uniqueList1);

	}

}
