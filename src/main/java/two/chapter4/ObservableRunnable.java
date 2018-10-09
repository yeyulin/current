package two.chapter4;

public abstract class ObservableRunnable implements Runnable {

    final protected LifeCycleListener listener;

    public ObservableRunnable(final LifeCycleListener listener) {
        this.listener = listener;
    }
    /**
     * 回调通知观察者
     * @param event
     */
    protected void notifyChange(final RunnableEvent event) {
        listener.onEvent(event);
    }
    /**
	 * 线程的状态
	 */
    public enum RunnableState {
        RUNNING, ERROR, DONE
    }
    /**
	  * @author Administrator
	  * 线程的状态转换，以及其他的业务逻辑
	  */
    public static class RunnableEvent {
        private final RunnableState state;
        private final Thread thread;
        private final Throwable cause;

        public RunnableEvent(RunnableState state, Thread thread, Throwable cause) {
            this.state = state;
            this.thread = thread;
            this.cause = cause;
        }

        public RunnableState getState() {
            return state;
        }

        public Thread getThread() {
            return thread;
        }

        public Throwable getCause() {
            return cause;
        }
    }
}
