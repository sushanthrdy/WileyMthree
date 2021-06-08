package com.sushanth.clock;

public class Clock{
	private int var=1;
	synchronized void tick(int i) {
		while(var!=1) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.print(Thread.currentThread().getName()+i);
		var=2;
		notifyAll();
		
	}
	synchronized void tack(int i) {
		while(var!=2) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.print(Thread.currentThread().getName()+i);
		var=3;
		notifyAll();
		
	}
	synchronized void tock(int i) {
		while(var!=3) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+i);
		var=1;
		notifyAll();
		
	}
	
}
