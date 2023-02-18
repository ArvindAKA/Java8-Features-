package com.learn.java.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsComparatorExample {

	public static List<Student> sortStudentsByName() {
		return StudentDataBase.getAllStudents().stream()
				.sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());
	}
	
	public static List<Student> sortStudentByGpa(){
		return StudentDataBase.getAllStudents().stream()
				.sorted(Comparator.comparing(Student::getGpa))
				.collect(Collectors.toList());
	}
	
	public static List<Student> sortStudentsByGpaReversed(){
		return StudentDataBase.getAllStudents().stream()
				.sorted(Comparator.comparing(Student::getGpa).reversed())
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		
		System.out.println("Sorted Students By Name");
		
		sortStudentsByName().forEach(System.out::println);
		
		System.out.println("Sorted by Gpa");
		
		sortStudentByGpa().forEach(System.out::println);
		
		System.out.println("Reverse Sorting Desc");
		
		sortStudentsByGpaReversed().forEach(System.out::println);

	}

}
