package lambdas;

import java.util.function.Consumer;

public class LambdaExample1 {

	public static void main(String[] args) {

		int i = 0;

		int value = 4;
		Consumer<Integer> c1 = (i1) -> {
			System.out.println("value of i is :" + i1);
		};

		c1.accept(10);

		Consumer<Integer> c2 = (j) -> {
			System.out.println(value + j);
		};

		c2.accept(5);
	}

}
