package com.chainsys.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {
	
	public static void main(String[] args) {
		Student student1 = new Student("Ajith", 20, new Address("9876"),
				Arrays.asList(new MobileNumber("9872"), new MobileNumber("9873")));

		Student student2 = new Student("Mani", 20, new Address("9878"),
				Arrays.asList(new MobileNumber("9999"), new MobileNumber("8888"), new MobileNumber("1728")));

		Student student3 = new Student("Vishnu", 20, new Address("9879"),
				Arrays.asList(new MobileNumber("8888"), new MobileNumber("6666")));

		List<Student> students = Arrays.asList(student1, student2, student3);

		Optional<Student> first = students.stream().filter(student -> student.getName().equals("Ajith")).findFirst();
		System.out.println(first.isPresent() ? first.get().getName() : "Name is Not Found");

		List<Student> first1 = students.stream().filter(
				student -> student.getMobileNumbers().stream().anyMatch(x -> Objects.equals(x.getNumber(), "8888")))
				.collect(Collectors.toList());

		String results = first1.stream().map(fst -> fst.getName()).collect(Collectors.joining(",", "[", "]"));
		System.out.println(results);
		System.out.println();

		List<String> nameList = Arrays.asList("Ajith", "Mani", "Vishnu", "Kishore", "Venkat");
		nameList.stream().map(String::toUpperCase).forEach(System.out::println);
		System.out.println();

		List<Student> first2 = students.stream()
				.filter(student -> student.getMobileNumbers().stream()
						.allMatch(x -> Objects.equals(x.getNumber(), "9872") || Objects.equals(x.getNumber(), "9873")))
				.collect(Collectors.toList());

		String results1 = first2.stream().map(std -> std.getName()).collect(Collectors.joining(",", "[", "]"));
		System.out.println(results1);

		TempStudent stud1 = new TempStudent("Ajith1", 20, new Address("12341"),
				Arrays.asList(new MobileNumber("12331"), new MobileNumber("12341")));

		TempStudent stud2 = new TempStudent("Mani1", 20, new Address("12351"),
				Arrays.asList(new MobileNumber("11111"), new MobileNumber("33331"), new MobileNumber("12331")));

		List<TempStudent> tmpStudents = Arrays.asList(stud1, stud2);

		List<Student> studentList = tmpStudents.stream()
				.map(stud -> new Student(stud.name, stud.age, stud.address, stud.mobileNumbers))
				.collect(Collectors.toList());

		System.out.println(studentList);
		System.out.println();

		List<String> namesList = Arrays.asList("Ajith", "Mani", "Vishnu", "Kishore", "Venkat");
		namesList.stream().sorted().forEach(System.out::println);

	}

}
