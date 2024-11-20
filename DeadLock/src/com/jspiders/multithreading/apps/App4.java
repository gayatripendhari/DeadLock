package com.jspiders.multithreading.apps;
import com.jspiders.deadlock.resources.Resource;
import com.jspiders.multithreading.threads.MyThread;
import com.jspiders.multithreading.threads.MyThread1;

public class App4 {
	public static void main(String[] args) {
		Resource resource1 = new Resource();
		Resource resource2 = new Resource();
		
		MyThread thread1 = new MyThread(resource1, resource2) ;
		thread1.setPriority(1);
		
		MyThread1 thread2 =new MyThread1(resource1,resource2);
		
		thread2.setPriority(10);
		
		thread1.start();
		thread1.start();
	}
}
