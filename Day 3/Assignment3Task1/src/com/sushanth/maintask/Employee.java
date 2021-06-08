package com.sushanth.maintask;

import com.sushanth.customexcpetions.AgeOutOfBounds;
import com.sushanth.customexcpetions.NameAlreadyExists;

public class Employee {
	private String Name;
	private int age;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<18 || age>60) {
			throw new AgeOutOfBounds("Age cannot be less than 18 and greater than 60");
		}
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", age=" + age + "]";
	}
}