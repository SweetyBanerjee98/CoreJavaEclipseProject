package com.example;

public class StudentDetails {

	static void display(Student s) {
//		System.out.println("Student Id:" + s.getId());
//		System.out.println("Student Name:" + s.getName());
//		System.out.println("Address:" + s.getAddr());

		System.out.println(s);

	}

	public static void main(String[] args) {

		Student s1 = new Student(20, "Sweety", new Address("123", "Kolkata", 700089, "WestBengal", "India"));

		System.out.println("Details are:");

		display(s1);

	}

}
