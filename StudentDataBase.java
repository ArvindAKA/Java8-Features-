package com.learnjava.data;

import java.util.Arrays;
import java.util.List;

public class StudentDataBase {

    /**
     * Total of 6 students in the database.
     * @return
     */
    public static List<Student> getAllStudents(){

        /**
         * 2nd grade students
         */
        Student student1 = new Student("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball"));
        Student student2 = new Student("Jenny",2,3.8,"female", Arrays.asList("swimming", "gymnastics","soccer"));
        Student student3 = new Student("Kelly",2,3.9,"female", Arrays.asList("gymnastics","soccer", "TableTennis"));
        /**
         * 3rd grade students
         */
        Student student4 = new Student("Emily",3,4.0,"female", Arrays.asList("swimming", "gymnastics","aerobics"));
        Student student5 = new Student("Dave",3,3.9,"male", Arrays.asList("swimming", "gymnastics","soccer"));
        /**
         * 4th grade students
         */
        Student student6 = new Student("Sophia",4,3.5,"female", Arrays.asList("swimming", "dancing","football"));
        Student student7 = new Student("James",4,3.9,"male", Arrays.asList("swimming", "basketball","baseball","football"));

        List<Student> students = Arrays.asList(student1,student2,student3,student4,student5,student6, student7);
        return students;
    }
}
