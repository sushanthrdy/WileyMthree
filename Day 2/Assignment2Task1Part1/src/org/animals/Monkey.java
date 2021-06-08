package org.animals;

public class Monkey extends Animal{

	public Monkey(String type,String color, int weight, int age) {
		super(type,color, weight, age);
	}

	@Override
	public boolean isVegetarian() {
		return true;
	}

	@Override
	public boolean canClimb() {
		return true;
	}

	@Override
	public void sound() {
		System.out.println("Monkeys Screech");
		
	}
	
}
