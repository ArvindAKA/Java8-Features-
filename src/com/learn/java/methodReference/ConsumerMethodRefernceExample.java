package com.learn.java.methodReference;

import java.util.function.Consumer;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class ConsumerMethodRefernceExample {

	/*
	 * Classname::methodName
	 */
	static Consumer<Student> c1 = System.out::println;

	/*
	 * Classname::instancemethodName
	 */
	static Consumer<Student> c2 = Student::printListofActivities;

	public static void main(String[] args) {

		StudentDataBase.getAllStudents().forEach(c1);

		StudentDataBase.getAllStudents().forEach(c2);
	}

}
