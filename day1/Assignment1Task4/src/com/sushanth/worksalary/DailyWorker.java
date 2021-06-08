package com.sushanth.worksalary;

public class DailyWorker extends Worker{
	DailyWorker(String name, int salaryRate) {
		super(name, salaryRate);
	}

	@Override
	int Pay(int days) {
		return this.salaryRate*days;
	}

}
