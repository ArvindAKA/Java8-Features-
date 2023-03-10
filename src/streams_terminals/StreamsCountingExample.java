package streams_terminals;

import java.util.stream.Collectors;

import com.learnJava.data.StudentDataBase;

public class StreamsCountingExample {
	
	public static long count() {
		return StudentDataBase.getAllStudents().stream()
				.filter(student->student.getGpa()>=3.8)
			.collect(Collectors.counting());
	}

	public static void main(String[] args) {
		
		System.out.println(count());

	}

}
