package net.jcip.test;

import java.security.Signature;

public class TestMain extends Thread {
	@Override

	public void run() {

		for (int i = 0; i < 10; i++) {
             System.out.println(" now i is "+i);
             if(i==8) {
            	 continue;
             }
		}
		System.out.println("thread run is over!");
	}

	public static void main(String[] args) {

		TestMain t1 = new TestMain();


		t1.start();


	}

}
