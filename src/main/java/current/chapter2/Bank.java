package current.chapter2;

import java.util.HashMap;

public class Bank {
	public static void main(String[] args) {
		 Ticket ticket=new Ticket();
		Thread windowThread1 = new Thread(ticket, "һ�Ŵ���");
        Thread windowThread2 = new Thread(ticket, "���Ŵ���");
        Thread windowThread3 = new Thread(ticket, "���Ŵ���");
        windowThread1.start();
        windowThread2.start();
        windowThread3.start();
        
	}
   /* public static void testEfficient(String[] words){
    	HashMap<String, MutableInteger> counter = new HashMap<String, MutableInteger>();
    	for (String w : words) {
    		MutableInteger initValue = new MutableInteger(1);
    		// ���� HashMap ��put����������ֵ������
    		MutableInteger oldValue = counter.put(w, initValue);
    		if(oldValue != null){
    			initValue.set(oldValue.get() + 1);
    		}
    	}
    }*/
}
