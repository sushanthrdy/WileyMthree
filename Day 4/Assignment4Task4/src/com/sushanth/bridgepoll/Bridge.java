package com.sushanth.bridgepoll;

public class Bridge implements Runnable{
	private Check c;
	
	
	public Bridge(Check c) {
		super();
		this.c = c;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			c.passBridge(i);
		}
	}
	
}
