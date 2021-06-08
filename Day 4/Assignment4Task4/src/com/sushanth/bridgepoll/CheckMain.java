package com.sushanth.bridgepoll;

public class CheckMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check c=new Check();
		Thread bridge=new Thread(new Bridge(c),"Vehicle");
		Thread poll=new Thread(new Poll(c),"Vehicle");
		
		bridge.start();
		poll.start();
	}

}
