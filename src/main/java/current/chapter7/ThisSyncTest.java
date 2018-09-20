package current.chapter7;

public class ThisSyncTest {
	public static void main(String[] args) {
		ThisSync thisSync=new ThisSync();
		Thread t=new Thread(()->{
			thisSync.getOne();
		});
		Thread t2=new Thread(()->{
			thisSync.getTwo();
		});
		Thread t3=new Thread(()->{
			thisSync.getThree();
		});
		Thread t4=new Thread(()->{
			thisSync.getFour();
		});
		t.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
