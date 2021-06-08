package com.sushanth.ownerhen;

public class FinalDisplay {
	private boolean state=true;
	private static int money=2;
	synchronized void eggLaid(int i) {
		if(state==false) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Hen laid the "+Thread.currentThread().getName()+" - "+i);
		state=false;
		notify();
	}
	synchronized void ownerGained() {
		if(state==true) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" gained Rs "+money);
		money+=2;
		state=true;
		notify();
	}
}
