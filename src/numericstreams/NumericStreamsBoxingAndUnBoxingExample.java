package numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingAndUnBoxingExample {

	public static List<Integer> boxing() {
		// converting Int to Integers
		return IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
	}

	public static int unBoxing(List<Integer> integerList) {
		// convert Integer to int
		return integerList.stream().mapToInt(Integer::intValue).sum();
	}

	public static void main(String[] args) {

		System.out.println("boxing :" + boxing());

		List<Integer> integerList = boxing();
		System.out.println("unBoxing :" + unBoxing(integerList));

	}

}
