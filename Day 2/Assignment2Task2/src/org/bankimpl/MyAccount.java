package org.bankimpl;

public class MyAccount {
	public static void main(String args[]) {
		SavingsAcc sa=new SavingsAcc();
		FDAcc fda=new FDAcc();
		PersonalLoanAcc psl=new PersonalLoanAcc();
		HousingLoanAcc hsl=new HousingLoanAcc();
		sa.createAcc();
		sa.calcInt();
		sa.addMonthlyInt();
		sa.addHalfYrlyInt();
		sa.addAnnualInt();
		sa.withdraw();
		sa.wdeposit();
		sa.wgetBalance();
		fda.createAcc();
		fda.calcInt();
		fda.addMonthlyInt();
		fda.addHalfYrlyInt();
		fda.addAnnualInt();
		fda.withdraw();
		fda.wdeposit();
		fda.wgetBalance();
		psl.createAcc();
		psl.calcInt();
		psl.deductMonthlyInt();
		psl.deductHalfYrlyInt();
		psl.deductAnnualInt();
		psl.repayPrincipal();
		psl.payInterest();
		psl.payPartialPrincipal();
		hsl.createAcc();
		hsl.calcInt();
		hsl.deductMonthlyInt();
		hsl.deductHalfYrlyInt();
		hsl.deductAnnualInt();
		hsl.repayPrincipal();
		hsl.payInterest();
		hsl.payPartialPrincipal();
		
	}
}
