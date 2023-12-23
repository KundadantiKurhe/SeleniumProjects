package com.java.brushup;

public class MethodsDemo1 {

	public static void main(String[] args) {
	
		MethodsDemo1 d1 = new MethodsDemo1();
		String name = d1.getData();
		System.out.println(name);
		getData2();
		
		MethodDemo2 d2 =new MethodDemo2();
		String name2 = d2.getUserData();
		System.out.println(name2);
		
	}
	
	public String getData() {
		System.out.println ("hello world");
		return "Hello world";
	}
	
	public static String getData2() {
		System.out.println ("hello world");
		return "Hello world";
	}
}
