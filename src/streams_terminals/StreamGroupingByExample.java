package streams_terminals;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamGroupingByExample {

	public static void groupStudentsByGender() {

		Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGender));
		System.out.println(studentMap);
	}

	public static void customizedGroupingBy() {
		Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(student -> student.getGpa() >= 3.7 ? "OUTSTANDING" : "AVERAGE"));

		System.out.println(studentMap);
	}

	public static void twoLevelGrouping() {
		Map<Integer, Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel,
						Collectors.groupingBy(student -> student.getGpa() >= 3.7 ? "OUTSTANDING" : "AVERAGE")));

		System.out.println(studentMap);
	}

	public static void twoLevelGrouping1() {

		Map<Integer, Integer> studentMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.summingInt(Student::getNoteBooks)));

		System.out.println(studentMap);
	}

	public static void twoLevelGrouping2() {

		Map<String, Integer> studentMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getName, Collectors.summingInt(Student::getNoteBooks)));

		System.out.println(studentMap);
	}

	public static void threeArgumentGroupBy() {

		LinkedHashMap<String, Set<Student>> studentLinkedhashMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new, Collectors.toSet()));

		System.out.println(studentLinkedhashMap);
	}

	public static void calculateTopGpa() {
		

		Map<Integer, Optional<Student>> studentOptional = StudentDataBase.getAllStudents().stream().collect(
				Collectors.groupingBy(Student::getGradeLevel, Collectors.maxBy(Comparator.comparing(Student::getGpa))));

		System.out.println("calculateTopGpa :: studentOptional " + studentOptional);
		
		
		Map<Integer, Student> studentOptional1 = StudentDataBase.getAllStudents().stream()
			.collect(Collectors.groupingBy(Student::getGradeLevel, 
					Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));
		
		System.out.println("");
		System.out.println("calculateTopGpa :: studentOptional1 :" + studentOptional1);
		
	}
	
	
	public static void calculateLeastGpa() {
		Map<Integer, Optional<Student>> studentOptional1 =  StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel, 
				Collectors.minBy(Comparator.comparing(Student::getGpa))));
		
		System.out.println("");
		System.out.println("calculateLeastGpa :: studentOptional1 " + studentOptional1);
		System.out.println("");
		
		Map<Integer, Student> studentMapOptional = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel, 
						Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Student::getGpa)), Optional::get)));
		
		System.out.println("");
		System.out.println("calculateLeastGpa :: studentMapOptional " + studentMapOptional);
		System.out.println("");
	}
	
	

	public static void main(String[] args) {
		// groupStudentsByGender();

		// customizedGroupingBy();

		// twoLevelGrouping();

		// twoLevelGrouping1();

		// twoLevelGrouping2();

		// threeArgumentGroupBy();

		calculateTopGpa();
		
		calculateLeastGpa();

	}

}
