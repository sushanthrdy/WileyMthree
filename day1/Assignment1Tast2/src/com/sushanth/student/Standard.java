package com.sushanth.student;
import java.util.*;
public class Standard {
	private Student[] students;

	public void setStudents(Student[] students) {
		this.students = students;
	}
	public void displayStudents() {
		Arrays.sort(students,new Comparator<Student>(){
            public int compare(Student s1, Student s2) {
                return s1.getRollNo()-s2.getRollNo();
            }});
		System.out.println("====================================================================");
		System.out.println("Details of students:");
		System.out.println("Roll Number   "+"Name");
		for(Student i:students) {
			System.out.println(i.getRollNo()+"            "+i.getStudentName());
		}
		System.out.println("====================================================================");
	}
	public void displayHighestPercentageStudent() {
		System.out.println("====================================================================");
		System.out.println("Details of student with highest percentage:");
		System.out.println("Roll Number   "+"Name");
		double highestPercentage=0;
		int index=0;
		double sum,percentage;
		for(int i=0;i<students.length;i++) {
			sum=(students[i].getMarksInEng()+students[i].getMarksInMaths()+students[i].getMarksInScience());
			percentage=sum/3;
			if(percentage>highestPercentage) {
				highestPercentage=percentage;
				index=i;
			}
		}
		System.out.println(students[index].getRollNo()+"            "+students[index].getStudentName());
		System.out.println("====================================================================");
	}
	public void displayMathHighestScoredStudent() {
		System.out.println("====================================================================");
		System.out.println("Details of student with highest Score in Maths:");
		System.out.println("Roll Number   "+"Name");
		double highestScore=0;
		int index=0;
		for(int i=0;i<students.length;i++) {
			if(students[i].getMarksInMaths()>highestScore) {
				highestScore=students[i].getMarksInMaths();
				index=i;
			}
		}
		System.out.println(students[index].getRollNo()+"            "+students[index].getStudentName());
		System.out.println("====================================================================");
	}
}
