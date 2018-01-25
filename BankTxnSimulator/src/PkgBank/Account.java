package PkgBank;

public class Account
{
    private int id;
    private double balance;

    public Account(int id, double balance)
    {
	this.id = id;
	this.balance = balance;
    }

    public int getId()
    {
	return id;
    }
    
    public double getBalance()
    {
	return balance;
    }
    
    synchronized protected boolean deposit(double amount)
    {
	if (amount <= 0)
	{
	    return false;
	}
	else
	{
	    this.balance += amount;
	    return true;
	}
    }

    synchronized protected boolean withdraw(double amount)
    {
	if (amount == 0 || this.balance <= amount)
	{
	    return false;
	}
	else
	{
	    this.balance -= amount;
	    return true;
	}
    }
}
