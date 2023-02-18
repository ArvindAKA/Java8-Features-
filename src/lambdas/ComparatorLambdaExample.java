package lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

	public static void main(String[] args) {

		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		System.out.println("Result of comparator is : " + comparator.compare(5, 7));
		
		Comparator<Integer> comparatorLambda = (Integer a, Integer b)->{
			return a.compareTo(b);
		};
		
		System.out.println("comparatorLambda : " + comparatorLambda.compare(9, 6));
		
		Comparator<Integer> comparatorLambda1 = (a, b)-> a.compareTo(b);
		
		System.out.println("comparatorLambda1 : " + comparatorLambda1.compare(9, 6));

	}

}
