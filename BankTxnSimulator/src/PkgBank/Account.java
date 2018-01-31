package PkgBank;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account
{
    private int id;
    private double balance;
    
    Lock aLock = new ReentrantLock();
    Condition insufficentBal = aLock.newCondition();

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
