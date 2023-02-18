package com.learn.java.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsExample {

	public static void main(String[] args) {

		Predicate<Student> studentPredicate = (s) -> s.getGradeLevel() >= 3;
		Predicate<Student> studentGpaPredicate = (s) -> s.getGpa() >= 3.9;

		Map<String, List<String>> studentMap = StudentDataBase.getAllStudents()
				.stream().peek((student -> {
			System.out.println("inside first Peek :" + student);
		})).filter(studentPredicate)
				.peek((student -> {
			System.out.println("inside second peek:" + student);
		})).filter(studentGpaPredicate)
				.peek((student->{
					System.out.println("inside 3rd peek :" + student);
				})).			
				collect(Collectors.toMap(Student::getName, Student::getActivities));

		System.out.println(studentMap);

	}

}
