import com.cg.Account;

public class Entry2 {
	public static void main(String[] args) throws InterruptedException {
		Account a1 = new Account(1000, 1);
		Account a2 = new Account(1000, 2);

		System.out.println("Initial Balance in Account "+ a1.getId() + ": "+ a1.getBalance());
		System.out.println("Initial Balance in Account "+ a2.getId() + ": "+ a2.getBalance());

		Thread t1 = new TellerThread(a1);
		t1.start();
		
//		Thread t2 = new AnotherTellerThread(a2);
		Thread t2 = new AnotherTellerThread(a1);
		t2.start();
		
		
		
		t1.join();
		t2.join();

		System.out.println("Closing Balance in Account "+ a1.getId() + ": "+ a1.getBalance());
		System.out.println("Closing Balance in Account "+ a2.getId() + ": "+ a2.getBalance());

	}
}
