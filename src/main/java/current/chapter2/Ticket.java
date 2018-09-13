package current.chapter2;

import java.util.concurrent.atomic.AtomicInteger;

public class Ticket implements Runnable {
	 private AtomicInteger aInteger=new AtomicInteger(1);
	private final static int MAX = 50;
	private volatile int index = 1;

	public  void run() {
		
		while (index <= MAX) {
			//index=aInteger.incrementAndGet();
			//synchronized (Ticket.class) {
				System.out.println(Thread.currentThread() + " µÄºÅÂëÊÇ:" + (index++));
			//}
		}
	}

}
