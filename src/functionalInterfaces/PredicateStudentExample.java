package functionalInterfaces;

import java.util.List;
import java.util.function.Predicate;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class PredicateStudentExample {

	static Predicate<Student> c1 = (student) -> student.getGradeLevel() >= 3;

	static Predicate<Student> c2 = (student) -> student.getGpa() >= 3.9;

	public static void filterStudentsByGradeLevel() {

		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach((student) -> {
			if (c1.test(student)) {
				System.out.println(student);
			}

		});
	}

	public static void filterStudentByGpa() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach((student) -> {
			if (c2.test(student)) {
				System.out.println(student);
			}

		});
	}

	public static void filterStudents() {
		List<Student> studentList = StudentDataBase.getAllStudents();

		studentList.forEach((student) -> {
			if (c1.and(c2).test(student)) {
				System.out.println(student);
			}
		});
	}

	public static void filterStudentsUsingPredicateOr() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach((student) -> {
			if (c1.or(c2).test(student)) {
				System.out.println(student);
			}
		});
	}

	public static void filterStudentUsingPredicateNegate() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach((student) -> {
			if (c1.or(c2).negate().test(student)) {
				System.out.println(student);
			} else {
				System.out.println(student);
			}
		});
	}

	public static void main(String[] args) {

		filterStudentsByGradeLevel();

		System.out.println("*******filterStudentByGpa**********");
		filterStudentByGpa();

		System.out.println("*******filterStudents**********");
		filterStudents();

		System.out.println("*******filterStudentsUsingPredicateOr**********");
		filterStudentsUsingPredicateOr();

		System.out.println("*******filterStudentUsingPredicateNegate**********");
		filterStudentUsingPredicateNegate();
	}

}
