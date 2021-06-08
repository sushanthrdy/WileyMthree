package com.sushanth.questionanswer;

import java.util.Scanner;

public class HotelReception {
	private boolean state=true;
	Scanner sc=new Scanner(System.in);
	private String name;
	synchronized void displayQuestion(String question) {
		if(state==false) {
			try {
				wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+":"+question);
		state=false;
	}
	synchronized void displayAnswer(String answer) {
		if(state==true) {
			try {
				wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
//		notify();
		String a=sc.nextLine();
		if(!a.equals(answer)) {
			System.exit(0);
		}
		else {
			state=true;
		}
	}
}
