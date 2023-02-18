package parallelStream;

import java.util.stream.IntStream;

public class SumClient {

	public static void main(String[] args) {
		
		Sum sum = new Sum();
		
		IntStream.rangeClosed(1, 1000).forEach(sum::performSum);
		
		System.out.println("sequential : " + sum.getTotal());
		
		Sum sum1 = new Sum();
		IntStream.rangeClosed(1, 1000).parallel().forEach(sum1::performSum);
		//500500 actual result
		//but parallel stream gave different result 486555, 487083 , 497349
		System.out.println("parallel : " + sum1.getTotal());
		

	}

}
