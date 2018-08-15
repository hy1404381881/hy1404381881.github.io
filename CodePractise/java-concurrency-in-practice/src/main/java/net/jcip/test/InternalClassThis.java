package net.jcip.test;

public class InternalClassThis {
	class MyThisTest{
		private void printLog() {			
			System.out.println("MyThisTest");
		}
		
	}
	public static void main(String[] args) {
		InternalClassThis internalClassThis=new InternalClassThis();
		MyThisTest myThisTest=internalClassThis.new MyThisTest();
		//myThisTest.printLog();
		//InternalClassThis.My
				
	}

}
