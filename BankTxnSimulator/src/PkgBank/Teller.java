package PkgBank;

import java.util.Random;

public class Teller extends Thread
{
    private Random ran = new Random();
    private Bank aBank;

    public Teller(Bank aBank)
    {
	this.aBank = aBank;
    }

    @Override
    public void run()
    {
	performTransfer();
    }

    private void performTransfer()
    {
	int takeFromAcct = -1;
	int putToAcct = -1;

	for (int i = 0; i < 5; i++)
	{
	    while (takeFromAcct == putToAcct)
	    {
		takeFromAcct = ran.nextInt(3) + 0;
		putToAcct = ran.nextInt(3) + 0;
	    }
	    
	    double amount = ran.nextInt(101) + 100;

	    aBank.transferAmount(putToAcct, takeFromAcct, amount);
	}
    }
}
