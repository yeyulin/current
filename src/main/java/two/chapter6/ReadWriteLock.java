package two.chapter6;

public class ReadWriteLock {
	//读
	private int readingReaders=0;
	//等待读
	private int waitingReaders=0;
	//写
	private int writingWriters=0;
	//等待写
	private int waitingWriters=0;
	//在测试中读锁一直强占资源，修改为略公平模式，偏爱写锁
	private boolean preferWriter=true;
	public ReadWriteLock() {
	        this(true);
	}

	public ReadWriteLock(boolean preferWriter) {
	        this.preferWriter = preferWriter;
	   }
	public synchronized void readLock() throws InterruptedException {
		//一获取读锁表示有线程在等待读
		this.waitingReaders++;
		try {
			//如果有线程在写就等待，阻塞到waitSet中
			while(this.writingWriters>0  || (this.preferWriter && this.waitingWriters > 0)) {
				this.wait();
			}
			//表示当前线程在读
			this.readingReaders++;
		} finally {
			this.waitingReaders--;
		}
	}
	public synchronized void unReadLock() {
		//释放读锁时，就减去等待读，唤醒全部
		this.readingReaders--;
		this.notifyAll();
	}
	public synchronized void writeLock() throws InterruptedException {
		//等待写的锁加一
		this.waitingWriters++;
		try {
			//当有线程在读或写时，阻塞
			while(this.readingReaders>0 || this.writingWriters>0) {
				this.wait();
			}
			//写线程 工作
			this.writingWriters++;
		} finally {
			this.waitingWriters--;
		}
	}
	public synchronized void unWriteLock() {
		this.writingWriters--;
		this.notifyAll();
	}
}
