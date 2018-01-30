package com.cg;

//	This is a shared resource
public class Account {

	private double balance;
	private int id;

	public Account(double balance, int id) {
		this.balance = balance;
		this.id = id;
	}

	public synchronized void deposit(double amount) throws InterruptedException {

		double locBalance = this.balance;
		// Thread.sleep(800);

		locBalance += amount;
		Thread.sleep(400);

		this.balance = locBalance;
	}

	public synchronized void withdraw(double amount) throws InterruptedException {

		double locBalance = this.balance;
		// Thread.sleep(800);

		locBalance -= amount;
		Thread.sleep(800);

		this.balance = locBalance;
	}

	synchronized public double getBalance() {
		return balance;
	}

	public int getId() {
		return id;
	}

}
