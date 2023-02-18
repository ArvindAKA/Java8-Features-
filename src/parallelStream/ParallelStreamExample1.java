package parallelStream;

import java.util.List;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class ParallelStreamExample1 {

	public static List<String> sequentialPrintStudentActivities() {

		long startTime = System.currentTimeMillis();
		List<String> studentActivities = StudentDataBase.getAllStudents().stream().map(Student::getActivities)
				.flatMap(List::stream).distinct().sorted().collect(Collectors.toList());

		long endTime = System.currentTimeMillis();
		System.out.println("Duration to execute in sequal manner :" + (endTime - startTime));
		return studentActivities;
	}

	public static List<String> parallelPrintStudentActivities() {

		long startTime = System.currentTimeMillis();
		List<String> studentActivities = StudentDataBase.getAllStudents().parallelStream().map(Student::getActivities)
				.flatMap(List::stream).distinct().sorted().collect(Collectors.toList());
		long endTime = System.currentTimeMillis();
		System.out.println("Duration to execute parallel manner :" + (endTime - startTime));
		return studentActivities;
	}

	public static void main(String[] args) {

		sequentialPrintStudentActivities();
		parallelPrintStudentActivities();
	}

}
