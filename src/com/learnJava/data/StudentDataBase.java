package com.learnJava.data;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class StudentDataBase {

	public static Supplier<Student> studentSupplier = () -> {
		Bike bike = new Bike();
		bike.setName("ABC");
		bike.setModel("XYZ");
		Student student = new Student("Adams", 2, 3.6, "male", Arrays.asList("swimming", "basketball", "volleyball"), 11);
		student.setBike(Optional.ofNullable(bike));
		return student;
	};

	/**
	 * Total of 6 students in the database.
	 * 
	 * @return
	 */
	public static List<Student> getAllStudents() {

		/**
		 * 2nd grade students
		 */
		Student student1 = new Student("Adam", 2, 3.6, "male", Arrays.asList("swimming", "basketball", "volleyball"),
				9);
		Student student2 = new Student("Jenny", 2, 3.8, "female", Arrays.asList("swimming", "gymnastics", "soccer"), 6);
		/**
		 * 3rd grade students
		 */
		Student student3 = new Student("Emily", 3, 4.0, "female", Arrays.asList("swimming", "gymnastics", "aerobics"),
				12);
		Student student4 = new Student("Dave", 3, 3.9, "male", Arrays.asList("swimming", "gymnastics", "soccer"), 5);
		/**
		 * 4th grade students
		 */
		Student student5 = new Student("Sophia", 4, 3.5, "female", Arrays.asList("swimming", "dancing", "football"),
				13);
		Student student6 = new Student("James", 4, 3.9, "male",
				Arrays.asList("swimming", "basketball", "baseball", "football"), 15);

		Student student7 = new Student("Xander", 4, 3.8, "male", Arrays.asList("swimming", "dancing", "football"), 3);
		Student student8 = new Student("Zack", 3, 4.2, "female", Arrays.asList("swimming", "dancing", "football"), 4);

		List<Student> students = Arrays.asList(student1, student2, student3, student4, student5, student6, student7,
				student8,null);
		return students;
	}
}
