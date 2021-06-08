package org.bankimpl;

import org.bank.DebitInterest;
import org.bank.LoanAcc;

public class PersonalLoanAcc implements LoanAcc, DebitInterest {

	@Override
	public void createAcc() {
		// TODO Auto-generated method stub
		System.out.println("Personal Loan account created");
	}

	@Override
	public void calcInt() {
		// TODO Auto-generated method stub
		System.out.println("Interest is calculated for Personal Loan account");
	}

	@Override
	public void deductMonthlyInt() {
		// TODO Auto-generated method stub
		System.out.println("Monthly interest of Personal Loan account deduced");
	}

	@Override
	public void deductHalfYrlyInt() {
		// TODO Auto-generated method stub
		System.out.println("Half yearly interest of Personal Loan account deduced");
	}

	@Override
	public void deductAnnualInt() {
		// TODO Auto-generated method stub
		System.out.println("Annual interest of Personal Loan account deduced");
	}

	@Override
	public void repayPrincipal() {
		// TODO Auto-generated method stub
		System.out.println("Successfully repaid the principal for Personal Loan account");
	}

	@Override
	public void payInterest() {
		// TODO Auto-generated method stub
		System.out.println("Successfully repaid the interest for Personal Loan account");
	}

	@Override
	public void payPartialPrincipal() {
		// TODO Auto-generated method stub
		System.out.println("Paid partial principal amount for Personal Loan account");
	}

}
