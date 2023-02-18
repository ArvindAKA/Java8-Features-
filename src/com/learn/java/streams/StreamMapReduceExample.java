package com.learn.java.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamMapReduceExample {
	
	private static int numberOfNoteBooks() {	
		int numberOfNoteBooks = StudentDataBase.getAllStudents().stream()
			.filter((student)->student.getGradeLevel()>=3)
			.filter((student)->student.getGender().equals("female"))
			.map(Student::getNoteBooks)
			.reduce(0,  Integer::sum); //alternative method
			//.reduce(0, (a,b)->a+b);
		return numberOfNoteBooks;
	}

	public static void main(String[] args) {
		System.out.println(numberOfNoteBooks());

	}

}
