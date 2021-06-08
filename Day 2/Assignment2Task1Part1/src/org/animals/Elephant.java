package org.animals;

public class Elephant extends Animal{

	public Elephant(String type,String color, int weight, int age) {
		super(type,color, weight, age);
	}

	public boolean isVegetarian() {
		return true;
	}

	@Override
	public boolean canClimb() {
		return false;
	}

	@Override
	public void sound() {
		System.out.println("Elephant roars");
	}

}
