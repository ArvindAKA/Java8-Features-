package com.learn.java.methodReference;

import java.util.function.Predicate;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class RefactorMethodReferenceExample {

	static Predicate<Student> p1 = RefactorMethodReferenceExample::greaterThangradeLevel;
	
	public static boolean greaterThangradeLevel(Student s) {
		return s.getGradeLevel()>=3;
	}
	

	public static void main(String[] args) {

		System.out.println(p1.test(StudentDataBase.studentSupplier.get()));

	}

}
