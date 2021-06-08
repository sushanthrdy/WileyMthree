package com.sushanth.clock;

public class ClockMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock clock = new Clock();
		Thread thread1=new Thread(new TickJob(clock),"Tick");
		Thread thread2=new Thread(new TackJob(clock),"Tack");
		Thread thread3=new Thread(new TockJob(clock),"Tock");
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
