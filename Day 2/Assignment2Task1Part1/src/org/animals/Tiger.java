package org.animals;

public class Tiger extends Animal{

	public Tiger(String type,String color, int weight, int age) {
		super(type,color, weight, age);
	}

	@Override
	public boolean isVegetarian() {
		return false;
	}

	@Override
	public boolean canClimb() {
		return true;
	}

	@Override
	public void sound() {
		System.out.println("tiger growls");
	}

}
