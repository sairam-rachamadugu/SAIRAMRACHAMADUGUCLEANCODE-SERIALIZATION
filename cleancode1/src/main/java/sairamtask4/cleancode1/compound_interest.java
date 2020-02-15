package sairamtask4.cleancode1;

public class compound_interest {
	double amount,noOfYears,interestRate;
	public compound_interest(double amount, double noOfYears, double interestRate) {
		// TODO Auto-generated constructor stub
		this.amount=amount;
		this.noOfYears=noOfYears;
		this.interestRate=interestRate;
	}

	public double calculate1() {
		// TODO Auto-generated method stub
		return amount * Math.pow(1.0+interestRate/100.0,noOfYears) - amount;
	}

}
