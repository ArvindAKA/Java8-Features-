package functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class PredicateAndConsumerExample {

	static Predicate<Student> c1 = (student) -> student.getGradeLevel() >= 3;
	static Predicate<Student> c2 = (student) -> student.getGpa() >= 3.9;
	
	static BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;

	static BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out
			.println(name + " : " + activities);

	static Consumer<Student> studentConsumer = ((student) -> {
		if (c1.and(c2).test(student)) {
			studentBiConsumer.accept(student.getName(), student.getActivities());
		}
	});

	public static void printNameAndActivities(List<Student> studentList) {
		studentList.forEach(studentConsumer);
	}

	

	static Consumer<Student> studentBiconsumer = ((student) -> {
		if (biPredicate.test(student.getGradeLevel(), student.getGpa())) {
			studentBiConsumer.accept(student.getName(), student.getActivities());

		}
	});

	public static void main(String[] args) {

		List<Student> studentList = StudentDataBase.getAllStudents();

		printNameAndActivities(studentList);
	}

}
