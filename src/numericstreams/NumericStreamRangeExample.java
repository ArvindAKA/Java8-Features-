package numericstreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangeExample {

	public static void main(String[] args) {
		IntStream intStream = IntStream.range(1, 50);
		System.out.println(intStream.count());

		IntStream.range(1, 50).forEach(value -> System.out.print(value + ","));

		System.out.println("RangeClosed");
		IntStream intStreamRangeClosed = IntStream.rangeClosed(1, 50);
		System.out.println(intStreamRangeClosed.count());

		IntStream.rangeClosed(1, 50).forEach(value -> System.out.print(value + ","));

		System.out.println();

		System.out.println("LongStream Range");
		System.out.println(LongStream.range(1, 50).count());

		System.out.println("LongStream Range Closed");
		System.out.println(LongStream.rangeClosed(1, 50).count());
		LongStream.rangeClosed(1, 50).forEach(value -> System.out.print(value + ","));

		System.out.println();
		System.out.println("Double Stream");
		IntStream.rangeClosed(1, 50).asDoubleStream().
			forEach(value -> System.out.print(value + ","));

	}

}
