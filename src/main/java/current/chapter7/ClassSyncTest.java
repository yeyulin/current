package current.chapter7;

public class ClassSyncTest {
	public static void main(String[] args) {
		ClassSync classSync=new ClassSync();
		Thread t=new Thread(()->{
			ClassSync.getOne();
		});
		Thread t2=new Thread(()->{
			ClassSync.getTwo();
		});
		Thread t3=new Thread(()->{
			ClassSync.getThree();
		});
		Thread t4=new Thread(()->{
			classSync.getFour();
		});
		t.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
