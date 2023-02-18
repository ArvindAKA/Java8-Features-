package functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	static UnaryOperator<String> uniOperator = s -> s.concat("Default");

	public static void main(String[] args) {
		System.out.println(uniOperator.apply("java8"));

	}

}
