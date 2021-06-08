package com.sushanth.telephonedirectory;

import java.util.*;
public class TelephoneDirectoryMain {

	public static void main(String[] args) {
		Set<Person> persons=new TreeSet<Person>();
		Person per1=new Person("Sushanth","siddipet","1233455667");
		Person per2=new Person("Krupa","siddipet","987654321");
		Person per4=new Person("Baskar","siddipet","789456123");
		Person per3=new Person("Chill","siddipet","6789456789");
		Person per5=new Person("Dino","siddipet","1233455667");
		Person per6=new Person("Follow","siddipet","1233455667");
		Person per7=new Person("Zombie","siddipet","1233455667");
		persons.add(per1);
		persons.add(per2);
		persons.add(per3);
		persons.add(per4);
		persons.add(per5);
		persons.add(per6);
		persons.add(per7);
		TelephoneDirectory TD=new TelephoneDirectory();
		TD.setDirectory(persons);
		TD.display();
	}

}
