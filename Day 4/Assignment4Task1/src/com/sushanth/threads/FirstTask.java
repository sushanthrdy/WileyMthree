package com.sushanth.threads;

class FirstThread extends Thread{
	public void run() {
		
		for(int i=0;i<5;i++) {
	
			Thread temp=Thread.currentThread();
			System.out.println(temp.getId()+" "+temp.getName()+" "+temp.getPriority()+" "+temp.isAlive()+" "+temp.getState());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class FirstTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstThread thread1=new FirstThread(); //Thread-0
		FirstThread thread2=new FirstThread(); //Thread-1
		FirstThread thread3=new FirstThread(); //Thread-2
		FirstThread thread4=new FirstThread(); //Thread-3
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

}
