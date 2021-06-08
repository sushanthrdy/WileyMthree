package com.sushanth.ownerhen;

public class Eggs implements Runnable{
	private FinalDisplay fd;
	private Owner owner;
	public Eggs(FinalDisplay fd) {
		super();
		this.fd = fd;
	}
	public void run() {
		for(int i=1;i<=50;i++) {
			fd.eggLaid(i);
		}
	}
}
