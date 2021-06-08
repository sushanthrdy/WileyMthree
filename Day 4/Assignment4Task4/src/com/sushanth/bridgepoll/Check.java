package com.sushanth.bridgepoll;

public class Check {
	private boolean status=true;
	
	synchronized void passBridge(int i) {
		if(status==false) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" "+i+" "+"passed the Bridge");
		status=false;
		notify();
	}
	synchronized void passPoll(int i) {
		if(status==true) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" "+i+" "+"passed the Poll");
		status=true;
		notify();
	}
}
