package com.singleton;

public enum SingletonEnum{
	INSTANCE;
	public static int count = 0;
	int a = 0;
	private SingletonEnum(){
		System.out.println("Test");
		System.out.println(++a);
	}
	
}
