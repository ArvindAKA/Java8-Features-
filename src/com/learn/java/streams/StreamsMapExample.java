package com.learn.java.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsMapExample {

	public static List<String> nameList() {

		List<String> studentList=  StudentDataBase.getAllStudents().stream()
		.map(Student::getName)
		.map(String::toUpperCase)
		.collect(Collectors.toList());
		
		return studentList;
	}
	
	public static Set<String> studentNameSet(){
		return StudentDataBase.getAllStudents().stream()
		.map(Student::getName)
		.map(String::toUpperCase).collect(Collectors.toSet());
	}
	
	public static List<String> studentNameSorted(){
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getName).sorted().collect(Collectors.toList());
	}

	public static void main(String[] args) {
		
		System.out.println(nameList());
		System.out.println(studentNameSet());
		
		System.out.println("Sorted Name :" + studentNameSorted());

	}

}
