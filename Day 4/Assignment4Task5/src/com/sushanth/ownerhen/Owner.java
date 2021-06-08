package com.sushanth.ownerhen;

public class Owner implements Runnable{
	private FinalDisplay fd;

	public Owner(FinalDisplay fd) {
		super();
		this.fd = fd;
	}
	public void run() {
		for(int i=0;i<50;i++) {
			fd.ownerGained();
		}
	}
}
