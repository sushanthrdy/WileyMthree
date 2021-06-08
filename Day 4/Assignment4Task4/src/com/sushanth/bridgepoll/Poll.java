package com.sushanth.bridgepoll;

public class Poll implements Runnable{
	private Check c;
	
	
	public Poll(Check c) {
		super();
		this.c = c;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			c.passPoll(i);;
		}
	}
	
}
