package net.jcip.examples;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.*;

/**
 * PrimeProducer
 * <p/>
 * Using interruption for cancellation
 *
 * @author Brian Goetz and Tim Peierls
 */
public class PrimeProducer extends Thread {
	private final BlockingQueue<BigInteger> queue;

	PrimeProducer(BlockingQueue<BigInteger> queue) {
		this.queue = queue;
	}

	public void run() {
		try {
			BigInteger p = BigInteger.ONE;
			while (!Thread.currentThread().isInterrupted())
				queue.put(p = p.nextProbablePrime());
			
		} catch (InterruptedException consumed) {
			/* Allow thread to exit */
			System.out.println("线程被中断");
		}
	}

	public void cancel() {
		interrupt();
	}

	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<BigInteger> queue = new LinkedBlockingQueue<BigInteger>();
		PrimeProducer primeProducer = new PrimeProducer(queue);
		primeProducer.start();
		Thread.sleep(5000);
		primeProducer.interrupt();
	}
}
