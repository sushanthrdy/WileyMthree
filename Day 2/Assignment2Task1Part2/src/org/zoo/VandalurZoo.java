package org.zoo;
import java.util.*;
import org.animals.*;

public class VandalurZoo {
	private List<Animal> animalsInZoo=new ArrayList<Animal>();

	public void setAnimalsInZoo(List<Animal> animalsInZoo) {
		this.animalsInZoo = animalsInZoo;
	}
	
	public void displayCharacteristicsOfAnimals() {
		System.out.println("Animals in the zoo are: ");
		for(Animal a:animalsInZoo) {
			System.out.println("-------------------");
			System.out.println(a.getColor()+" "+a.getType()+" of age "+a.getAge()+" and weight "+a.getWeight());
			System.out.println("Vegitarian: "+a.isVegetarian());
			System.out.println("Can Climg: "+a.canClimb());
			System.out.print("Sound: ");
			a.sound();
			System.out.println("-------------------");
		}
	}
	
	
	
}