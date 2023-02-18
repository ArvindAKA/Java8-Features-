package defaults;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class DefaultsMethodsExample2 {

	static Consumer<Student> studentConsumer = (student -> System.out.println(student));
	static Comparator<Student> studentNameComparator = Comparator.comparing(Student::getName);
	static Comparator<Student> strudentGradeComparator = Comparator.comparing(Student::getGradeLevel);

	public static void sortStudentByName(List<Student> studentList) {

		System.out.println("After Sort");
		Comparator<Student> studentNameComparator = Comparator.comparing(Student::getName);
		studentList.sort(studentNameComparator);
		studentList.forEach(studentConsumer);
	}

	public static void sortByGPA(List<Student> studentList) {
		System.out.println("Sorting By GPA");
		Comparator<Student> studentGpaComparator = Comparator.comparingDouble(Student::getGpa);
		studentList.sort(studentGpaComparator);
		studentList.forEach(studentConsumer);
	}

	public static void comparatorChaining(List<Student> studentList) {
		System.out.println("After Comparator Chaining");

		studentList.sort(strudentGradeComparator.thenComparing(studentNameComparator));
		studentList.forEach(studentConsumer);

	}

	public static void sortWithNullValuesFirst(List<Student> studentList) {
		System.out.println("Sort with sortWithNullValues");
		Comparator<Student> studentComparator = Comparator.nullsFirst(studentNameComparator);
		studentList.sort(studentComparator);
		studentList.forEach(studentConsumer);

	}

	public static void sortWithNullValuesLast(List<Student> studentList) {
		System.out.println("Sorting with sortWithNullValuesLast");
		Comparator<Student> studentComparator = Comparator.nullsLast(studentNameComparator);
		studentList.sort(studentComparator);
		studentList.forEach(studentConsumer);
	}

	public static void main(String[] args) {

		System.out.println("Before Sort");
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(studentConsumer);

		// sortStudentByName(studentList);

		// sortByGPA(studentList);

		// comparatorChaining(studentList);

		// sortWithNullValuesFirst(studentList);

		sortWithNullValuesLast(studentList);

	}

}
