package com.test.StreamCodeSamples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TerminalOperations {

	public static void main(String[] args) {
		minExample();
		findAny();
		findFirst();
		matchExamples();
		doMinAndMax();
		maxExample();
		doCollect();
		doReduce();

	}

	private static void doReduce() {
		System.out.println("\n");
		System.out.println("executing do recude method");
		Stream<String> stream = Stream.of("car", "bus", "train", "aeroplane");
		int length = stream.reduce(0, (n, str) -> n + str.length(), (n1, n2) -> n1 + n2);
		System.out.println("length is :" + length);

	}

	private static void doCollect() {
		System.out.println("\n");
		System.out.println("Executing doCollect method");
		StringBuilder word = Stream.of("ad", "jud", "i", "cate").collect(() -> new StringBuilder(),
				(sb, s1) -> sb.append(sb), (sb1, sb2) -> sb1.append(sb2));
		System.out.println(word);

	}

	private static void doMinAndMax() {
		System.out.println("\n");
		System.out.println(" executing method doMinAndMax");
		Optional<String> min = Stream.of("deer", "horse", "rabbit", "elephant", "bear")
				.min((s1, s2) -> s1.length() - s2.length());
		min.ifPresent(System.out::println);

		Optional<Integer> max = Stream.of(45, 75, 99, 129, 999, 9999, 1009, 2009, 10999).max((i1, i2) -> i1 - i2);
		max.ifPresent(System.out::println);

		Optional<String> min1 = Stream.of("cow", "horse", "pig").min((s1, s2) -> s1.length() - s2.length());
		min1.ifPresent(System.out::println);

		Optional<Integer> max1 = Stream.of(4, 6, 8, 8, 9, 9).max((i1, i2) -> i1 - i2);
		max1.ifPresent(System.out::println);

	}

	private static void matchExamples() {
		System.out.println("\n");
		System.out.println("executing matchExamples");
		List<String> names = Arrays.asList("Alan", "Gary", "Smith");
		Predicate<String> pred = name -> name.startsWith("A");
		System.out.println("anyMatch :" + names.stream().anyMatch(pred));
		System.out.println("allMatch :" + names.stream().allMatch(pred));
		System.out.println("nonaMatch :" + names.stream().noneMatch(pred));

		Stream<String> namesStream = Stream.of("Cathy", "Zoe", "Malina");
		namesStream.forEach(System.out::println);

	}

	private static void findFirst() {
		System.out.println("/n");
		System.out.println("executing findFirst");
		Optional<String> findFirst = Stream.of("Lashana Lynch", "Drew", "Elizabeth", "Liz", "Monica").findFirst();
		findFirst.ifPresent(System.out::println);
	}

	private static void findAny() {
		System.out.println("\n");
		System.out.println("executing find any");
		Optional<String> findAny = Stream.of("Rambo", "Johnny", "Terry").findAny();
		findAny.ifPresent(System.out::println);

	}

	private static void minExample() {
		System.out.println("\n");
		System.out.println("Executing method minExample");
		Optional<String> min = Stream.of("Cat", "Dog", "Pig", "Sheep", "Duck")
				.min((s1, s2) -> s1.length() - s2.length());
		min.ifPresent(System.out::println);

		System.out.println("finding Max value in a list of Integers");
		Optional<Integer> max = Stream.of(4, 6, 8, 10, 44, 55, 87, 98, 100).max((i1, i2) -> i1 - i2);
		max.ifPresent(System.out::println);

	}

	public static void maxExample() {
		System.out.println("\n");
		System.out.println("Executing maxExample");
		Optional<Integer> max = Stream.of(12, 99, 145, 87, 2, 987, 999, 1000, 5999).max((v1, v2) -> v1 - v2);
		max.ifPresent(System.out::println);
	}

}
