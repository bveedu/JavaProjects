package com.training.java.day5;

public class Account {

	 int accNo;
	 long balance;
	 /**
	  * withDraw amount from the account
	  * @param amount
	  * @throws AccountOverrunException
	  */
	 public void withDraw(int amount) throws AccountOverrunException{
		 if(balance <amount){
			 throw new AccountOverrunException(balance);
		 }
		 balance =balance-amount;
	 }
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public static void main(String[] args){
		Account account= new Account();
		try {
			account.withDraw(1000);
		} catch (AccountOverrunException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println("Balance :"+account.getBalance());
	}
}

class AccountOverrunException extends Exception{
	long balance;
	String message ="Not enough balance to withdraw. " ;
	AccountOverrunException(long balance){
		this.balance=balance;
	}
	public String getMessage(){
		return message+" You have only Rs."+ balance+" in the account";
	}
	
}