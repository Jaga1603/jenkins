package com.wipro;

public class InterfaceExampleMain implements InterfaceExample {
	
	

	@Override
	public void add(int num1,int num2) {
		// TODO Auto-generated method stub
		System.out.println("The sum is "+(num1+num2));
		
	}

	@Override
	public void mul(int num1,int num2) {
		// TODO Auto-generated method stub
		System.out.println("The product is "+(num1*num2));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExampleMain i1=new InterfaceExampleMain();
        i1.add(1, 3);
        i1.mul(3, 5);
        i1.show();
        InterfaceExample.display();

	}
}
