package current.chapter8;


public class DeadLock {
	private final Object LOCK=new Object();
	private OtherService otherService;

	public void setOtherService(OtherService otherServer) {
		this.otherService = otherServer;
	}
	
	public void m1() {
		synchronized (LOCK) {
			System.out.println("m1");
			otherService.s1();
		}
	}
	public void m2() {
		synchronized (LOCK) {
			System.out.println("m2");
		}
	}
}
