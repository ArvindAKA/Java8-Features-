package defaults;

import java.util.List;

public class MultiplerImpl implements Multiplier {

	@Override
	public int multiple(List<Integer> integerList) {
		return integerList.stream().reduce(1, (x, y) -> x * y);
	}
	
	public int size(List<Integer> integerList) {
		System.out.println("Inside MultiplerImpl class");
		return integerList.size();
	}

}
