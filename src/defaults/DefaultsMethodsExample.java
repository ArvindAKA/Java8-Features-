package defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultsMethodsExample {

	public static void main(String[] args) {
		/*
		 * Sort the list of String in Alphabetical order
		 */

		List<String> stringList = Arrays.asList("Adam", "Erik", "Zack", "Mike", "Xylan", "Jenny", "Tyson", "Tupac");

		/*
		 * Prior java 8
		 */

		/*
		 * Collections.sort(stringList);
		 * System.out.println("Sorted List using Collections.sort" + stringList);
		 */

		/*
		 * Java 8
		 */

		stringList.sort(Comparator.naturalOrder());

		System.out.println("Sorting using java8 :" + stringList);

		stringList.sort(Comparator.reverseOrder());

		System.out.println(" Reverse Sorting using java8 :" + stringList);

	}

}
