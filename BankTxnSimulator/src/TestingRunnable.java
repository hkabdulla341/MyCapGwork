import PkgBank.RunnableTeller;


public class TestingRunnable
{

    public static void main(String[] args)
    {
	
	System.out.println("run");
	Runnable target;
	target = new RunnableTeller();
	
	Thread t;
	t = new Thread(target);
	
	t.start();
    }

}
