package generalcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//employee class Name, dept and Salary
public class sampleClass {
	//Emp a --> dept A and Sal = 1000
	//Emp b--> dept A and Sal = 2000
	//Emp C & d --> dept B & sal 5000 and 6000
	// program to get a detail of highest paying form earh dept A and dept b
	public static void main(String[] args) {
		
		List<Employee> empList = Arrays.asList(new Employee("A","DeptA",1000),
				new Employee("B","DeptA",2000),
				new Employee("C","DeptB",4000),
				new Employee("D","DeptB",5000));
		
		System.out.println(empList.stream().collect(Collectors.
				maxBy(Comparator.comparing(Employee::getEmpSal))));
		
		//select * from max(salary) from employee 
		//where salary <> (Select Max(Salary)from employee));
		
		int [] ar = {1,2,3,4,5};
		System.out.print (ar [4]);
		
		String str=" ";
		str.trim();
		System.out.println(str.equals("")+" "+str.isEmpty());

		
		
	}

}
