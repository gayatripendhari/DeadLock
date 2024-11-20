package com.jspiders.multithreading.threads;
import com.jspiders.deadlock.resources.Resource;


public class MyThread1 extends Thread {
	private Resource resource1;
	private Resource resource2;
	
	public MyThread1(Resource resource1, Resource resource2) {
		super();
		this.resource1 = resource1;
		this.resource2 = resource2;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		
		synchronized ( resource2) {
			System.out.println("Thread2 has applied lock on resource2");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			synchronized (resource1) {
				System.out.println("Thread2 has applied lock on resource1");
				
			}
		}
	}

}
