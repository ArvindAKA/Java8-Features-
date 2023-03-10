package streams_terminals;

import static java.util.stream.Collectors.joining;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsJoningExample {

	public static String joining_1() {
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getName).collect(joining());
	}
	
	public static String joining_2() {
		return StudentDataBase.getAllStudents().stream()
			.map(Student::getName).collect(joining("-"));
	}
	
	public static String joining_3() {
		return StudentDataBase.getAllStudents().stream()
			.map(Student::getName).collect(joining("-", "(", ")"));
	}

	public static void main(String[] args) {
		System.out.println(" joining_1 : " + joining_1());
		
		System.out.println("joining_2 : " + joining_2());
		
		System.out.println( "joining_3 : "+ joining_3());
	}

}
