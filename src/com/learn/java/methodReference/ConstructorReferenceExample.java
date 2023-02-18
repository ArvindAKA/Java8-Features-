package com.learn.java.methodReference;

import java.util.function.Supplier;

import com.learnJava.data.Student;

public class ConstructorReferenceExample {

	static Supplier<Student> studentSupplier = Student::new;

	public static void main(String[] args) {
		System.out.println(studentSupplier.get());

	}

}
