package com.sushanth.clock;

public class TickJob implements Runnable{
	private Clock clock;
	
	public TickJob(Clock clock) {
		super();
		this.clock = clock;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=60;i++) {
			clock.tick(i);
		}
	}
	
}
