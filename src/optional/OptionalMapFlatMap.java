package optional;

import java.util.Optional;

import com.learnJava.data.Bike;
import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class OptionalMapFlatMap {

	// filter
	
	
	public static void optionalFilter() {

		Optional<Student> studentOptional = Optional
						.ofNullable(StudentDataBase.studentSupplier.get());

		studentOptional.filter(student -> student.getGpa() >=3.6)
			.ifPresent(student -> System.out.println(student));
	}

	// Map
	public static void optionalMap() {
		 Optional<Student> studentOptional = Optional
				 	.ofNullable(StudentDataBase.studentSupplier.get());
		 
		 if(studentOptional.isPresent()) {
			 studentOptional.filter(student->student.getGpa()>=3.5)
			 .map(Student::getName);
			 System.out.println(studentOptional.get());
		 }
	}
	
	// flatMap
	public static void optionalFlatMap() {
			Optional<Student> studentOptional = Optional
						.ofNullable(StudentDataBase.studentSupplier.get());
			
			Optional<String> name = studentOptional
					.filter(student->student.getGpa()>=3.5)//Optional<Student>
				.flatMap(Student::getBike) //returns --> optional<Bike.
				.map(Bike::getName);
			
			name.ifPresent(s->System.out.println("name :" + s));
			
	}
	
	public static void main(String[] args) {
		optionalFilter();
		
		System.out.println("optionalMap");
		optionalMap();
		System.out.println("optioalFlatMap");
		optionalFlatMap();

	}

}
