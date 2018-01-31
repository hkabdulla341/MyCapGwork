package com.seed.synchOldWay;


public class Bank {
	private AccountHolder accounts[] = new AccountHolder[5];
	
	public Bank() {
		for(int id = 0; id < accounts.length; id++)
		{
			accounts[id] = new AccountHolder(id,5000);
		}
	}
	
	//
	
	void showTotalBalance()
	{
		double totalBalance=0;
		
		for(AccountHolder account : accounts)
		{
			totalBalance += account.getBalance();
		}
		
		System.out.println("Total Balance in bank: "+ totalBalance);
	}

	public void transferAmount(int toAcc, int fromAcc, int amount) throws InterruptedException{
		// TODO Auto-generated method stub
		
		synchronized (accounts[fromAcc]) {
			synchronized (accounts[toAcc]) {
				if(amount > accounts[fromAcc].getBalance())
					return;
				accounts[fromAcc].withdraw(amount);
				accounts[toAcc].deposit(amount);
			}
			
		}
		
		
		
		
	}
}
