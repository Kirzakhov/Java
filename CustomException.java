package excep;

import java.util.Scanner;

class MyException extends Exception{
	MyException(String s){
		super(s);
	}
}

class Bank{
	final int balance = 500;
	void withdraw(int amount) throws MyException {
		if(amount>balance)
			throw new MyException("Your account balance is low");
	}
}
public class CustomException {

	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter withdraw amount");
		int withdraw = sc.nextInt();
		Bank b = new Bank();
		b.withdraw(withdraw);
		sc.close();
	}
}
