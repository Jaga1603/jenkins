package com.wipro;

public class PrimeException extends Exception {
	public PrimeException(String message) {
		super(message);
	}
	public static void checkPrime(int num) throws PrimeException{
		if(num<=1) {
			throw new PrimeException("This is prime number Exception");
		}
		for (int i=2;i<=num/2;i++) {
			if(num%i==0) {
				throw new PrimeException("This is prime number Exception");
				
			}
		}
		System.out.println("This is prime number");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            checkPrime(29);// prime number
            checkPrime(15);// not prime number
        } catch (PrimeException e) {
            System.out.println(e.getMessage());
        }

	}

}
