package com.sushanth.student;
/*
 * question 1: what if there are more than one student with max marks
 * 
 * 
 */
import java.util.Scanner;

public class StandardMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=2;
		Student[] students=new Student[size];
		
		for(int i=0;i<students.length;i++) {
			System.out.println("====================================================================");
			Student s=new Student();
			System.out.println("Enter Student name: ");
			s.setStudentName(sc.nextLine());
			System.out.println("Enter marks scored by "+s.getStudentName()+" in English");
			s.setMarksInEng(sc.nextDouble());
			System.out.println("Enter marks scored by "+s.getStudentName()+" in Maths");
			s.setMarksInMaths(sc.nextDouble());
			System.out.println("Enter marks scored by "+s.getStudentName()+" in Science");
			s.setMarksInScience(sc.nextDouble());
			sc.nextLine();
			students[i]=s;
			System.out.println("====================================================================");
		}
		Standard calculation=new Standard();
		calculation.setStudents(students);
		calculation.displayStudents();
		calculation.displayHighestPercentageStudent();
		calculation.displayMathHighestScoredStudent();
	}

}
