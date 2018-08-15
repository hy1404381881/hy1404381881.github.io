package net.jcip.examples;

import java.util.concurrent.*;

/**
 * InterruptBorrowedThread
 * <p/>
 * Scheduling an interrupt on a borrowed thread
 *
 * @author Brian Goetz and Tim Peierls
 */
public class TimedRun1 {
    private static final ScheduledExecutorService cancelExec = Executors.newScheduledThreadPool(1);

    public static void timedRun(Runnable r,
                                long timeout, TimeUnit unit) {
        final Thread taskThread = Thread.currentThread();
        cancelExec.schedule(new Runnable() {
            public void run() {
            	try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                taskThread.interrupt();
            }
        }, timeout, unit);
        r.run();
    }
    static class myRunable implements Runnable{

		public void run() {
			// TODO Auto-generated method stub
			System.out.println("内部任务");
		}
    	
    }
    public static void main(String[] args) throws InterruptedException {
    	
		timedRun(new TimedRun1.myRunable(),10000,TimeUnit.MILLISECONDS);
		while (!Thread.currentThread().isInterrupted()) {
			
              System.out.println(Thread.currentThread().getName()+"未被中断");
			
		}
		System.out.println(Thread.currentThread().getName()+"已经被中断");
	}
}
