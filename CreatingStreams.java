package com.test.StreamCodeSamples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CreatingStreams {

	public static void main(String[] args) {
		fromArray();
		fromCollection();
		creatingPrimitiveStreams();
		buildStreams();
		infiniteStreams();
		// iterate();
		iterateWithLimit();
		generate();

	}

	private static void generate() {
		System.out.println("\n");
		System.out.println("Executing generate");
		Stream<Integer> infStream = Stream.generate(() -> {
			return (int) (Math.random() * 10);
		}).limit(20);
		infStream.forEach(System.out::println);
	}

	private static void iterateWithLimit() {
		System.out.println("\n");
		System.out.println("Executing iterateWithLimit");
		System.out.println("infinite Stream limiting to 100");
		Stream.iterate(2, n -> n + 2).limit(100).forEach(System.out::println);

	}

	private static void iterate() {
		System.out.println("\n");
		System.out.println("executing method iterate:");
		Stream<Integer> intStream = Stream.iterate(2, n -> n + 2);
		intStream.forEach(System.out::println);

	}

	private static void infiniteStreams() {
		System.out.println("\n");
		System.out.println("Executing infiniteStreams");
		for (int i = 0; i <= 50; i++) {
			System.out.println(rand());
		}

	}

	private static int rand() {
		return (int) (Math.random() * 10);
	}

	private static void buildStreams() {
		System.out.println("\n");
		System.out.println("executing method buildStreams:");
		String[] cities = { "Dublin", "Berlin", "Paris" };
		Stream<String> cityStream = Stream.of(cities);
		System.out.println("cityStream :" + cityStream.count());
		System.out.println(" " + Arrays.stream(cities).count());
		List<Person1> personList = Arrays.asList(new Person1("Mark", 30), new Person1("Sarah", 25));
		Stream<Person1> personStream = personList.stream();
		System.out.println("personStream :" + personStream.count());

		Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5, 6, 7);
		System.out.println("intStream :" + intStream.count());
		System.out.println(IntStream.range(1, 100).boxed().count());
	}

	private static void creatingPrimitiveStreams() {
		System.out.println("\n");
		System.out.println("executing method creatingPrimitiveStreams:");
		int[] ia = { 1, 2, 3, 4, 5, 6 };
		double[] da = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
		long[] la = { 1L, 2L, 3L, 4L, 5L };

		IntStream intStream = Arrays.stream(ia);
		DoubleStream doubleStream = Arrays.stream(da);
		LongStream longStream = Arrays.stream(la);

		System.out.println("intStream :" + intStream.count());
		System.out.println("doubleStream" + doubleStream.count());
		System.out.println("longStream :" + longStream.count());

	}

	private static void fromCollection() {
		System.out.println("/n");
		System.out.println("Executing method fromCollection");
		List<String> stringList = Arrays.asList("Cat", "Dog", "Sheep");
		Stream<String> stream1 = stringList.stream();
		System.out.println("Number of elements are :" + stream1.count());

		Map<String, Integer> namesToAges = new HashMap<>();
		namesToAges.put("Alice", 24);
		namesToAges.put("mary", 28);
		namesToAges.put("Mike", 30);
		namesToAges.put("Kelly", 32);
		System.out.println("Number of Entrier :" + namesToAges.entrySet().stream().count());

	}

	private static void fromArray() {
		System.out.println("\n");
		System.out.println("executing fromArray");
		Double[] numbers = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Stream<Double> stream1 = Arrays.stream(numbers);
		long n = stream1.count();
		System.out.println("Number of elements  :" + n);

		Stream<Double> stream2 = Stream.of(numbers);
		System.out.println("Number of elements :" + stream2.count());

		Stream<String> stream3 = Stream.of("Australia", "New Zealand", "Monaco");
		System.out.println("Number of elements :" + stream3.count());

	}

}
