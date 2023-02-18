package com.learn.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamReduceExample {

	public static int performMultiplication(List<Integer> integerList) {
		return integerList.stream()
				// a=1, b=1, res = 1
				// a = 1, b= 3 res = 3
				// a = 3,b = 5 res = 15
				// a = 15, b= 7 res = 105
				.reduce(1, (a, b) -> a * b);

	}

	public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> intList) {
		return intList.stream().reduce((a, b) -> a * b);

	}

	public static Optional<Student> getHighestGpaStudents() {
		return StudentDataBase.getAllStudents().stream().reduce((s1, s2) -> s1.getGpa() > s2.getGpa() ? s1 : s2);
		/*
		 * if(s1.getGpa()>s2.getGpa()) { return s1; }else { return s2; } });
		 */
	}

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1, 3, 5, 7);

		List<Integer> integers2 = new ArrayList<Integer>();

		System.out.println(performMultiplication(integers));

		Optional<Integer> result = performMultiplicationWithoutIdentity(integers);

		if (result.isPresent()) {
			System.out.println(result.isPresent());
			System.out.println(result.get());
		}

		Optional<Integer> result1 = performMultiplicationWithoutIdentity(integers2);
		System.out.println(result1.isPresent());

		Optional<Student> studentOptional = getHighestGpaStudents();
		if (studentOptional.isPresent()) {
			System.out.println(studentOptional.get());
		}
	}

}
