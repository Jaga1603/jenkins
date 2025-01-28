package com.wipro.threads;

public class MyThread1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("This is a thread");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 mt=new MyThread1();
		Thread t=new Thread(mt);
		t.start();

	}

}
