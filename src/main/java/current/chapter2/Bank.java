package current.chapter2;

import java.util.HashMap;

public class Bank {
	public static void main(String[] args) {
		 Ticket ticket=new Ticket();
		Thread windowThread1 = new Thread(ticket, "一号窗口");
        Thread windowThread2 = new Thread(ticket, "二号窗口");
        Thread windowThread3 = new Thread(ticket, "三号窗口");
        windowThread1.start();
        windowThread2.start();
        windowThread3.start();
        
	}
   /* public static void testEfficient(String[] words){
    	HashMap<String, MutableInteger> counter = new HashMap<String, MutableInteger>();
    	for (String w : words) {
    		MutableInteger initValue = new MutableInteger(1);
    		// 利用 HashMap 的put方法弹出旧值的特性
    		MutableInteger oldValue = counter.put(w, initValue);
    		if(oldValue != null){
    			initValue.set(oldValue.get() + 1);
    		}
    	}
    }*/
}
