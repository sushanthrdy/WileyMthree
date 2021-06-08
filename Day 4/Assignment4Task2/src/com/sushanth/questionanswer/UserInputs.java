package com.sushanth.questionanswer;
public class UserInputs implements Runnable{
	private String[] answers= {"asd","asd","asd","asd","asd","asd","asd","asd","asd","asd"};
	private HotelReception reception;
	
	public UserInputs(HotelReception reception) {
		super();
		this.reception = reception;
	}

	public void run() {
		for(String s:answers) {
			reception.displayAnswer(s);
		}
	}
}
