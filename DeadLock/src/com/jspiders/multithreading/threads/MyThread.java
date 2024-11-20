package com.jspiders.multithreading.threads;
import com.jspiders.deadlock.resources.Resource;

public class MyThread extends Thread{
	private Resource resource1;
	private Resource resource2;
	
	public MyThread(Resource resource1,Resource resource2 ) {
		super();
		this.resource1 = resource1;
		this.resource2 = resource2;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		
		synchronized (resource1) {
			System.out.println("Thread1 has applied lock on resource1");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			synchronized (resource2) {
				System.out.println("Thread1 has applied lock on resource2");
			}
		}

	}

}
