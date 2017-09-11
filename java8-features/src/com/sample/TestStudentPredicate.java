package com.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sample.beans.Student;
import static com.sample.StudentPredicate.*;

public class TestStudentPredicate {

	public static void main(String[] args) {
		Student e1 = new Student(1, 23, "M", "Tim", "Robbins");
		Student e2 = new Student(2, 13, "F", "Maria", "Sharapova");
		Student e3 = new Student(3, 43, "M", "Ricky", "Martin");
		Student e4 = new Student(4, 26, "M", "Elon", "Musk");
		Student e5 = new Student(5, 19, "F", "Christine", "Simpson");
		Student e6 = new Student(6, 15, "M", "Adam", "Stevens");
		Student e7 = new Student(7, 68, "F", "June", "Mayor");
		Student e8 = new Student(8, 79, "M", "Saleh", "Khan");
		Student e9 = new Student(9, 15, "F", "Asma", "Sultana");
		Student e10 = new Student(10, 30, "M", "Mohsin", "Khursheed");

		List<Student> students = new ArrayList<Student>();
		students.addAll(Arrays.asList(new Student[] { e1, e2, e3, e4, e5, e6, e7, e8, e9, e10 }));

		System.out.println(filterStudents(students, isAdultMale()));

		System.out.println(filterStudents(students, isAdultFemale()));

		System.out.println(filterStudents(students, isAgeMoreThan(35)));

		System.out.println(filterStudents(students, isAgeMoreThan(35).negate()));
	}
}