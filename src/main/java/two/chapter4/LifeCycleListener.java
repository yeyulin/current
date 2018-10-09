package two.chapter4;
/**
 * 观察者接口
 * @author Administrator
 *
 */
public interface LifeCycleListener {
    
    void onEvent(ObservableRunnable.RunnableEvent event);
}
