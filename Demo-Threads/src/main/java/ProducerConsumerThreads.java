import com.cg.util.Container;

class Producer implements Runnable {
	private Container containerRef;

	public Producer(Container containerRef) {
		this.containerRef = containerRef;
	}

	@Override
	public void run() {
		while(true){
			try {
				containerRef.put("Hello, world!");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}

class Consumer implements Runnable {
	private Container containerRef;

	public Consumer(Container containerRef) {
		this.containerRef = containerRef;
	}

	@Override
	public void run() {
		while(true){
			try {
				containerRef.get();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}