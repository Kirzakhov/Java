package excep;

import java.util.Scanner;

class NegAmountException extends Exception{
	public NegAmountException(String s) {
		super(s);
	}
}

class LowBalanceException extends Exception{
	public LowBalanceException(String s) {
		super(s);
	}
}

class Axis{
	static int amount;
	Axis(){
		amount = 5000;
	}
	void deposit(int amt) {
		try {
			if(amt<0)
				throw new NegAmountException("You can't deposit a negative amount");
			amount += amt;
		}
		catch(NegAmountException e){
			System.out.println(e.getMessage());
		}
	}
	void withdraw(int amt) {
		try {
			if(amt>amount)
				throw new LowBalanceException("Your account balance is low. Can't withdraw "
						+ "given amount");
			amount -= amt;
		}
		catch(LowBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
}

public class DepositWithdraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Axis a = new Axis();
		System.out.println("Account opened with balance Rs." + Axis.amount);
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		do {
			System.out.println("Enter 1 to deposit, 2 to withdraw, 3 to view balance, "
					+ "any other number to exit");
			int opt = sc.nextInt();
			switch(opt) {
			case 1:System.out.println("Enter deposit amount");
					int dep = sc.nextInt();
					System.out.println("Before depositing, amount is Rs. "+Axis.amount);
					a.deposit(dep);
					System.out.println("After depositing, amount is Rs. "+Axis.amount);
					break;
			case 2:System.out.println("Enter withdraw amount");
					int wit = sc.nextInt();
					System.out.println("Before withdrwal, amount is Rs. "+Axis.amount);
					a.withdraw(wit);
					System.out.println("After withdrawal, amount is Rs. "+Axis.amount);
					break;
			case 3:System.out.println("Your account balance is Rs."+Axis.amount);
					break;
			default:flag = false;
			}
		}while(flag);
		sc.close();
	}

}
