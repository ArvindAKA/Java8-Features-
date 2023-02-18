package streams_terminals;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsPartioningByExample {

	public static void partitionBy_1() {

		Predicate<Student> studentPredicate = (student -> student.getGpa() >= 3.8);

		Map<Boolean, List<Student>> partioningMap1 = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.partitioningBy(studentPredicate));

		System.out.println("partioningMap_1 : " + partioningMap1);
	}
	
	public static void partionBy_2() {
		
		Predicate<Student> studentPredicate = (student->student.getGpa()>=3.8);
		
		 Map<Boolean, Set<Student>>  partioningMap2 = StudentDataBase.getAllStudents().stream().
			collect(Collectors.partitioningBy(studentPredicate,Collectors.toSet()));
		 
		 System.out.println("partioningMap2 : " + partioningMap2);
	}

	public static void main(String[] args) {

			//partitionBy_1();
			
			partionBy_2();
	}

}
