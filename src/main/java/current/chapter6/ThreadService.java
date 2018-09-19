package current.chapter6;


public class ThreadService {
    private Thread executeThread;
    private boolean finished = false;
    public void execute(Runnable task) {
        executeThread = new Thread() {
            @Override
            public void run() {
                Thread runner = new Thread(task);
                runner.setDaemon(true);
                runner.start();
                try {
                    runner.join();
                    finished = true;
                } catch (InterruptedException e) {
                }
            }
        };
        executeThread.start();
    }
    public void shutdown(long mills) {
        long currentTime = System.currentTimeMillis();
        while (!finished) {
            if ((System.currentTimeMillis() - currentTime) >= mills) {
                System.out.println("中断线程!");
                executeThread.interrupt();
                break;
            }
            try {
                executeThread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("执行线程被中断!");
                break;
            }
        }
        finished = false;
    }
}