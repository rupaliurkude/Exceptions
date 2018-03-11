package com.qa.Exceptions;

public class AnyException {
	public void Arith(){
		int a = 10;
		int b = 0;
		try{
		int divide = a/b;
		System.out.println(divide);
		}
		catch(ArithmeticException e){
			System.out.println("This is Arith"+e);
		}
	System.out.println("b cannot be zero");
	}

	public static void main(String[] args) {
		AnyException a = new AnyException();
		a.Arith();
		
	}

}
