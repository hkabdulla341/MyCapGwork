import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class PipedInputOutputDemo {
   final static PipedOutputStream pipedOut = new PipedOutputStream();
   final static PipedInputStream pipedIn = new PipedInputStream();
   
   class PipedOutputThread implements Runnable{
		@Override
		public void run() {
			for(int i=1;i<=5;i++){
				try {
					pipedOut.write(("Message "+i+"\n").getBytes());
					Thread.sleep(500);
				} catch (IOException e) {
					e.printStackTrace();
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
   }
   
   class PipedInputThread implements Runnable{
		@Override
		public void run() {
				try {
					int i=0;
					while((i=pipedIn.read())!=-1){
						System.out.print((char)i);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
    }
   
    public static void main(String[] args) {
    	        try {
			pipedOut.connect(pipedIn);
		} catch (IOException e) {
			e.printStackTrace();
		}
      	        ExecutorService service = Executors.newFixedThreadPool(2);
     	        service.execute(new PipedInputOutputDemo().new PipedOutputThread());
     	        service.execute(new PipedInputOutputDemo().new PipedInputThread());
   }
} 