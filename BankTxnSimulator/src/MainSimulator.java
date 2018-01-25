import PkgBank.Account;
import PkgBank.Bank;
import PkgBank.Teller;

public class MainSimulator
{
    public static void main(String[] args)
    {
	Account a1 = new Account(0, 1000);
	Account a2 = new Account(1, 1000);
	Account a3 = new Account(2, 1000);
	
	Account [] threeAcc = {a1, a2, a3};
	
	Bank aBank = new Bank(threeAcc);
	aBank.showTotalBalance();
	Teller t1 = new Teller(aBank);
	Teller t2 = new Teller(aBank);
	
	t1.start();
	t2.start();
	
	try
	{
	    t1.join();
	    t2.join();
	}
	catch (InterruptedException e)
	{
	    
	}
	
	aBank.showTotalBalance();
    }
}
