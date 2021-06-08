package org.bankimpl;

import org.bank.DebitInterest;
import org.bank.LoanAcc;

public class HousingLoanAcc implements LoanAcc, DebitInterest {

	@Override
	public void createAcc() {
		// TODO Auto-generated method stub
		System.out.println("Housing Loan account created");
	}

	@Override
	public void calcInt() {
		// TODO Auto-generated method stub
		System.out.println("Interest is calculated for Housing Loan account");
	}

	@Override
	public void deductMonthlyInt() {
		// TODO Auto-generated method stub
		System.out.println("Monthly interest of Housing Loan account deduced");
	}

	@Override
	public void deductHalfYrlyInt() {
		// TODO Auto-generated method stub
		System.out.println("Half yearly interest of Housing Loan account deduced");
	}

	@Override
	public void deductAnnualInt() {
		// TODO Auto-generated method stub
		System.out.println("Annual interest of Housing Loan account deduced");
	}

	@Override
	public void repayPrincipal() {
		// TODO Auto-generated method stub
		System.out.println("Successfully repaid the principal for Housing loan account");
	}

	@Override
	public void payInterest() {
		// TODO Auto-generated method stub
		System.out.println("Successfully repaid the interest for Housing loan account");
	}

	@Override
	public void payPartialPrincipal() {
		// TODO Auto-generated method stub
		System.out.println("Paid partial principal amount for Housing loan account");
	}

}
