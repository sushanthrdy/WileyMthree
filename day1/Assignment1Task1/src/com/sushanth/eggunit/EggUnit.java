package com.sushanth.eggunit;

public class EggUnit {
	private int gross,dozen,remaining;

	public int getGross() {
		return gross;
	}

	public void setGross(int gross) {
		this.gross = gross;
	}

	public int getDozen() {
		return dozen;
	}

	public void setDozen(int dozen) {
		this.dozen = dozen;
	}

	public int getRemaining() {
		return remaining;
	}

	public void setRemaining(int remaining) {
		this.remaining = remaining;
	}
	public void display() {
		System.out.println("Gross eggs: "+getGross());
		System.out.println("Dozen eggs: "+getDozen());
		System.out.println("Remaining eggs: "+getRemaining());
	}
	
}
