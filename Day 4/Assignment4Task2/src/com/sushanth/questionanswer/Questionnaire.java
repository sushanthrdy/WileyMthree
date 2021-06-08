package com.sushanth.questionanswer;

public class Questionnaire implements Runnable{
	private String[] questions= {"May I know your name?","May I know your age?","Which state you are from?","Which city you are from?","May I know your mobile number","How may rooms you want to book?","How many days you want to stay in the hotel?","Do you want us to provide food?","Will you be using gaming zone facility?","Are you interested in having a hotel membership card?"};
	
	public HotelReception reception;

	public Questionnaire(HotelReception reception) {
		super();
		this.reception= reception;
	}
	public void run() {
		for(String q:questions) {
			reception.displayQuestion(q);
		}
	}
	
}
