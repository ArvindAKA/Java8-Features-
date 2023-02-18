package functionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class ConsumerExample {

	static Consumer<Student> c2 = (student) -> System.out.println(student);
	static Consumer<Student> c3 = (student) -> System.out.print(student.getName());
	static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());
	List<Student> studentList = StudentDataBase.getAllStudents();

	public static void printName() {
		Consumer<Student> c2 = (student) -> System.out.println(student);

		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(c2);

	}

	public static void printNameAndActivities() {
		
		System.out.println("***********printNameAndActivities************");

		List<Student> studentList = StudentDataBase.getAllStudents();

		studentList.forEach(c3.andThen(c4));// consumer Chaining
	}

	public static void printNameAndActivitiesUsingCondition() {
		
		System.out.println("***********printNameAndActivitiesUsingCondition************");
		List<Student> studentList = StudentDataBase.getAllStudents();
		
		studentList.forEach(((student) -> {
			if (student.getGradeLevel() >= 3 &&student.getGpa()>=3.7) {
				c3.andThen(c4).accept(student);
			}
		}));
	}

	public static void main(String[] args) {
		Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());

		c1.accept("java8");
		System.out.println("***********PrintName************");
		printName();

		System.out.println("***********printNameAndActivities************");
		printNameAndActivities();
		printNameAndActivitiesUsingCondition();
	}

}
