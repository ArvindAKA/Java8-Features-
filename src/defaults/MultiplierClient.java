package defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {
	public static void main(String[] args) {
		
		Multiplier multipler = new MultiplerImpl();
		List<Integer> integerList = Arrays.asList(1, 3, 5);
		System.out.println("Result is : " + multipler.multiple(integerList));
		System.out.println("Default method size is : " + multipler.size(integerList));
		System.out.println("Static methhod is isEmpty: "+ Multiplier.isEmpty(integerList));
		
	}

}
