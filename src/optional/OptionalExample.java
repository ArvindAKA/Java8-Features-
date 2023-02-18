package optional;

import java.util.Optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class OptionalExample {

	public static String getStudentName() {

		Student student = null;// StudentDataBase.studentSupplier.get();
		if (student != null) {
			return student.getName();
		}

		return null;
	}

	public static Optional<String> getStudentNameOptional() {

		//Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		Optional<Student> studentOptional = Optional.ofNullable(null);
		if(studentOptional.isPresent()) {
			studentOptional.get();
			return studentOptional.map(Student::getName);
		}
		return studentOptional.empty();
	}

	public static void main(String[] args) {

		/*
		 * String name = getStudentName(); if (name != null) {
		 * System.out.println("Length is :" + name.length()); } else {
		 * System.out.println("Name not found"); }
		 */
		
		Optional<String> stringOptional = getStudentNameOptional();
		if(stringOptional.isPresent()) {
			System.out.println("Length of Student Name : " + stringOptional.get().length());
		}else {
			System.out.println("Student Name not found");
		}

	}

}
