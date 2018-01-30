import com.cg.Account;

public class TellerThread extends Thread{

	private Account account;
	
	public TellerThread(Account account) {
		this.account = account;
	}
	
	@Override
	public void run() {

		for(int token = 0; token < 25; token++){
			try {
				account.deposit(200);
				System.out.println("Amount deposited to "+ account.getId());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}


class AnotherTellerThread extends Thread{

	private Account account;
	
	public AnotherTellerThread(Account account) {
		this.account = account;
	}
	
	@Override
	public void run() {

		for(int token = 0; token < 25; token++){
			try {
				account.withdraw(200);
				System.out.println("Amount withdrawn from "+ account.getId());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}


