package org.animals;

public class Lion extends Animal{

	public Lion(String type,String color, int weight, int age) {
		super(type,color, weight, age);
	}

	@Override
	public boolean isVegetarian() {
		return false;
	}

	@Override
	public boolean canClimb() {
		return false;
	}

	@Override
	public void sound() {
		System.out.println("Lion roars");
		
	}

}
