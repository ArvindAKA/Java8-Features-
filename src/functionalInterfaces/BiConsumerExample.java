package functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class BiConsumerExample {

	public static void nameAndActivities() {

		BiConsumer<String, List<String>> biconsumer = (name, activities) -> System.out
				.println(name + "  " + activities);
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach((student) -> biconsumer.accept(student.getName(), student.getActivities()));
	}

	public static void main(String[] args) {

		BiConsumer<String, String> biconsumer = (a, b) -> {
			System.out.println("a :" + a + " b : " + b);
		};

		biconsumer.accept("java7", "java8");

		BiConsumer<Integer, Integer> multiply = (a, b) -> {
			System.out.println("Multiplication " + (a * b));
		};

		BiConsumer<Integer, Integer> division = (a, b) -> {
			System.out.println("Division  is : " + (a / b));
		};

		multiply.andThen(division).accept(8, 4);
		nameAndActivities();
		
	}

}
