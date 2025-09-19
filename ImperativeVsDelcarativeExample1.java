package com.learn.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDelcarativeExample1 {
	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 8, 6, 23, 76, 88, 90, 99);

		List<Integer> uniqueList = new ArrayList<Integer>();

		for (Integer list : integerList) {
			if (!uniqueList.contains(list)) {
				uniqueList.add(list);
			}
		}
		System.out.println(uniqueList);
		
		/*
		 * declarative
		 */
		List<Integer> distinctList =   integerList.stream().distinct().collect(Collectors.toList());
		System.out.println("Distinct List : " + distinctList);

	}

}
