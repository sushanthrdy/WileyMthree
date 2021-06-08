package com.sushanth.telephonedirectory;

import java.util.*;
public class TelephoneDirectory {
	private Set<Person> directory=new TreeSet<Person>();
	
	public void setDirectory(Set<Person> directory) {
		this.directory = directory;
	}

	public void display() {
		System.out.println("Telephone Directory:");
		for(Person per:directory) {
			System.out.println(per.toString());
		}
	}
}
