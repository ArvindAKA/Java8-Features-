package com.test.StreamCodeSamples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPipeLine {

	public static void main(String[] args) {
		streamExample();
		StreamOfEvenNumbers();
		findPersonAgeUsingStream();
		streamFilterExample();
		streamStringLengthExample();
		streamSortExample();
		streamSumExample();
		groupByStringLength();
		streamPartionByExample();
		streamLazinessExample();
		LazyStreamExample();
		
	}

	private static void LazyStreamExample() {
		System.out.println("\n");
		System.out.println("Executing method LazyStreamExample");
		List<String> namesList = Arrays.asList("April", "Ben", "Charlie", "David", "Christian", "Benlidus");
		namesList.stream().filter(s -> {
			System.out.println("filter1 :" + s);
			return s.startsWith("B") || s.startsWith("C");
		}).filter(s -> {
			System.out.println("filter2 :" + s);
			return s.length() > 3;
		}).limit(3).forEach(System.out::println);

	}

	private static void streamLazinessExample() {
		System.out.println("\n");
		System.out.println("executing streamLazinessExample");
		boolean namesList = Stream.of("Alex", "David","April","Edward","Micheal")
				.map(s->{
					System.out.println("map :" + s);
					return s.toUpperCase();
				}).anyMatch(s->{
					System.out.println("anyMatch :" + s);
					return s.startsWith("A");
				});
		System.out.println("namesList : " + namesList);
		
		
	}

	private static void streamPartionByExample() {
		System.out.println("/n");
		System.out.println("Executing streamPartionByExample");
		 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		 Map<Boolean, List<Integer>> partionedList = numbers.stream().collect(Collectors.partitioningBy(n->n%2==0));
		 System.out.println("partionedList :" + partionedList);
		
	}

	private static void groupByStringLength() {
		System.out.println("/n");
		System.out.println("Executing groupByStringLength");
		List<String> namesList = Arrays.asList("Bob", "Cathy", "Cindy", "Micheal", "Scea	n", "Albert", "Camelia");
		Map<Integer, List<String>> result = namesList.stream().collect(Collectors.groupingBy(String::length));
		System.out.println("result :" + result);

	}

	private static void streamSumExample() {
		System.out.println("/n");
		System.out.println("executing streamSumExample");
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int sum = numbers.stream().reduce(0, Integer::sum);
		System.out.println("sum :" + sum);

	}

	private static void streamSortExample() {
		System.out.println("\n");
		System.out.println("Example streamSortExample");
		List<Integer> numberList = Arrays.asList(5, 2, 9, 10, 88, 56, 72, 49);
		List<Integer> sortedNumberList = numberList.stream().sorted().collect(Collectors.toList());
		System.out.println("sortedNumberList :" + sortedNumberList);

	}

	private static void streamStringLengthExample() {
		System.out.println("\n");
		System.out.println("Executing streamStringLengthExample");
		List<String> namesList = Arrays.asList("Alice", "Bob", "Andy", "Michael", "Zack", "Kelly", "Christine");
		List<Integer> namesLength = namesList.stream().map(String::length).collect(Collectors.toList());
		System.out.println("namesLength :" + namesLength);

	}

	private static void streamFilterExample() {
		System.out.println("\n");
		System.out.println("Executing streamFilterExample");
		List<String> names = Arrays.asList("Alice", "Bob", "Andy", "Michael", "Zack", "Kelly");
		List<String> filteredNames = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
		System.out.println("filteredNames :" + filteredNames);

	}

	private static void findPersonAgeUsingStream() {
		System.out.println("\n");
		System.out.println("Executing findPersonAgeUsingStream");
		List<Person1> personList = Arrays.asList(new Person1("Bob", 27), new Person1("David", 24),
				new Person1("Alice", 29), new Person1("Eva", 32), new Person1("Catherine", 33),
				new Person1("Mary", 35));

		List<Person1> filterdAndSorted = personList.stream().filter(p -> p.getAge() > 25)
				.sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge())).collect(Collectors.toList());
		System.out.println("filterdAndSorted :" + filterdAndSorted);

	}

	private static void StreamOfEvenNumbers() {
		System.out.println("\n");
		System.out.println("executinh StreamOfEvenNumbers");
		List<Integer> numbers = Arrays.asList(12, 21, 45, 78, 90, 124, 56, 89, 14, 5, 71);
		List<Integer> processedNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("processedNumbers :" + processedNumbers);

	}

	private static void streamExample() {
		List<Double> temps = Arrays.asList(98.4, 100.2, 45.9, 59.88, 78.55, 105.6, 199.87);
		System.out.println("Number of Temps > 55");
		List<Double> result = temps.stream().filter(v -> v > 60.0).collect(Collectors.toList());
		System.out.println("Result is :" + result);
		System.out.println("Count is :" + result.stream().count());

	}

}
