package com.learn.java.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class DisctinctCountSortedStreamsExample {

	public static List<String> printStudentActivities() {

		return StudentDataBase.getAllStudents().stream()
				.map(Student::getActivities)
				.flatMap(List::stream).distinct()
				.collect(Collectors.toList());
	}

	public static long getStudentActivitiesCount() {
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getActivities)
				.flatMap(List::stream).distinct().count();

	}
	
	public static List<String> getStudentActivitesSorted(){
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getActivities).flatMap(List::stream)
				.sorted().collect(Collectors.toList());
	}

	public static void main(String[] args) {
		System.out.println(printStudentActivities());
		
		System.out.println("count: " + getStudentActivitiesCount());
		
		System.out.println("Sorted :" + getStudentActivitesSorted());

	}

}
