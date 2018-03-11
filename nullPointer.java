package com.qa.Exceptions;

public class nullPointer {	
public static void main(String []arg){
	String str = null;
	try{
	System.out.println(str.length());
	}
	catch(NullPointerException e){
		System.out.println("String is null"+e);
		
	}
	finally{
		System.out.println("I will  execute even if there is exceptin or not ");
		
	}
}
}
