package com.wipro.threads;

public class MyThread extends Thread {
	public void run() {
		System.out.println("The thread is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt=new MyThread();
		mt.start();

	}

}
