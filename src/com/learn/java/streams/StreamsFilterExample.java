package com.learn.java.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsFilterExample {
	
	public static List<Student> filterStudentsByGender(){
		return StudentDataBase.getAllStudents().stream()
				.filter((student->student.getGender().equals("female")))
				.filter((student->student.getGpa()>=3.6))//you can add n number of filters
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {

		filterStudentsByGender().forEach(System.out::println);
	}

}
