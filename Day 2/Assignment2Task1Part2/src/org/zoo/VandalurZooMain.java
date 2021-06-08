package org.zoo;
import java.util.*;
import org.animals.*;
public class VandalurZooMain {

	public static void main(String[] args) {
		
		List<Animal> animalsList=new ArrayList<Animal>();
		Animal lion1=new Lion("Lion","Yellow",120,12);
		Animal lion2=new Lion("Lion","golden",130,11);
		Animal tiger1=new Tiger("Tiger","golden with blackspots",190,17);
		Animal tiger2=new Tiger("Tiger","golden with blackmarks",160,15);
		Animal monkey1=new Monkey("Monkey","light brown",30,22);
		Animal monkey2=new Monkey("Monkey","white",45,28);
		Animal elephant1=new Elephant("Elephant","Grey",500,35);
		Animal elephant2=new Elephant("Elephant","Dark Grey",300,13);
		animalsList.add(lion1);
		animalsList.add(lion2);
		animalsList.add(tiger1);
		animalsList.add(tiger2);
		animalsList.add(monkey1);
		animalsList.add(monkey2);
		animalsList.add(elephant1);
		animalsList.add(elephant2);
		
		VandalurZoo zoo=new VandalurZoo();
		zoo.setAnimalsInZoo(animalsList);
		zoo.displayCharacteristicsOfAnimals();
	}

}