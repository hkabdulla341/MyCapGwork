import com.cg.util.Container;

public class Entry3 {
	public static void main(String[] args) {
		
		Container containerRef = new Container();
		
		new Thread(new Producer(containerRef)).start();
		new Thread(new Consumer(containerRef)).start();
	}
}
