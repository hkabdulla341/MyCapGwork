package PkgBank;

public class Bank
{
    Account[] allAccounts;

    public Bank(Account[] allAccounts)
    {
	this.allAccounts = allAccounts;
    }

    public void transferAmount(int toAccount, int fromAccount, double amount)
    {
//	System.out.println("Sending from acct " + fromAccount + " to acct " + toAccount + " amount : " + amount);

	int toAccLoc = -1;
	int fromAccLoc = -1;
	boolean foundToAcc = false;
	boolean foundFromAcc = false;

	for (int i = 0; i < allAccounts.length && !foundFromAcc && !foundToAcc; i++)
	{
	    if (allAccounts[i].getId() == toAccount)
	    {
		toAccLoc = i;
	    }
	    else if (allAccounts[i].getId() == fromAccount)
	    {
		fromAccLoc = i;
	    }
	}

	if (allAccounts[fromAccLoc].withdraw(amount) == true)
	{
	    allAccounts[toAccLoc].deposit(amount);
	}
    }

    public void showTotalBalance()
    {
	double totalBal = 0;

	for (int i = 0; i < allAccounts.length; i++)
	{
	    totalBal += allAccounts[i].getBalance();
	    System.out.println(allAccounts[i].getBalance() + " balance in " + allAccounts[i].getId());
	}

	System.out.println("Total Bank Balance = " + totalBal);
	System.out.println();
    }
}
