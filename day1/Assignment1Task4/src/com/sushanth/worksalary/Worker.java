package com.sushanth.worksalary;

abstract class Worker {
	String name;
	int salaryRate;
	Worker(String name,int salaryRate){
		this.name=name;
		this.salaryRate=salaryRate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalaryRate() {
		return salaryRate;
	}
	public void setSalaryRate(int salaryRate) {
		this.salaryRate = salaryRate;
	}
	abstract int Pay(int daysOrHours);
}
