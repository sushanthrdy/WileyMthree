package org.animals;

abstract public class Animal {
	private String type;
	private String color;
	private int weight;
	private int age;
	public Animal(String type,String color, int weight, int age) {
		super();
		this.type = type;
		this.color = color;
		this.weight = weight;
		this.age = age;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	abstract public boolean isVegetarian();
	abstract public boolean canClimb();
	abstract public void sound();
	
}
