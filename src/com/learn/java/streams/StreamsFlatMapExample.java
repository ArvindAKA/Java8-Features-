package com.learn.java.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsFlatMapExample {

	public static List<String> printStudentActivities() {

		return StudentDataBase.getAllStudents().stream()
				.map(Student::getActivities).flatMap(List::stream)
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		
		System.out.println(printStudentActivities());

	}

}
