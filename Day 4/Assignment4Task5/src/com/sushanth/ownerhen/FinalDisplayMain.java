package com.sushanth.ownerhen;

public class FinalDisplayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDisplay fd=new FinalDisplay();
		Thread egg=new Thread(new Eggs(fd),"Egg");
		Thread owner=new Thread(new Owner(fd),"Owner");
		
		egg.start();
		owner.start();
	}

}
