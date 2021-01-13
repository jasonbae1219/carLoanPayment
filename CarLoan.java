/*
In this project, you will write a program that will calculate the monthly car payment a user should expect to make after taking out a car loan. The program will include the following:

Car loan amount
Interest rate of the loan
Length of the loan (in years)
Down payment
*/


// a program that calculates a car payment

public class CarLoan {
	public static void main(String[] args) {

	int carLoan = 10000;
  int loanLength = 3; // 3years
  int interestRate = 5; //5 %
  int downPayment = 2000; // downpayment

  if (loanLength <= 0 || interestRate <= 0){
    System.out.println ("Error! You must take out a valid car loan.");
  
  }else if(downPayment >= carLoan) {
    System.out.println ("The car can be paid in full.");
  
  } else{
    int remainingBalance = carLoan - downPayment;
    int months = loanLength * 12;
    int monthlyBalance = remainingBalance / months; //his represents the monthly payment without interest included.
    int interest = monthlyBalance * interestRate / 100;
    int monthlyPayment = monthlyBalance +interestRate;
    System.out.println (monthlyPayment);

  }
  

	}
}