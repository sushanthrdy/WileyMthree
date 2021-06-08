package com.sushanth.worksalary;

public class SalariedWorker extends Worker{

	SalariedWorker(String name, int salaryRate) {
		super(name, salaryRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	int Pay(int hours) {
		if(hours>=40) {
			return this.salaryRate*40;
		}
		else {
			return this.salaryRate*hours;
		}
	}

}
