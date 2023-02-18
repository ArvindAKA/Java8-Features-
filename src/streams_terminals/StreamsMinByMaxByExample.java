package streams_terminals;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsMinByMaxByExample {

	public static Optional<Student> minBy_Example() {

		// find the least GPA in the whole collection
		return StudentDataBase.getAllStudents().stream()
				.collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
	}

	public static Optional<Student> maxBy_Example() {
		return StudentDataBase.getAllStudents().stream()
				.collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
	}

	public static void main(String[] args) {
		System.out.println(minBy_Example());

		System.out.println(maxBy_Example());

	}

}
