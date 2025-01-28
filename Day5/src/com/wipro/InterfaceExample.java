package com.wipro;

public interface InterfaceExample {
	void add(int num1,int num2);
	void mul(int num1,int num2);
	default void show() {
		System.out.println("this is default method");
	}
	static void display() {
		System.out.println("this is static method");
	}
}
