package com.learn.java.methodReference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

	static Function<String, String> toUppercaseLambda = (s) -> s.toUpperCase();

	static Function<String, String> toUppercaseMethodReference = String::toUpperCase;

	public static void main(String[] args) {

		System.out.println("toUppercaseLambda :" + toUppercaseLambda.apply("java8"));

		System.out.println("toUppercaseMethodReference: " + toUppercaseMethodReference.apply("default"));

	}

}
