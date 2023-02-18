package numericstreams;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapExample {

	public static List<Integer> mapToObject() {

		return IntStream.rangeClosed(1, 5).mapToObj((i) -> {
			return new Integer(i);
		}).collect(Collectors.toList());
	}

	public static long mapToLong() {
		// convert IntStream to LongStream i valus is passed from Intstream
		return IntStream.rangeClosed(1, 10).mapToLong((i) -> i).sum();
	}

	public static double maptoDouble() {
		// convert IntStream to doubleStream i valus is passed from Intstream
		return IntStream.rangeClosed(1, 10).mapToDouble((i) -> i).sum();
	}

	public static void main(String[] args) {

		System.out.println("mapToObject :" + mapToObject()); 

		System.out.println("mapToLong :" + mapToLong());

		System.out.println("maptoDouble :" + maptoDouble());
	}

}
