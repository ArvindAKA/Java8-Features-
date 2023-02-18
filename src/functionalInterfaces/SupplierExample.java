package functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class SupplierExample {

	public static void main(String[] args) {

		Supplier<Student> studentSupplier = () -> {
			return new Student("Adam", 2, 3.6, "male", Arrays.asList("swimming", "basketball", "volleyball"));
		};

		System.out.println("Student is " + studentSupplier.get());

		Supplier<List<Student>> listOfStudentSupplier = () -> StudentDataBase.getAllStudents();
		System.out.println("Students are " + listOfStudentSupplier.get());

	}

}
