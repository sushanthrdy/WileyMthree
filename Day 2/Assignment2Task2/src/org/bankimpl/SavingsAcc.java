package org.bankimpl;

import org.bank.CreditInterest;
import org.bank.DepositAcc;

public class SavingsAcc implements DepositAcc, CreditInterest {

	@Override
	public void createAcc() {
		// TODO Auto-generated method stub
		System.out.println("Savings Account created");
	}

	@Override
	public void calcInt() {
		// TODO Auto-generated method stub
		System.out.println("Interest is calculated for savings account");
	}

	@Override
	public void addMonthlyInt() {
		// TODO Auto-generated method stub
		System.out.println("Monthly interest of savings account is added");

	}

	@Override
	public void addHalfYrlyInt() {
		// TODO Auto-generated method stub
		System.out.println("Halfyearly interest of savings account is added");
	}

	@Override
	public void addAnnualInt() {
		// TODO Auto-generated method stub
		System.out.println("Annual interest of savings account is added");
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Money withdrawn form savings account successfully");
	}

	@Override
	public void wdeposit() {
		// TODO Auto-generated method stub
		System.out.println("Money deposited in savings account successfully");
	}

	@Override
	public void wgetBalance() {
		// TODO Auto-generated method stub
		System.out.println("This is the amount present in savings account");
	}

}
