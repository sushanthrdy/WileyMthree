package com.sushanth.maintask;

import java.util.Scanner;

import com.sushanth.customexcpetions.AgeOutOfBounds;
import com.sushanth.customexcpetions.NameAlreadyExists;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeCollection empc=new EmployeeCollection();
		try {
			for(int i=0; i<3; i++) {
				Employee ab = new Employee();
				System.out.println("Enter Name");
				String s=sc.next();
				ab.setName(s);
				empc.checkDuplicateUsingAdd(ab.getName());
				System.out.println("Enter Age: ");
				int a = sc.nextInt();
				ab.setAge(a);
		}
			
		} catch (AgeOutOfBounds exception) {
			System.out.println("Age not entered Correctly");
		}
		catch (NameAlreadyExists exception) {
			System.out.println("Name already entered");
			}
	}
}
