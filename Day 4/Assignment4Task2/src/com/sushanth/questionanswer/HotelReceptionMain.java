package com.sushanth.questionanswer;

import java.util.Scanner;

public class HotelReceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HotelReception reception=new HotelReception();
		Thread receptionist=new Thread(new Questionnaire(reception),"Receptionist");
		Thread customer=new Thread(new UserInputs(reception),"Customer");
		
		receptionist.start();
		customer.start();
	}

}
