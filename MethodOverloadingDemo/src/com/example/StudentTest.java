package com.example;

import java.util.Scanner;

public class StudentTest {

	static void displayStudents(Student[] s1) {

		for (Student obj : s1) {

			System.out.println("Name : " + obj.getName() + " Score:" + obj.getScore() + " Course :" + obj.getCourse());
		}

	}

	// method overloading
	static void displayStudents(Student[] s1, double marks) {

		for (Student obj : s1) {
			if (obj.getScore() >= marks)
				System.out.println(
						"Name : " + obj.getName() + " Score:" + obj.getScore() + " Course :" + obj.getCourse());

		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student s[] = new Student[5];

		s[0] = new Student(1, "Sweety", 23, 90.2);
		s[1] = new Student(2, "Olivia", 24, 79.5, "MCA");
		s[2] = new Student(3, "Sophia", 21, 88.3);
		s[3] = new Student(4, "Emma", 20, 91, "MCA");
		s[4] = new Student(5, "Ava", 22, 82.9, "MCA");

		int ch;
		System.out.println("Enter 1 to see all students name:");
		System.out.println("Enter 2 to see students obove 90:");
		System.out.println("Enter your choice:");
		ch = sc.nextInt();

		switch (ch) {
		case 1:
			displayStudents(s);
			break;
		case 2:
			displayStudents(s, 90.0);
			break;
		default:
			System.out.println("Wrong input");

		}

		sc.close();

	}

}
