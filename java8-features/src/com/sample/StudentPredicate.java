package com.sample;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.sample.beans.Student;

public class StudentPredicate {
	public static Predicate<Student> isAdultMale() {
		return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
	}

	public static Predicate<Student> isAdultFemale() {
		return p -> p.getAge() > 18 && p.getGender().equalsIgnoreCase("F");
	}

	public static Predicate<Student> isAgeMoreThan(Integer age) {
		return p -> p.getAge() > age;
	}

	public static List<Student> filterStudents(List<Student> students, Predicate<Student> predicate) {
		return students.stream().filter(predicate).collect(Collectors.<Student>toList());
	}
}
