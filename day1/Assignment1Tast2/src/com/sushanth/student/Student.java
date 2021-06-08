package com.sushanth.student;
import java.util.*;
public class Student {
	Random rand=new Random();
	int rollNo=1+rand.nextInt(99);
	String studentName;
	double marksInEng;
	double marksInMaths;
	double marksInScience;
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getRollNo() {
		return rollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getMarksInEng() {
		return marksInEng;
	}
	public void setMarksInEng(double marksInEng) {
		this.marksInEng = marksInEng;
	}
	public double getMarksInMaths() {
		return marksInMaths;
	}
	public void setMarksInMaths(double marksInMaths) {
		this.marksInMaths = marksInMaths;
	}
	public double getMarksInScience() {
		return marksInScience;
	}
	public void setMarksInScience(double marksInScience) {
		this.marksInScience = marksInScience;
	}
	
}
