package generalcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortThis {
	public static void main(String[] args) {
		int arr[] = { 1, 0, 0, 1, 1, 2, 3, 2, 3 };
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
			
		List<String> namesList = new ArrayList<String>();
				namesList.add("Alice");
				namesList.add("Bob");
				namesList.add("Zen");
				namesList.add("Yak");
				namesList.add("Red");
				
				Collections.reverse(namesList);
				System.out.println("Reverse List : " + namesList);
				System.out.println("Before Sorting List :" + namesList);
				List<String> sortedList = namesList.stream()
						.sorted().collect(Collectors.toList());
				System.out.println("After Sorting List :" + sortedList);
		
	}

}
