package com.example.studentapp;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Student> al = new ArrayList<Student>();
		System.out.println("Student List (ordered by name)");
		
		Student s1 = new Student(101, "Kim", 20);
		al.add(s1);
		Student s2 = new Student(102, "Lee", 21);
		al.add(s2);
		Student s3 = new Student(103, "Park", 22);
		al.add(s3);
		Student s4 = new Student(104, "Choi", 23);
		al.add(s4);
		Student s5 = new Student(105, "Seo", 24);
		al.add(s5);
		Student s6 = new Student(106, "Bae", 25);
		al.add(s6);
		Student s7 = new Student(107, "Jung", 26);
		al.add(s7);
		Student s8 = new Student(108, "Ko", 27);
		al.add(s8);
		Student s9 = new Student(109, "Hong", 28);
		al.add(s9);
		Student s0 = new Student(110, "Yoon", 29);
		al.add(s0);
		
		Collections.sort(al);
		
		for(Student s : al) {
			System.out.println(s.toString());
		}
		
		System.out.println("Student List (reverse ordered by name)");
		
		Collections.sort(al, Collections.reverseOrder());
		
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i).toString());
		}
	}
}
