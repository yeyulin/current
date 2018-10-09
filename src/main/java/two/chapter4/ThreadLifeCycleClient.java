package two.chapter4;


import java.util.Arrays;

/***
 * 测试
 * @author Administrator
 *
 */
public class ThreadLifeCycleClient {
    public static void main(String[] args) {
        new ThreadLifeCycleObserver().concurrentQuery(Arrays.asList("1", "2"));
    }
}