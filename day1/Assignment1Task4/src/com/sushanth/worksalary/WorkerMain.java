package com.sushanth.worksalary;

public class WorkerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker w1=new DailyWorker("SUs",40);
		Worker w2=new DailyWorker("Giri",50);
		Worker w3=new SalariedWorker("Chap",20);
		Worker w4=new SalariedWorker("kip",30);
		System.out.println(w1.Pay(4));
		System.out.println(w2.Pay(5));
		System.out.println(w3.Pay(20));
		System.out.println(w4.Pay(42));
	}

}
