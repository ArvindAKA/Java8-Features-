package streams_terminals;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsMappingExample {

	public static void main(String[] args) {

		List<String> namesList = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.mapping(Student::getName, Collectors.toList()));

		System.out.println("namesList " + namesList);

		Set<String> namesSet = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.mapping(Student::getName, Collectors.toSet()));

		System.out.println(" namesSet " + namesSet);

		StudentDataBase.getAllStudents().stream().
			map(Student::getName).collect(Collectors.toList());

	}

}
