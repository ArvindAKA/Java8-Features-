package com.learn.java.streams;

import java.util.Optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsFindAnyFirstExample {

	public static Optional<Student> findAnyStudent() {
		return StudentDataBase.getAllStudents().stream()
				.filter((student -> student.getGpa() >= 3.9)).findAny();
	}
	
	public static Optional<Student> findFirstStudent(){
		return StudentDataBase.getAllStudents().stream()
				.filter((student->student.getGpa()>=3.9))
				.findFirst();
	}

	public static void main(String[] args) {
		
		Optional<Student> optionalfindAnyStudent = findAnyStudent();
		if (optionalfindAnyStudent.isPresent()) {
			System.out.println("Foound the Student : " + optionalfindAnyStudent.get());
		} else {
			System.out.println("Student not Found!");
		}

		Optional<Student> optionalFindFisrtStudent = findFirstStudent();
		if(optionalFindFisrtStudent.isPresent()) {
			System.out.println("First Student: " + optionalFindFisrtStudent.get());
			}else {
				System.out.println("Student Not Found!");
		}
	}

}
