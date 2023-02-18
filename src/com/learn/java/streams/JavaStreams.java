package com.learn.java.streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {

	public static void main(String[] args) {
		IntStream.range(1, 10).forEach(System.out::println);
		System.out.println();

		IntStream.range(1, 10).skip(3).forEach(x -> System.out.println(x));
		System.out.println();

		System.out.println("****************sum******");
		System.out.println(IntStream.range(1, 99).sum());

		System.out.println("****************Sort findfirst******");
		Stream.of("Zak", "Yak", "ZZak")
		.sorted().findFirst().
		ifPresent(System.out::println);

		System.out.println("****************Sort******");
		Stream.of("Zak", "Yak", "ZZak", "Kathy", "Melly","Linda")
		.filter(x->x.startsWith("Z")).sorted().forEach(System.out::println);
		
		System.out.println("****************Average******");
		Arrays.stream(new int[] {2,4,6,8,10,12}).map(x->x*x).average()
		.ifPresent(System.out::println);
	}

}
