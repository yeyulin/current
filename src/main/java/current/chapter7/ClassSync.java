package current.chapter7;

public class ClassSync {
	static {
		synchronized (ClassSync.class) {
			System.out.println("class");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static synchronized void getOne() {
		System.out.println("one");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static synchronized void getTwo() {
		System.out.println("two");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static synchronized void getThree() {
		System.out.println("three");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public synchronized  void getFour() {
		System.out.println("Four");
		
	}
}
