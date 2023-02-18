package functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

	static Predicate<Integer> p1 = (i) -> {
		return i % 2 == 0;
	};

	static Predicate<Integer> p2 = (i) -> i % 2 == 0;

	static Predicate<Integer> p3 = (i) -> i % 5 == 0;

	public static void predicateAnd() {
		System.out.println(p1.and(p2).and(p3).test(55));

	}

	public static void predicateOr() {
		System.out.println(p1.or(p2).or(p3).test(101));
	}

	public static void predicateNegate() {
		System.out.println(p1.or(p2).or(p3).negate().test(20));
	}

	public static void main(String[] args) {

		System.out.println(p1.test(500));

		System.out.println(p2.test(201));

		System.out.println(" predicateAnd :");
		predicateAnd();

		System.out.println(" predicateOr :");
		predicateOr();

		System.out.println(" predicateNegate :");
		predicateNegate();
	}

}
