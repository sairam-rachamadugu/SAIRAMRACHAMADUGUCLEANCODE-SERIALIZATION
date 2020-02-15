package sairamtask4.cleancode1;

public class simple_interest {
	double amount,noOfYears,interestRate;
	public simple_interest(double amount, double noOfYears, double interestRate) {
		// TODO Auto-generated constructor stub
		this.amount=amount;
		this.noOfYears=noOfYears;
		this.interestRate=interestRate;
	}

	public double calculate() {
		// TODO Auto-generated method stub
		return (amount*noOfYears*interestRate)/100;
	}

}
