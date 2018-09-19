package current.chapter5;

public class InterruptThread {
	public static void main(String[] args) {
		final Thread t=new Thread() {
			@Override
			public void run() {
				try {
					//Thread.sleep(1000);
					synchronized (this) {
						wait();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		final Thread main=Thread.currentThread();
		Thread t2=new Thread() {
			@Override
			public void run() {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//main.interrupt();
			}
		};
		
		t.start();
		t2.start();
		t.interrupt();
		/*try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
	}
}
