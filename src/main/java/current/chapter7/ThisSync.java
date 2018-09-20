package current.chapter7;

public class ThisSync {
	private final Object MINTOR=new Object();
	public synchronized void getOne() {
		System.out.println("one");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public synchronized void getTwo() {
		System.out.println("two");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public synchronized void getThree() {
		System.out.println("three");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public  void getFour() {
		System.out.println("Four");
		
	}
	public  void getFive() {
		synchronized (MINTOR) {
			System.out.println("Four");
		}
	}
}
